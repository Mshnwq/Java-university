package ch3Package;

import java.util.*;

import javax.sound.midi.Soundbank;
public class EmployeeTest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Employee myEmployee = new Employee("asma", "Sarouji", 65);
		
	    System.out.println("Default:");	
		System.out.println("First name:" + myEmployee.getFirstName());
		System.out.println("Last name:"+ myEmployee.getLastName());
		System.out.println("Montly salary:"+myEmployee.getMonthlySalary());
		
		System.out.print("Enter your month salary:");
		double monthlySalary = input.nextDouble();
		myEmployee.setMonthlySalary(monthlySalary);
		
		double yearlySalary = 12 * myEmployee.getMonthlySalary();
		System.out.printf("your yearly salary now is:%.2f%n", yearlySalary );
		System.out.printf("your yearly salary now is:%.2f", (yearlySalary * 0.1 )+ yearlySalary );
		
	}
	
	

}
