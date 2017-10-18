package Test;

public class A {
	public int a1;
	public int getA1() {
		return a1;
	}

	public void setA1(int a1) {
		this.a1 = a1;
	}

	public static boolean isA3() {
		return a3;
	}

	public static void setA3(boolean a3) {
		A.a3 = a3;
	}

	public int getA4() {
		return a4;
	}

	private float a2;
	public static boolean a3;
	public final int a4 = 10;
	
	public A(int a1, int a2, boolean a33) {
		setA1(a1);
		this.a2=a2;
		setA3(a33);
	}
	
	public int mult() {
		return (int) (a2*min(getA1(),getA4()));
//		throw new RuntimeException("Stub");
	}
	
	private int min(int a1, int a4) {
		if(isA3()) {
			return a1-a4;
		}else
			return a4-a1;
		//throw new RuntimeException("Stub");
	}
}
