package excersice;

import java.util.Scanner;

public class Student {

	private String id, firstName, lastName, phoneNumber, address, grade;

	private int age;
	private double score;
	Scanner input = new Scanner(System.in);
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Student(String firstName, String lastName,String id,  String phoneNumber, String address, int age,
			double score) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
		this.phoneNumber = phoneNumber;
		this.address = address;
		if(score >= 0 && score <= 100 ) {
			this.score = score;
			this.grades();
			
		}
		this.age = age;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		if(score > 0) {
			
			this.score = score;
		}
	}
	public String getID() {
		return id;
	}
	public void setID(String iD) {
		id = iD;
	}
	
	//methods to get the grade
	public void grades() {
		if(score >100 || score < 0) {
			grade = "Error Input!";
		}
		else {
			if(score >= 90) {
				grade = "A";
			}
			else if (score>=80) {
				grade = "B";
			}
			else if (score >=70) {
				grade = "C";
			}
			else if (score >=60) {
				grade = "D";
			}
			else {
				grade = "F";
			}
			
			
		}
	}
	
	public void diplayInfo() {
		System.out.println("**************************");
		System.out.println("STUDENT INFORMATION");
		System.out.println("**************************");
		System.out.println("Frist and last name: " +  firstName + " " + lastName);
		System.out.println("The ID is: " + id);
		System.out.println("Age : " + age);
		System.out.println("Phone number: " + phoneNumber);
		System.out.println("Address : " + address);
		System.out.println("Score : " + score);
		System.out.println("Grade: " + grade);	
		
	}
	
	//askUserMethod
	public void askUser() {
		System.out.println();
		System.out.print("Enter your first name and last name: ");
		firstName = input.next();
		lastName = input.next();
		
		System.out.print("Enter your age; ");
		age = input.nextInt();
		
		System.out.print("Enter your ID");
		id = input.next();
		
		System.out.print("Enter your number: ");
		phoneNumber = input.next();
		
		System.out.print("Enter your address: ");
		address = input.next();
		
		System.out.print("Enter your score: ");
		score = input.nextDouble();
		this.grades();
		System.out.println("Grade: " + grade);	
	}
}
