package android.widget;

import android.view.View;

public class TextView extends View{
	String content;
	public TextView() {
		// TODO Auto-generated constructor stub
		this.content=new String("97");
	}
	public void setText(String buffer) {
		// TODO Auto-generated method stub
		content=buffer;
	}
	public void setText(CharSequence loadLabel) {
		// TODO Auto-generated method stub
		content=loadLabel.toString();
	}
}
