package ICFG;

import java.util.HashMap;
import java.util.Stack;

public class PathInfo {
	private HashMap<String, IfStmtInfo> map;
	private Stack<String> traceOfMethods;

	public PathInfo() {
		map = new HashMap<>();
		traceOfMethods = new Stack<>();
	}

	public Stack<String> getStackTraceOfMethods() {
		return traceOfMethods;
	}

	public void setStackTraceOfMethods(Stack<String> traceOfMethods) {
		this.traceOfMethods = traceOfMethods;
	}

	public HashMap<String, IfStmtInfo> getMap() {
		return map;
	}

	public void setMap(HashMap<String, IfStmtInfo> map) {
		this.map = map;
	}

}
