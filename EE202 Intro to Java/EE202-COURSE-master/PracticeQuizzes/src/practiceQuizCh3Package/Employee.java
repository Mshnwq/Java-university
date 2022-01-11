package practiceQuizCh3Package;

import java.util.Scanner;

public class Employee {
	
	Scanner input = new Scanner(System.in);

	//instance var
	private String firstName;
	private String lastName;
	private double monthlySalary;
	private double riseAmount;
	
	//constructor num1
	public Employee() {
		
	}
	
	//constructor num2
	public Employee(String fN, String lN, double mS) {

		this.firstName = fN;
		this.lastName = lN;
		if(mS < 0) {
			mS = 0.0;
		}
		this.monthlySalary = mS;
			
	}
	
	//setMethods
	public void setFirstName(String fN) {
		this.firstName = fN;
	}
	public void setLastNamt(String lN) {
		this.lastName = lN;
	}
	public void setMonthlySalary(double mS) {
		if(mS < 0) {
			mS = 0;
		}
		this.monthlySalary = mS;
	}
	
	//getMethods
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public double getMonthlySalary() {
		return monthlySalary;
	}
	
	
	//yearlySalary method
	public double getYearlySalary() {
		return monthlySalary * 12;
	}
	
	public void setRiseAmount(double rA) {
		if (rA < 0) {
			rA = 0.0;
		}		
		this.riseAmount = rA;
	}
	
	//yearly salary method after the rise
	public double getRiseSalary() {
		
		return this.getYearlySalary() * (1 + riseAmount);
	}
	
	//display info method
	public void displayInfo() {
		System.out.printf("Your name is : %s %s%nYour monthly Salary is:%.2f%nYour yearly Salary is: %.2f%nYour yearly Salary after increase by %.2f is: %.2f%n", firstName, lastName,monthlySalary, this.getYearlySalary(),riseAmount, this.getRiseSalary());
	}
	
	//input Data method
	public void inputData() {
		System.out.print("Enter your first and last name: ");
		firstName = input.next();
		lastName = input.next();
		
		System.out.println("Welcome " + firstName + " " + lastName);
		
		System.out.print("Enter your monthly salary: ");
		monthlySalary = input.nextDouble();
		
		System.out.print("Enter your rise Amount: ");
		riseAmount = input.nextDouble();
		
		System.out.println("Thank you!");
	}
	
	
	
	
	
	
}
