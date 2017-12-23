package info.bpace.munchlife;

import android.os.Bundle;
import android.view.MenuItem;
import gov.nasa.jpf.symbc.Debug;
import info.bpace.munchlife.MunchLifeActivity;

public class DummyMain {
	public static void main(String[] args) {
		MunchLifeActivity mla=new MunchLifeActivity();
		//Bundle savedInstanceState=(Bundle) Debug.makeSymbolicRef("savedInstanceState", new Bundle());//new Bundle();
		mla.onStart();
		//Bundle savedInstanceState=new Bundle();
		mla.onCreate(null);
		mla.onOptionsItemSelected(new MenuItem());
	}
}
