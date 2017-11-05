/*
 * Copyright (C) 2014, United States Government, as represented by the
 * Administrator of the National Aeronautics and Space Administration.
 * All rights reserved.
 *
 * Symbolic Pathfinder (jpf-symbc) is licensed under the Apache License, 
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 * 
 *        http://www.apache.org/licenses/LICENSE-2.0. 
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and 
 * limitations under the License.
 */

package gov.nasa.jpf.symbc;

import gov.nasa.jpf.Config;
import gov.nasa.jpf.JPF;
import gov.nasa.jpf.ListenerAdapter;
import gov.nasa.jpf.PropertyListenerAdapter;
import gov.nasa.jpf.vm.ChoiceGenerator;
import gov.nasa.jpf.vm.ClassInfo;
import gov.nasa.jpf.vm.DynamicElementInfo;
import gov.nasa.jpf.vm.ElementInfo;
import gov.nasa.jpf.vm.FieldInfo;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.LocalVarInfo;
import gov.nasa.jpf.vm.MethodInfo;
import gov.nasa.jpf.vm.StackFrame;
import gov.nasa.jpf.vm.ThreadInfo;
import gov.nasa.jpf.vm.Types;
import gov.nasa.jpf.vm.VM;
import gov.nasa.jpf.jvm.bytecode.ARETURN;
import gov.nasa.jpf.jvm.bytecode.DRETURN;
import gov.nasa.jpf.jvm.bytecode.FRETURN;
import gov.nasa.jpf.jvm.bytecode.IRETURN;
import gov.nasa.jpf.jvm.bytecode.JVMInvokeInstruction;
import gov.nasa.jpf.jvm.bytecode.LRETURN;
import gov.nasa.jpf.jvm.bytecode.JVMReturnInstruction;
import gov.nasa.jpf.report.ConsolePublisher;
import gov.nasa.jpf.report.Publisher;
import gov.nasa.jpf.report.PublisherExtension;
import gov.nasa.jpf.search.Search;
import gov.nasa.jpf.symbc.bytecode.BytecodeUtils;
import gov.nasa.jpf.symbc.bytecode.INVOKESTATIC;
import gov.nasa.jpf.symbc.concolic.PCAnalyzer;
import gov.nasa.jpf.symbc.numeric.Comparator;
import gov.nasa.jpf.symbc.numeric.Expression;
import gov.nasa.jpf.symbc.numeric.IntegerConstant;
import gov.nasa.jpf.symbc.numeric.IntegerExpression;
import gov.nasa.jpf.symbc.numeric.PCChoiceGenerator;
import gov.nasa.jpf.symbc.numeric.PathCondition;
import gov.nasa.jpf.symbc.numeric.RealConstant;
import gov.nasa.jpf.symbc.numeric.RealExpression;
import gov.nasa.jpf.symbc.numeric.SymbolicInteger;
import gov.nasa.jpf.symbc.numeric.SymbolicReal;
import gov.nasa.jpf.symbc.string.DerivedStringExpression;
import gov.nasa.jpf.symbc.string.StringExpression;
import gov.nasa.jpf.symbc.numeric.SymbolicConstraintsGeneral;
//import gov.nasa.jpf.symbc.numeric.SymbolicInteger;

import gov.nasa.jpf.util.Pair;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.Vector;

import choco.cp.solver.constraints.global.geost.dataStructures.LinkedList;

public class SymbolicListener extends ListenerAdapter implements PublisherExtension {

	/*
	 * Locals to preserve the value that was held by JPF prior to changing it in
	 * order to turn off state matching during symbolic execution no longer
	 * necessary because we run spf stateless
	 */

	private Map<String, MethodSummary> allSummaries;
	private String currentMethodName = "";
	// private String result = "";
	// private HashMap<String, ArrayList<VulPart>> vulResult = new HashMap<>();
	private VulnerabiltyResult vulResult = new VulnerabiltyResult();
	private ArrayList<VulPart> vulArrayList = new ArrayList<>();
	private boolean sinkMethodFound = false;
	private String resultofLeakage;
	private int warningCounter = 1;
	private int dangerCounter = 1;

	public SymbolicListener(Config conf, JPF jpf) {
		jpf.addPublisherExtension(ConsolePublisher.class, this);
		allSummaries = new HashMap<String, MethodSummary>();
	}

