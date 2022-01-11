public class Grades {
	
	static String studentName;
	static boolean call = false;
	
	public static void main(String[] args) {
		
		Student student1 = new Student("Mary");
		
		Student student2 = new Student("Mike");
		
		student1.setGrade1(50);
		student1.setGrade2(60);
		String studentName1 = student1.getName();
		studentName = studentName1;
		
		System.out.println();
		call = false;
		displayInfo1();
		
		student2.setGrade1(5);
		student2.setGrade2(6);
		String studentName2 = student2.getName();
		studentName = studentName2;
		
		System.out.println();
		displayInfo1();
		
		System.out.println();
		Student.student = student1;
		System.out.print("Student 1: ");
		Student.displayInfo();
		
		Student.student = student2;
		System.out.print("Student 2: ");
		Student.displayInfo();
		
		System.out.println();
		call = true;
		displayInfo1();
		
		Student.call2 = true;
		
		Student.displayInfo();
		
		
	}
	
	public static void displayInfo1() {
		if(call == false) {
			System.out.printf("The average for %s is %.1f%n", studentName, Student.getAverage() );
			System.out.printf("The average is > 50: %b%n", Student.compare());
			
		}
		else
			System.out.println("I am method dispalyInfo1()");
	}
}//end class
