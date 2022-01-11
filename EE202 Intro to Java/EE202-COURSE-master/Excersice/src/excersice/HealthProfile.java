package excersice;

import java.util.Scanner;


public class HealthProfile {
	
	private String firstName, lastName;
	private int day, month, year;
	private double height, weight, bMI;
	private int currDay, currMonth, currYear;
	private double maxHeartRate, targetHeartRate1, targetHeartRate2;
	private double ageYear;
	
	public HealthProfile() {
		// TODO Auto-generated constructor stub
	}
	
	public HealthProfile(String fN, String lN, int d, int m, int y ) {
		this.firstName = fN;
		this.lastName = lN;
		this.day = d;
		this.month = m;
		this.year = y;
		
		
	}
	
	public void askUser() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your First name: ");
		firstName = input.next();
		System.out.print("Enter your last name: ");
		lastName = input.next();
		System.out.println("Enter your birth date (day/month/year): ");
		day = input.nextInt();
		month = input.nextInt();
		year = input.nextInt();
		System.out.println("Enter current day/month/year: ");
		currDay = input.nextInt();
		currMonth = input.nextInt();
		currYear = input.nextInt();
		System.out.print("Enter your height: (in m)");
		height = input.nextDouble();
		System.out.print("Enter your weight: (in kg)");
		weight = input.nextDouble();
	}
	public void calcAge() {
		ageYear = (currYear - year) + ((currMonth - month)/12.0) + ((currDay - day)/356.0);
		
	}
	
	public void calcMaxHeartRate() {
		maxHeartRate = 220 - ageYear;
	}
	
	public void calcTargetHeartRate() {
		targetHeartRate1 = (0.5) * maxHeartRate;
		targetHeartRate2 = (0.85) * maxHeartRate;
	}
	
	public void calcBMI() {
		bMI = (weight  /(height * height));
		
	}
	
	public void displayInfo() {
		System.out.println();
		System.out.printf("Your first name is: %s%n", firstName);
		System.out.printf("Your last name: %s%n", lastName);
		System.out.printf("Your age in years is: %.2f%n", ageYear);
		System.out.printf("Your BMI is: %.2f%n", bMI);
		System.out.printf("Your target heart rate should be between %.2f and %.2f%n", targetHeartRate1, targetHeartRate2);
		System.out.printf("Your max heart rate is: %.2f%n", maxHeartRate);
	}
	
	
}