	// Writes the method summaries to a file for use in another application
	// private void writeTable(){
	// try {
	// BufferedWriter out = new BufferedWriter(new FileWriter("outFile.txt"));
	// Iterator it = allSummaries.entrySet().iterator();
	// String line = "";
	// while (it.hasNext()){
	// Map.Entry me = (Map.Entry)it.next();
	// String methodName = (String)me.getKey();
	// MethodSummary ms = (MethodSummary)me.getValue();
	// line = "METHOD: " + methodName + "," +
	// ms.getMethodName() + "(" + ms.getArgValues() + ")," +
	// ms.getMethodName() + "(" + ms.getSymValues() + ")";
	// out.write(line);
	// out.newLine();
	// Vector<Pair> pathConditions = ms.getPathConditions();
	// if (pathConditions.size() > 0){
	// Iterator it2 = pathConditions.iterator();
	// while(it2.hasNext()){
	// Pair pcPair = (Pair)it2.next();
	// String pc = (String)pcPair.a;
	// String errorMessage = (String)pcPair.b;
	// line = pc;
	// if (!errorMessage.equalsIgnoreCase(""))
	// line = line + "$" + errorMessage;
	// out.write(line);
	// out.newLine();
	// }
	// }
	// }
	// out.close();
	// } catch (Exception e) {
	// }
	// }
	// اگه یه جایی پراپرتی نقض شد این تابع فراخوانی میشه.
	// می ره آخرین نقطه انتخاب که بر اساس پی سی هست رو پیدا می کنه
	// خطا رو بر میداره همراه با پی سی کنار هم چاپ می کنه و داخل خلاصه متد نگهداری
	// می کنه
	@Override
	public void stateAdvanced(Search search) {

		VM vm = search.getVM();
		ThreadInfo ti = vm.getCurrentThread();
		StackFrame sf = ti.getTopFrame();
		if (sf != null) {
			MethodInfo mi = sf.getMethodInfo();
			String methodName = mi.getBaseName();
			System.err.println(methodName);
		}
	}

	@Override
	public void propertyViolated(Search search) {

		VM vm = search.getVM();

		ChoiceGenerator<?> cg = vm.getChoiceGenerator();
		if (!(cg instanceof PCChoiceGenerator)) {
			ChoiceGenerator<?> prev_cg = cg.getPreviousChoiceGenerator();
			while (!((prev_cg == null) || (prev_cg instanceof PCChoiceGenerator))) {
				prev_cg = prev_cg.getPreviousChoiceGenerator();
			}
			cg = prev_cg;
		}
		if ((cg instanceof PCChoiceGenerator) && ((PCChoiceGenerator) cg).getCurrentPC() != null) {
			PathCondition pc = ((PCChoiceGenerator) cg).getCurrentPC();
			String error = search.getLastError().getDetails();
			error = "\"" + error.substring(0, error.indexOf("\n")) + "...\"";
			// C: not clear where result was used here -- to review
			// PathCondition result = new PathCondition();
			// IntegerExpression sym_err = new SymbolicInteger("ERROR");
			// IntegerExpression sym_value = new SymbolicInteger(error);
			// result._addDet(Comparator.EQ, sym_err, sym_value);
			// solve the path condition, then print it
			// pc.solve();
			if (SymbolicInstructionFactory.concolicMode) { // TODO: cleaner
				SymbolicConstraintsGeneral solver = new SymbolicConstraintsGeneral();
				PCAnalyzer pa = new PCAnalyzer();
				pa.solve(pc, solver);
			} else
				pc.solve();

			Pair<String, String> pcPair = new Pair<String, String>(pc.toString(), error);// (pc.toString(),error);

			// String methodName = vm.getLastInstruction().getMethodInfo().getName();
			MethodSummary methodSummary = allSummaries.get(currentMethodName);
			if (methodSummary == null)
				methodSummary = new MethodSummary();
			methodSummary.addPathCondition(pcPair);
			allSummaries.put(currentMethodName, methodSummary);
			System.out.println("Property Violated: PC is " + pc.toString());
			System.out.println("Property Violated: result is  " + error);
			System.out.println("****************************");
		}
		// }
	}

	// در این متد دو حالت بررسی می شود. وقتی یک متد فراخوانی میشه و وقتی ریترن میشه.
	// وقتی متد فراخوانی میشه. اطالاعات متد مثل نام آرگومان ها تایپشون و نمادین یا
	// عینی بودنشون در میاره می ریزه توی خلاصه متدها

