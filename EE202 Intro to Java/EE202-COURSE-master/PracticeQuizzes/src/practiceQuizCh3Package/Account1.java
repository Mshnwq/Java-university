package practiceQuizCh3Package;

import java.util.Scanner;

public class Account1 {

	Scanner input = new Scanner(System.in);
	//instance variable
	private String name;
	private double balance;
	private double withdrawAmount;
	
	//constructro num1
	public Account1() {
	}
	
	//constructor num2
	public Account1(String n, double b) {
		this.name = n;
		if (b< 0) {
			b= 0.0;
		}
		this.balance = b;
	}
	
	//setMethods
	public void setName(String n ) {
		this.name = n;
	}
	
	public void setBalance(double b) {
		if (b < 0) {
			b = 0.0;
		}
		this.balance = b;
	}
	
	//getMethods
	public String getName() {
		return name;
	}
	
	public double getBalance() {
		return balance;
	}
	
	//display inof
	public void displayInfo() {
		System.out.printf("%s balance: $%.2f%n", name, balance);
	}
	
	//withdrawal amount
	public void withdraw() {
		System.out.printf("Enter withdrawa amount for %s: ", name);
		withdrawAmount = input.nextDouble();
		System.out.println();
		System.out.printf("subtracting %.2f from %s balance%n", withdrawAmount, name);
		
		if (withdrawAmount > balance) {
			System.out.println("Debit amount exceede account balance");
		}
		else {
			balance -=withdrawAmount;
		}
		
	}
	
	
	
}
