package excersice;

import java.util.Scanner;

public class Account1 {
	
	private String name;
	private double balance;
	Scanner input = new Scanner(System.in);
	
	public Account1(String n, double b) {

		this.name = n;
		if(b >=0) {
			this.balance = b;
		}
		
	}
	
	//setMehtod
	public void setBalance(double balance) {
		if (balance > 0) {
			this.balance = balance;
			
		}
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	//getMethod
	
	public double getBalance() {
		return balance;
	}
	
	public String getName() {
		return name;
	}
	
	//displayInfo
	public void displayInfo() {
		System.out.printf("%s balance: $%.2f\n", name, balance);
	}
	
	//debit
	public void depit() {
		System.out.println();
		System.out.printf("Enter withdraw amount for %s: ", name);
		double depitAmount = input.nextDouble();
		System.out.println();
		
		System.out.printf("substracting %.2f from %s balance \n", depitAmount, name);
		if (depitAmount > balance) {
			System.out.println("Debit amount exceeded account balance");
		}
		else {
			balance -=depitAmount;
		}
		
	}
	
	//depositeMethod
	public void deposit() {
		System.out.println();
		System.out.printf("Enter your deposite amount to your account %s: ", name);
		double depositAmount = input.nextDouble();
		System.out.println();
		
		System.out.printf("Your deposite %.2f to your account %s\n", depositAmount, name);
		if(depositAmount > 0) {
			balance +=depositAmount;
		}
		else {
			System.out.println("Deposite amount must be positive!.");
		}
		
	}

}
