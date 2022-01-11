package lab6;
//************************************************************
//Grades.java //
//Use Student class to get test grades for two students
//and compute averages //
//************************************************************
public class Grades {
	
	public static void main(String[] args) {

	Students student1 = new Students("Mary");
	student1.inputGrades();
	student1.getAverage();
	
	Students student2 = new Students("Mike");
	student2.inputGrades();
	student2.getAverage();
	
	System.out.println("Student 1: " + student1.toString());
	System.out.println("Student 2: " + student2.toString());
	} 
}