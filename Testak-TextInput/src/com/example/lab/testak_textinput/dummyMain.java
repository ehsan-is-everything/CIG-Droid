package com.example.lab.testak_textinput;



import android.view.View;

public class dummyMain {

	public static void main(String[] args) {
		MainActivity ma = new MainActivity();
		ma.onCreate(null);
		View v=new View();
		ma.findViewById(R.id.fab).mOnClickListener.onClick(v);
	}

}
