import java.util.Scanner;

class StudentClassWithMultipleMethods {
	public static void main(String arg[]) {
		Scanner in = new Scanner(System.in);
		int pathnum = in.nextInt();
		if (pathnum == 1) {
			Student srini = new Student();
			srini.name = "Ali";
			srini.english = 87;
			srini.maths = 76;

			System.out.println("Detailed Marks for"+srini.name);
			srini.printMarksSummary();
		}
		if(pathnum == 2)
		{
			Student bob = new Student();
			bob.name = "Bob";
			bob.english = 7;
			bob.maths = 76;

			System.out.println("Detailed Marks for"+bob.name);
			bob.printMarksSummary();
		}
	}
}

class Student {
	String name;
	// Marks in various subjects
	int english;
	int maths;
	
	double getaverage()
	{
		return (maths+english)/2; 
	}
	
	void printMarksSummary() {
		System.out.println("Non languages: " + getaverage());
	}

}