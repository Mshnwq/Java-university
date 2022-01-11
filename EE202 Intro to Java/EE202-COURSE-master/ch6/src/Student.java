public class Student {
	String name;
	static int test1;
	static int test2;
	static Student student;
	static boolean call2 = false;

	
	public Student(String studentName) {
		name = studentName;
	}
	// ----------------------------------------------------
	// getName: returns the student's name
	// ----------------------------------------------------
	public String getName() {
		return name;
	}
	// ----------------------------------------------------
	// toString: returns a String representing the Student object
	// ----------------------------------------------------
	public void setGrade1(int grade1) {
		test1 = grade1;
	}
	
	public void setGrade2(int grade2) {
		test2 = grade2;
	}
	
	
	
	
	public static double getAverage() {
		return (test1+test2)/2.0;
	}
	public static boolean compare() {
		return (getAverage() > 50 );
	}
	public String toString() {
		return "Name: " + name + "   Test 1: " + test1 + "   Test 2: " + test2;
	}
	
	public static void displayInfo() {
		if (call2 == false) {
			System.out.println(student);
			
		}
		else
			System.out.println("I am method displayInf()");
	}

}
