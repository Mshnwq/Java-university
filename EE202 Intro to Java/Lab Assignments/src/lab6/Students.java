package lab6;

import java.util.Scanner;

public class Students {
	
	String firstName;
	int testGrade1;
	int testGrade2;
	Scanner input = new Scanner(System.in);
	
	public Students(String firstName) {
	this.firstName = firstName;
	}

	public void inputGrades() {
	System.out.print("Enter "+ firstName +"'s score for test 1: ");
	this.testGrade1 = input.nextInt();
	System.out.print("Enter "+ firstName +"'s score for test 2: ");
	this.testGrade2 = input.nextInt();
	}
	
	public void getAverage() {
	double Avg =(testGrade1+testGrade2)/2.0;
	System.out.printf("The average for %s is %.1f.%n%n",firstName,Avg);
	}
	
	public String getFirstName() {
	return firstName;
	}
	
	public String toString() {
	return "Name: " + firstName + " Test 1: " + testGrade1 + " Test 2: " + testGrade2;
	}
}