	@Override
	public void instructionExecuted(VM vm, ThreadInfo currentThread, Instruction nextInstruction,
			Instruction executedInstruction) {

		if (!vm.getSystemState().isIgnored()) {
			Instruction insn = executedInstruction;
			// SystemState ss = vm.getSystemState();
			ThreadInfo ti = currentThread;
			Config conf = vm.getConfig();

			if (insn instanceof JVMInvokeInstruction) {
				JVMInvokeInstruction md = (JVMInvokeInstruction) insn;
				String methodName = md.getInvokedMethodName();
				int numberOfArgs = md.getArgumentValues(ti).length;

				MethodInfo mi = md.getInvokedMethod();
				ClassInfo ci = mi.getClassInfo();
				String className = ci.getName();

				StackFrame sf = ti.getTopFrame();
				String shortName = methodName;
				String longName = mi.getLongName();
				if (methodName.contains("("))
					shortName = methodName.substring(0, methodName.indexOf("("));

				if (!mi.equals(sf.getMethodInfo()))
					return;
				/*
				 * MY CODE!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
				 */
				/*
				 * if(isNextInstructionInputMethod(nextInstruction)) { //TODO change the next
				 * instruction to makeSymbolicRef() result="change"; }
				 */

				if (isLeakageMethod(shortName, longName, className)) {
					String[] symList = isInputOfLeakageMethodSymbolic(sf, shortName);
					// instead of sink method, i should trace the symbolic var till target method
					if (symList != null) {
						VulPart vp = new VulPart();
						vp.setHeader("-----------------INFO OF OBJECT THAT CAUSE LEAKAGE--------------\n\n");
						vp.setContent(new String[] { "Method is " + className + "." + shortName + "()\n" });
						vp.setEnd("\n-----------------END OF OBJECT INFO----------------------------\n\n");
						// String out = "-----------------INFO OF OBJECT THAT CAUSE
						// LEAKAGE--------------\n\n"
						// + "Method is " + className + "." + shortName + "()\n"
						// + "\n-----------------END OF OBJECT INFO----------------------------\n\n";
						// if (!result.contains(out)) {
						// result += out;
						// }

						vulResult.putLeakgeMethod(vp, symList);
						sinkMethodFound = false;
					}

				}
				if (isMethodSink(shortName, longName, className)) {
					// result += "\n\n-----------------STACK TRACE OF CURRENT APPLICATION RUN";
					HashMap<String, String> symList = isInputOfMethodSymbolic(sf, shortName);
					if (symList != null && !symList.isEmpty()) {
						VulPart vp = new VulPart();
						vp.setHeader(
								"\n\n-----------------STACK TRACE OF CURRENT APPLICATION RUN FOR CATCHING VULNERABILITY--------------\n\n");
						// result += " FOR CATCHING VULNERABILITY--------------\n\n";
						vp.setContent(makeStackTrace(sf));
						// result += makeStackTrace(sf);
						vp.setEnd("\n-----------------END OF STACK TRACE--------------\n\n");
						// result += "-----------------INFO OF INPUTS OF APP THAT CAUSE INJECTION
						// VULNERABILITY--------------\n\n";
						vulArrayList.add(vp);
						VulPart vp2 = new VulPart();
						vp2.setHeader(
								"-----------------INFO OF INPUTS OF APP THAT CAUSE INJECTION VULNERABILITY--------------\n\n");
						int counter = 0;
						String res[] = new String[symList.size()];
						for (String id : symList.keySet()) {
							res[counter] = id + " developer sanitizer for this input is " + symList.get(id);
							counter++;
						}
						vp2.setContent(res);
						vp2.setEnd("\n-----------------END OF NAME OF IDS----------------------------\n\n");
						// result += "\n-----------------END OF NAME OF
						// IDS----------------------------\n\n";
						vulArrayList.add(vp2);
						sinkMethodFound = true;
						vulResult.put("VUL_" + dangerCounter, (ArrayList<VulPart>) vulArrayList.clone());
						dangerCounter++;
						vulArrayList.clear();
					} else {
						// VulPart vp = new VulPart();
						// vp.setHeader(
						// "\n\n-----------------STACK TRACE OF CURRENT APPLICATION RUN FOR WARNING
						// ABOUT A DANGEROUS PATH--------------\n\n");
						// // result += " FOR WARNING ABOUT A DANGEROUS PATH--------------\n\n";
						// // result += makeStackTrace(sf);
						// vp.setContent(makeStackTrace(sf));
						// vp.setEnd("\n-----------------END OF STACK TRACE--------------\n\n");
						// vulArrayList.add(vp);
						// vulResult.put("WARNING_" + warningCounter, (ArrayList<VulPart>)
						// vulArrayList.clone());
						// warningCounter++;
						// vulArrayList.clear();
						// sinkMethodFound = false;
					}
				}

				if ((BytecodeUtils.isClassSymbolic(conf, className, mi, methodName))
						|| BytecodeUtils.isMethodSymbolic(conf, mi.getFullName(), numberOfArgs, null)) {

					MethodSummary methodSummary = new MethodSummary();

					methodSummary.setMethodName(className + "." + shortName);
					Object[] argValues = md.getArgumentValues(ti);
					String argValuesStr = "";
					for (int i = 0; i < argValues.length; i++) {
						argValuesStr = argValuesStr + argValues[i];
						if ((i + 1) < argValues.length)
							argValuesStr = argValuesStr + ",";
					}
					methodSummary.setArgValues(argValuesStr);
					byte[] argTypes = mi.getArgumentTypes();
					String argTypesStr = "";
					for (int i = 0; i < argTypes.length; i++) {
						argTypesStr = argTypesStr + argTypes[i];
						if ((i + 1) < argTypes.length)
							argTypesStr = argTypesStr + ",";
					}
					methodSummary.setArgTypes(argTypesStr);

					// get the symbolic values (changed from constructing them here)
					String symValuesStr = "";
					String symVarNameStr = "";

					LocalVarInfo[] argsInfo = mi.getArgumentLocalVars();

					if (argsInfo == null)
						throw new RuntimeException("ERROR: you need to turn debug option on");

					int sfIndex = 1; // do not consider implicit param "this"
					int namesIndex = 1;
					if (md instanceof INVOKESTATIC) {
						sfIndex = 0; // no "this" for static
						namesIndex = 0;
					}

					for (int i = 0; i < numberOfArgs; i++) {
						Expression expLocal = (Expression) sf.getLocalAttr(sfIndex);
						if (expLocal != null) // symbolic
							symVarNameStr = expLocal.toString();
						else
							symVarNameStr = argsInfo[namesIndex].getName() + "_CONCRETE" + ",";
						// TODO: what happens if the argument is an array?
						symValuesStr = symValuesStr + symVarNameStr + ",";
						sfIndex++;
						namesIndex++;
						if (argTypes[i] == Types.T_LONG || argTypes[i] == Types.T_DOUBLE)
							sfIndex++;

					}

					// get rid of last ","
					if (symValuesStr.endsWith(",")) {
						symValuesStr = symValuesStr.substring(0, symValuesStr.length() - 1);
					}
					methodSummary.setSymValues(symValuesStr);

					currentMethodName = longName;
					allSummaries.put(longName, methodSummary);
				}
			} else if (insn instanceof JVMReturnInstruction) {
				MethodInfo mi = insn.getMethodInfo();
				ClassInfo ci = mi.getClassInfo();
				if (null != ci) {
					String className = ci.getName();
					String methodName = mi.getName();
					String longName = mi.getLongName();
					int numberOfArgs = mi.getNumberOfArguments();

					if (((BytecodeUtils.isClassSymbolic(conf, className, mi, methodName))
							|| BytecodeUtils.isMethodSymbolic(conf, mi.getFullName(), numberOfArgs, null))) {

						ChoiceGenerator<?> cg = vm.getChoiceGenerator();
						if (!(cg instanceof PCChoiceGenerator)) {
							ChoiceGenerator<?> prev_cg = cg.getPreviousChoiceGenerator();
							while (!((prev_cg == null) || (prev_cg instanceof PCChoiceGenerator))) {
								prev_cg = prev_cg.getPreviousChoiceGenerator();
							}
							cg = prev_cg;
						}
						if ((cg instanceof PCChoiceGenerator) && ((PCChoiceGenerator) cg).getCurrentPC() != null) {
							PathCondition pc = ((PCChoiceGenerator) cg).getCurrentPC();
							// pc.solve(); //we only solve the pc
							if (SymbolicInstructionFactory.concolicMode) { // TODO: cleaner
								SymbolicConstraintsGeneral solver = new SymbolicConstraintsGeneral();
								PCAnalyzer pa = new PCAnalyzer();
								pa.solve(pc, solver);
							} else
								pc.solve();

							if (!PathCondition.flagSolved) {
								return;
							}

							// after the following statement is executed, the pc loses its solution

							String pcString = pc.toString();// pc.stringPC();
							Pair<String, String> pcPair = null;

							String returnString = "";

							Expression result = null;

							if (insn instanceof IRETURN) {
								IRETURN ireturn = (IRETURN) insn;
								int returnValue = ireturn.getReturnValue();
								IntegerExpression returnAttr = (IntegerExpression) ireturn.getReturnAttr(ti);
								if (returnAttr != null) {
									returnString = "Return Value: " + String.valueOf(returnAttr.solution());
									result = returnAttr;
								} else { // concrete
									returnString = "Return Value: " + String.valueOf(returnValue);
									result = new IntegerConstant(returnValue);
								}
							} else if (insn instanceof LRETURN) {
								LRETURN lreturn = (LRETURN) insn;
								long returnValue = lreturn.getReturnValue();
								IntegerExpression returnAttr = (IntegerExpression) lreturn.getReturnAttr(ti);
								if (returnAttr != null) {
									returnString = "Return Value: " + String.valueOf(returnAttr.solution());
									result = returnAttr;
								} else { // concrete
									returnString = "Return Value: " + String.valueOf(returnValue);
									result = new IntegerConstant((int) returnValue);
								}
							} else if (insn instanceof DRETURN) {
								DRETURN dreturn = (DRETURN) insn;
								double returnValue = dreturn.getReturnValue();
								RealExpression returnAttr = (RealExpression) dreturn.getReturnAttr(ti);
								if (returnAttr != null) {
									returnString = "Return Value: " + String.valueOf(returnAttr.solution());
									result = returnAttr;
								} else { // concrete
									returnString = "Return Value: " + String.valueOf(returnValue);
									result = new RealConstant(returnValue);
								}
							} else if (insn instanceof FRETURN) {

								FRETURN freturn = (FRETURN) insn;
								double returnValue = freturn.getReturnValue();
								RealExpression returnAttr = (RealExpression) freturn.getReturnAttr(ti);
								if (returnAttr != null) {
									returnString = "Return Value: " + String.valueOf(returnAttr.solution());
									result = returnAttr;
								} else { // concrete
									returnString = "Return Value: " + String.valueOf(returnValue);
									result = new RealConstant(returnValue);
								}

							} else if (insn instanceof ARETURN) {
								ARETURN areturn = (ARETURN) insn;
								IntegerExpression returnAttr = (IntegerExpression) areturn.getReturnAttr(ti);
								if (returnAttr != null) {
									returnString = "Return Value: " + String.valueOf(returnAttr.solution());
									result = returnAttr;
								} else {// concrete
									DynamicElementInfo val = (DynamicElementInfo) areturn.getReturnValue(ti);

									// System.out.println("string "+val.asString());
									returnString = "Return Value: " + val.asString();
									// DynamicElementInfo val = (DynamicElementInfo)areturn.getReturnValue(ti);
									String tmp = val.asString();
									tmp = tmp.substring(tmp.lastIndexOf('.') + 1);
									result = new SymbolicInteger(tmp);

								}

							}

							else // other types of return
								returnString = "Return Value: --";
							// pc.solve();
							// not clear why this part is necessary
							/*
							 * if (SymbolicInstructionFactory.concolicMode) { //TODO: cleaner
							 * SymbolicConstraintsGeneral solver = new SymbolicConstraintsGeneral();
							 * PCAnalyzer pa = new PCAnalyzer(); pa.solve(pc,solver); } else pc.solve();
							 */

							pcString = pc.toString();
							pcPair = new Pair<String, String>(pcString, returnString);
							MethodSummary methodSummary = allSummaries.get(longName);
							Vector<Pair> pcs = methodSummary.getPathConditions();
							if ((!pcs.contains(pcPair)) && (pcString.contains("SYM"))) {
								methodSummary.addPathCondition(pcPair);
							}

							if (allSummaries.get(longName) != null) // recursive call
								longName = longName;// + methodSummary.hashCode(); // differentiate the key for
													// recursive calls
							allSummaries.put(longName, methodSummary);
							if (SymbolicInstructionFactory.debugMode) {
								System.out.println("*************Summary***************");
								System.out.println("PC is:" + pc.toString());
								if (result != null) {
									System.out.println("Return is:  " + result);
									System.out.println("***********************************");
								}
							}
						}
					}
				}
			}
		}
	}

