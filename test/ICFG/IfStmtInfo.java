package ICFG;

import java.util.Stack;

import soot.Unit;

public class IfStmtInfo {
	private boolean IsLeftorRight; // true means right branch is better and False means left branch is better
	private String IfUnit;
	private String PrevUnit;
	

	public IfStmtInfo(String ifUnit, String PrevUnit, boolean IsLeftorRight) {
		this.IfUnit = ifUnit;
		this.PrevUnit = PrevUnit;
		this.IsLeftorRight = IsLeftorRight;
	}

	public String getPrevUnit() {
		return PrevUnit;
	}

	public void setPrevUnit(String prevUnit) {
		PrevUnit = prevUnit;
	}

	public String getIfUnit() {
		return IfUnit;
	}

	public void setIfUnit(String ifUnit) {
		IfUnit = ifUnit;
	}

	public boolean isIsLeftorRight() {
		return IsLeftorRight;
	}

	public void setIsLeftorRight(boolean isLeftorRight) {
		IsLeftorRight = isLeftorRight;
	}

	
}
