package ch3Package;

public class Account2 {

	//instance variables it's initilized by defult!
	private String name;//private- only methods in this class know about this var 
	private double balance;
	private double depoiteAmount;
	private String accountObject;
	
	//constructor can not return type or even void
	public Account2(String name, double balance) {
		this.name = name;
		
		if (balance > 0) {
			this.balance = balance;
		}
	}
	
	public void setName(String name) { //String name- local variable
		//this. is to access the instance name
		this.name = name; //store the name, "this" is a refrence to the current object
	// this.instance name = name parameter in the method;
		/*
		 * If I write 
		 * name = name; 
		 * it will assign name of parameter in the method to itself! but the keyword "this " will let me access the private instance
		 */
	}
	
	public String getName() { //this method will go out but in this class and search for variable "name" to return it
		return name; //return this.name; --we can write this also
	}
	
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void deposite(double depositeAmount) {
		if (depositeAmount > 0) {
			balance = depositeAmount + balance;
		}
	}
	
	
	public void displayAccount() {
		System.out.printf("%s balance: $%.2f%n",name, balance);
	}
	
	
	
	
	
	
	
}
