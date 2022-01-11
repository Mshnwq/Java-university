package practiceQuizCh3Package;

import java.util.Scanner;

public class Account {
	
	//instance var
	private String name; //null
	private double balance; //0.0 
	
	Scanner input = new Scanner(System.in);
	
	public Account() {
		
	}
	
	//setMethods
	public void setName(String name ) {
		this.name = name;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	
	
	
	//getMethods
	public String getName () {
		return name;
	}
	
	public double getBalance() {
		return balance;
	}
	
	
	
	//depositeAmount method
	public void deposite() {
		
		System.out.print("Enter your amount deposite: ");
		double depsoiteAmount = input.nextDouble();
		if(depsoiteAmount > 0) {
			System.out.printf("You added %.2f to your balance %.2f%n", depsoiteAmount, balance);
			balance +=depsoiteAmount;
			System.out.println("Your balance now is: " + balance);
		}
		else {
			System.out.println("Negative! Error!");
			System.out.println("your balance still the same !:  " + balance );
		}
		
	}
	
	//withdrawAmount method
	public void withdraw() {
		System.out.print("Enter your withdraw Amount: ");
		double withdrawAmount = input.nextDouble();
		
		if (withdrawAmount > balance) {
			System.out.println("Error! exccedd the amount of balance");
		}
		else {
			System.out.printf("your withdrawd %.2f from your balance %.2f%n", withdrawAmount, balance);
			balance -=withdrawAmount;
			System.out.println("Now your balance is: " + balance);
		}
	}
	
	//displayMethod
	public void displayMethod() {
		System.out.println("Your name is: " + name + "\nYour balance is: " + balance);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
