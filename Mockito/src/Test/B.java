package Test;

//import gov.nasa.jpf.symbc.Debug;

public class B {
	public int b1;
	private boolean b2;
	private int b3;
	private A a;
	
	public B(int b1, int b3, boolean b2, A a ) {
//		this.b1=b1;
//		this.b2=b2;
//		this.b3=b3;
		this.a=a;
		
	}
	
	public boolean  doC() {
		return doCommand();
	}
	private boolean doCommand() {
		this.a.setA1(b1);
		a =new A(b1, b3, b2);
		if(a.mult()>0)
			return true;
		else {
			assert(false);
			return false;
		}
	}
}