	private String[] isInputOfLeakageMethodSymbolic(StackFrame sf, String shortName) {
		Object[] obj = sf.getSlotAttrs();
		if (obj != null) {
			for (Object object : obj) {
				if (object != null) {
					if (object instanceof DerivedStringExpression) {
						DerivedStringExpression query = (DerivedStringExpression) object;
						if (!query.trackedSymVars.isEmpty()) {
							HashMap<String, String> symList = new HashMap<>(query.trackedSymVars.size());
							for (int i = 0; i < query.trackedSymVars.size(); i++) {
								String tmp = query.trackedSymVars.get(i);
								if (query.toString().contains(tmp)) {
									return makeStackTrace(sf.getPrevious());
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	private class VulnerabiltyResult {
		private HashMap<String, ArrayList<VulPart>> result;

		public VulnerabiltyResult() {
			result = new HashMap<>();
		}

		public void putLeakgeMethod(VulPart vp, String[] symList) {
			Iterator<ArrayList<VulPart>> it = result.values().iterator();
			while (it.hasNext()) {
				ArrayList<VulPart> array = it.next();
				if (array.get(0).isContentContain(symList)) {
					if (array.size() < 3)
						array.add(vp);
				}
			}

		}

		public String printVulResult() {
			String report = "";
			Iterator<String> res = result.keySet().iterator();
			while (res.hasNext()) {
				String key = res.next();
				for (VulPart vp : result.get(key)) {
					report += vp.getHeader() + vp.getContentToStringForPrint() + vp.getEnd();
				}
			}
			return report;
		}

		public void put(String key, ArrayList<VulPart> arrayResult) {
			// if (key.contains("WARNING_")) {
			// Iterator<String> it = result.keySet().iterator();
			// if (!it.hasNext()) {
			// result.put(key, arrayResult);
			// return;
			// }
			// while (it.hasNext()) {
			// String in = it.next();
			// if (!in.contains("WARNING_"))
			// continue;
			// ArrayList<VulPart> value = result.get(in);
			// for (int i = 0; i < value.size(); i++) {
			// if
			// (value.get(i).getContentToString().contains(arrayResult.get(i).getContentToString()))
			// {
			// continue;
			// } else if
			// (!arrayResult.get(i).getContentToString().equals(value.get(i).getContentToString())
			// && arrayResult.get(i).getContentToString()
			// .contains(value.get(i).getContentToString())) {
			// if (i > 0) {
			// result.get(in).remove(i);
			// result.get(in).add(arrayResult.get(i));
			// return;
			// } else if (i == 0) {
			// result.replace(in, arrayResult);
			// return;
			// }
			// } else {
			// result.put(key, arrayResult);
			// return;
			// }
			// }
			// }
			// } else if (key.contains("VUL_")) {
			if (result.isEmpty()) {
				result.put(key, arrayResult);
				return;
			}
			Iterator<String> it = result.keySet().iterator();
			while (it.hasNext()) {
				String in = it.next();
				ArrayList<VulPart> value = result.get(in);
				for (int i = 0; i < value.size(); i++) {
					if (value.get(i).getContent().equals(arrayResult.get(i).getContent())) {
						continue;
					} else if (!arrayResult.get(i).getContent().equals(value.get(i).getContent())
							&& arrayResult.get(i).getContentToString().contains(value.get(i).getContentToString())) {
						if (i == 0) {
							if (arrayResult.get(1).getContent().equals(value.get(1).getContent())) {
								result.get(in).remove(value);
								result.put(key, arrayResult);
								return;
							} else {
								continue;
							}
						} else if (i == 1) {
							result.put(key, arrayResult);
							return;
						}
					} else {
						result.put(key, arrayResult);
						return;
					}
				}

			}
		}
	}

	private class VulPart {
		private String header = "";
		private String end = "";
		private String content[] = null;

		public boolean isContentContain(String[] con) {
			String in = "";
			String out = "";
			for (String c : con)
				in += c;
			for (String c : content) {
				out += c;
			}
			if (in.contains(out) || out.contains(in)) {
				return true;
			}
			return false;
		}

		public String getHeader() {
			return header;
		}

		public void setHeader(String header) {
			this.header = header;
		}

		public String getEnd() {
			return end;
		}

		public void setEnd(String end) {
			this.end = end;
		}

		public String[] getContent() {
			return content;
		}

		public String getContentToString() {
			String res = "";
			for (String s : content) {
				res += s;
			}
			return res;
		}

		public String getContentToStringForPrint() {
			String res = "";
			int counter = 1;
			for (String s : content) {
				res += counter + ") " + s + "\n";
				counter++;
			}
			return res;
		}

		public void setContent(String[] strings) {
			this.content = strings;
		}
	}

	private boolean isNextInstructionInputMethod(Instruction nextInstruction) {
		if (nextInstruction.getMethodInfo().getName().contains("findViewById")) {
			// nextInstruction.
			return true;
		}
		return false;
	}

	private boolean isLeakageMethod(String shortName, String longName, String className) {
		if (shortName.equals("setText") && className.equals("android.widget.TextView")) {
			return true;
		} else
			return false;
	}

	private String[] makeStackTrace(StackFrame sf) {
		String stackTrace[] = new String[sf.getDepth()];
		int counter = 0;

		while (sf.getPrevious() != null) {
			String mn = sf.getClassName();
			mn += "." + sf.getMethodInfo().getLongName();

			stackTrace[counter] = mn;
			sf = sf.getPrevious();
			counter++;
		}
		return stackTrace;
	}

	private HashMap<String, String> isInputOfMethodSymbolic(StackFrame sf, String shortName) {
		Object[] obj = sf.getSlotAttrs();
		if (obj != null) {
			for (Object object : obj) {
				if (object != null) {
					if (object instanceof DerivedStringExpression) {
						DerivedStringExpression query = (DerivedStringExpression) object;
						if (!query.trackedSymVars.isEmpty()) {
							HashMap<String, String> symList = new HashMap<>(query.trackedSymVars.size());
							for (int i = 0; i < query.trackedSymVars.size(); i++) {
								String tmp = query.trackedSymVars.get(i);
								if (query.toString().contains(tmp))
									// TODO need attention. it should be debugged!!!
									if (shortName.equals("update") || shortName.equals("delete")
											|| shortName.equals("updateWithOnConflict")) {
										if (query.toString().contains("?"))
											symList.put(tmp, "ON");
										else
											symList.put(tmp, "OFF");
									}

								if (shortName.equals("execSQL")) {
									if (query.toString().toLowerCase().contains("update")
											|| query.toString().toLowerCase().contains("delete")) {
										if (tmp.contains("[")) {
											if (query.toString().contains("?"))
												symList.put(tmp.substring(0, tmp.indexOf('[')), "ON");
											else
												symList.put(tmp.substring(0, tmp.indexOf('[')), "OFF");
										} else {
											if (query.toString().contains("?"))
												symList.put(tmp, "ON");
											else
												symList.put(tmp, "OFF");
										}
									} else {
										return null;
									}
								} else {
									if (tmp.contains("[")) {
										if (query.toString().contains("?"))
											symList.put(tmp.substring(0, tmp.indexOf('[')), "ON");
										else
											symList.put(tmp.substring(0, tmp.indexOf('[')), "OFF");
									} else {
										if (query.toString().contains("?"))
											symList.put(tmp, "ON");
										else
											symList.put(tmp, "OFF");
									}
								}
							}
							return symList;
						}
					}
				}
			}
		}

		return null;
	}

	private boolean isMethodSink(String shortName, String longName, String className) {
		String sinks[] = { "android.database.sqlite.SQLiteDatabase.rawQuery",
				"android.database.sqlite.SQLiteDatabase.rawQueryWithFactory",
				"android.database.sqlite.SQLiteDatabase.query", "android.database.sqlite.SQLiteDatabase.update",
				"android.database.sqlite.SQLiteDatabase.queryWithFactory",
				"android.database.sqlite.SQLiteDatabase.delete",
				"android.database.sqlite.SQLiteDatabase.updateWithOnConflict",
				"android.database.sqlite.SQLiteDatabase.execSQL" };

		for (String sink : sinks)
			if (sink.equals(className + "." + shortName)) {
				return true;
			}

		return false;
	}

	private HashMap<String, String> readSinksFromfile() {
		HashMap<String, String> list = new HashMap<>();
		try (BufferedReader br = new BufferedReader(new FileReader(""))) {
			String line;
			int counter = 1;
			while ((line = br.readLine()) != null) {
				list.put(counter + "", line);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	/*
	 * The way this method works is specific to the format of the methodSummary data
	 * structure
	 */

	// TODO: needs to be changed not to use String representations
	private void printMethodSummary(PrintWriter pw, MethodSummary methodSummary) {

		System.out.println("Inputs: " + methodSummary.getSymValues());
		Vector<Pair> pathConditions = methodSummary.getPathConditions();
		if (pathConditions.size() > 0) {
			Iterator it = pathConditions.iterator();
			String allTestCases = "";
			while (it.hasNext()) {
				String testCase = methodSummary.getMethodName() + "(";
				Pair pcPair = (Pair) it.next();
				String pc = (String) pcPair._1;
				String errorMessage = (String) pcPair._2;
				String symValues = methodSummary.getSymValues();
				String argValues = methodSummary.getArgValues();
				String argTypes = methodSummary.getArgTypes();

				StringTokenizer st = new StringTokenizer(symValues, ",");
				StringTokenizer st2 = new StringTokenizer(argValues, ",");
				StringTokenizer st3 = new StringTokenizer(argTypes, ",");
				if (!argTypes.isEmpty() && argValues.isEmpty()) {
					continue;
				}
				while (st2.hasMoreTokens()) {
					String token = "";
					String actualValue = st2.nextToken();
					byte actualType = Byte.parseByte(st3.nextToken());
					if (st.hasMoreTokens())
						token = st.nextToken();
					if (pc.contains(token)) {
						String temp = pc.substring(pc.indexOf(token));
						if (temp.indexOf(']') < 0) {
							continue;
						}

						String val = temp.substring(temp.indexOf("[") + 1, temp.indexOf("]"));

						// if(actualType == Types.T_INT || actualType == Types.T_FLOAT || actualType ==
						// Types.T_LONG || actualType == Types.T_DOUBLE)
						// testCase = testCase + val + ",";
						if (actualType == Types.T_INT || actualType == Types.T_FLOAT || actualType == Types.T_LONG
								|| actualType == Types.T_SHORT || actualType == Types.T_BYTE
								|| actualType == Types.T_CHAR || actualType == Types.T_DOUBLE) {
							String suffix = "";
							if (actualType == Types.T_LONG) {
								suffix = "l";
							} else if (actualType == Types.T_FLOAT) {
								val = String.valueOf(Double.valueOf(val).floatValue());
								suffix = "f";
							}
							if (val.endsWith("Infinity")) {
								boolean isNegative = val.startsWith("-");
								val = ((actualType == Types.T_DOUBLE) ? "Double" : "Float");
								val += isNegative ? ".NEGATIVE_INFINITY" : ".POSITIVE_INFINITY";
								suffix = "";
							}
							testCase = testCase + val + suffix + ",";
						} else if (actualType == Types.T_BOOLEAN) { // translate boolean values represented as ints
							// to "true" or "false"
							if (val.equalsIgnoreCase("0"))
								testCase = testCase + "false" + ",";
							else
								testCase = testCase + "true" + ",";
						} else
							throw new RuntimeException(
									"## Error: listener does not support type other than int, long, short, byte, float, double and boolean");
						// TODO: to extend with arrays
					} else {
						// need to check if value is concrete
						if (token.contains("CONCRETE"))
							testCase = testCase + actualValue + ",";
						else
							testCase = testCase + SymbolicInteger.UNDEFINED + "(don't care),";// not correct in concolic
																								// mode
					}
				}
				if (testCase.endsWith(","))
					testCase = testCase.substring(0, testCase.length() - 1);
				testCase = testCase + ")";
				// process global information and append it to the output

				if (!errorMessage.equalsIgnoreCase(""))
					testCase = testCase + "  --> " + errorMessage;
				// do not add duplicate test case
				if (!allTestCases.contains(testCase))
					allTestCases = allTestCases + "\n" + testCase;
			}
			pw.println(allTestCases);
		} else {
			pw.println("No path conditions for " + methodSummary.getMethodName() + "(" + methodSummary.getArgValues()
					+ ")");
		}
	}

	private void printMethodSummaryHTML(PrintWriter pw, MethodSummary methodSummary) {
		pw.println("<h1>Test Cases Generated by Symbolic JavaPath Finder for " + methodSummary.getMethodName()
				+ " (Path Coverage) </h1>");

		Vector<Pair> pathConditions = methodSummary.getPathConditions();
		if (pathConditions.size() > 0) {
			Iterator it = pathConditions.iterator();
			String allTestCases = "";
			String symValues = methodSummary.getSymValues();
			StringTokenizer st = new StringTokenizer(symValues, ",");
			while (st.hasMoreTokens())
				allTestCases = allTestCases + "<td>" + st.nextToken() + "</td>";
			allTestCases = "<tr>" + allTestCases + "<td>RETURN</td></tr>\n";
			while (it.hasNext()) {
				String testCase = "<tr>";
				Pair pcPair = (Pair) it.next();
				String pc = (String) pcPair._1;
				String errorMessage = (String) pcPair._2;
				// String symValues = methodSummary.getSymValues();
				String argValues = methodSummary.getArgValues();
				String argTypes = methodSummary.getArgTypes();
				// StringTokenizer
				st = new StringTokenizer(symValues, ",");
				StringTokenizer st2 = new StringTokenizer(argValues, ",");
				StringTokenizer st3 = new StringTokenizer(argTypes, ",");
				while (st2.hasMoreTokens()) {
					String token = "";
					String actualValue = st2.nextToken();
					byte actualType = Byte.parseByte(st3.nextToken());
					if (st.hasMoreTokens())
						token = st.nextToken();
					if (pc.contains(token)) {
						String temp = pc.substring(pc.indexOf(token));
						if (temp.indexOf(']') < 0) {
							continue;
						}

						String val = temp.substring(temp.indexOf("[") + 1, temp.indexOf("]"));
						if (actualType == Types.T_INT || actualType == Types.T_FLOAT || actualType == Types.T_LONG
								|| actualType == Types.T_SHORT || actualType == Types.T_BYTE
								|| actualType == Types.T_DOUBLE)
							testCase = testCase + "<td>" + val + "</td>";
						else if (actualType == Types.T_BOOLEAN) { // translate boolean values represented as ints
							// to "true" or "false"
							if (val.equalsIgnoreCase("0"))
								testCase = testCase + "<td>false</td>";
							else
								testCase = testCase + "<td>true</td>";
						} else
							throw new RuntimeException(
									"## Error: listener does not support type other than int, long, short, byte, float, double and boolean");

					} else {
						// need to check if value is concrete
						if (token.contains("CONCRETE"))
							testCase = testCase + "<td>" + actualValue + "</td>";
						else
							testCase = testCase + "<td>" + SymbolicInteger.UNDEFINED + "(don't care)</td>"; // not
																											// correct
																											// in
																											// concolic
																											// mode
					}
				}

				// testCase = testCase + "</tr>";
				// process global information and append it to the output

				if (!errorMessage.equalsIgnoreCase(""))
					testCase = testCase + "<td>" + errorMessage + "</td>";
				// do not add duplicate test case
				if (!allTestCases.contains(testCase))
					allTestCases = allTestCases + testCase + "</tr>\n";
			}
			pw.println("<table border=1>");
			pw.print(allTestCases);
			pw.println("</table>");
		} else {
			pw.println("No path conditions for " + methodSummary.getMethodName() + "(" + methodSummary.getArgValues()
					+ ")");
		}

	}

	// -------- the publisher interface
	@Override
	public void publishFinished(Publisher publisher) {
		String[] dp = SymbolicInstructionFactory.dp;
		if (dp[0].equalsIgnoreCase("no_solver") || dp[0].equalsIgnoreCase("cvc3bitvec"))
			return;

		PrintWriter pw = publisher.getOut();

		publisher.publishTopicStart("Method Summaries");
		Iterator it = allSummaries.entrySet().iterator();
		while (it.hasNext()) {

			Map.Entry me = (Map.Entry) it.next();
			MethodSummary methodSummary = (MethodSummary) me.getValue();
			printMethodSummary(pw, methodSummary);
		}

		publisher.publishTopicStart("Method Summaries (HTML)");
		it = allSummaries.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry me = (Map.Entry) it.next();
			MethodSummary methodSummary = (MethodSummary) me.getValue();
			printMethodSummaryHTML(pw, methodSummary);
		}

		publisher.publishTopicStart("Vulnerability Detection Result");
		pw.println(vulResult.printVulResult());
	}

	protected class MethodSummary {
		private String methodName = "";
		private String argTypes = "";
		private String argValues = "";
		private String symValues = "";
		private Vector<Pair> pathConditions;

		public MethodSummary() {
			pathConditions = new Vector<Pair>();
		}

		public void setMethodName(String mName) {
			this.methodName = mName;
		}

		public String getMethodName() {
			return this.methodName;
		}

		public void setArgTypes(String args) {
			this.argTypes = args;
		}

		public String getArgTypes() {
			return this.argTypes;
		}

		public void setArgValues(String vals) {
			this.argValues = vals;
		}

		public String getArgValues() {
			return this.argValues;
		}

		public void setSymValues(String sym) {
			this.symValues = sym;
		}

		public String getSymValues() {
			return this.symValues;
		}

		public void addPathCondition(Pair pc) {
			pathConditions.add(pc);
		}

		public Vector<Pair> getPathConditions() {
			return this.pathConditions;
		}

	}
}
