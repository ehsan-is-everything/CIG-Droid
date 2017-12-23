package android.content;

import gov.nasa.jpf.symbc.Debug;

public class SharedPreferences {

	public boolean getBoolean(String string, boolean b) {
		// TODO Auto-generated method stub
		return Debug.makeSymbolicBoolean(string);
	}

	public String getString(String string, String string2) {
		// TODO Auto-generated method stub
		return ""+Debug.makeSymbolicInteger(string);
	}

}
