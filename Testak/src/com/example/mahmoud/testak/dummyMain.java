package com.example.mahmoud.testak;

import android.view.View;

public class dummyMain {

	public static void main(String[] args) {
		MainActivity ma = new MainActivity();
		ma.onCreate(null);
		View v=new View();
		ma.findViewById(R.id.fab).mOnClickListener.onClick(v);
	}

}
