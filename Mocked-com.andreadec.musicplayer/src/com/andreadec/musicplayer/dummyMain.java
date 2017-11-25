package com.andreadec.musicplayer;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import gov.nasa.jpf.symbc.Debug;

public class dummyMain {
	public static void main(String[] args) {
		SearchActivity sa = new SearchActivity();
		sa.onCreate(new Bundle());
		View v = new View();
		int keyCode = 0;
		KeyEvent event = new KeyEvent();
		// int keyCode = Debug.makeSymbolicInteger("keyCode");
		// KeyEvent event = (KeyEvent) Debug.makeSymbolicRef("event", new KeyEvent());
		sa.onKey(v, keyCode, event);
	}
}
