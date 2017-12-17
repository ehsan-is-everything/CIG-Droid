package ICFG;

import java.util.HashMap;
import java.util.Stack;

public class PathInfo {
	private Stack<IfStmtInfo> map;
	private Stack<String> traceOfMethods;

	public PathInfo() {
		map = new Stack<>();
		traceOfMethods = new Stack<>();
	}

	public Stack<String> getStackTraceOfMethods() {
		return traceOfMethods;
	}

	public void setStackTraceOfMethods(Stack<String> traceOfMethods) {
		this.traceOfMethods = traceOfMethods;
	}

	public Stack <IfStmtInfo> getSMap() {
		return map;
	}

	public void setSMap(Stack<IfStmtInfo> map) {
		this.map = map;
	}

}
