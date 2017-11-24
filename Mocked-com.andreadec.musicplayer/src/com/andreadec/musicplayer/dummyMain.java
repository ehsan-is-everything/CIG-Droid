package com.andreadec.musicplayer;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;

public class dummyMain {
	public static void main(String[] args) {
		SearchActivity sa=new SearchActivity();
		sa.onCreate(new Bundle());
		View v=new View(sa);
		int keyCode = 0;
		KeyEvent event = null;
		sa.onKey(v, keyCode, event);
	}
}
