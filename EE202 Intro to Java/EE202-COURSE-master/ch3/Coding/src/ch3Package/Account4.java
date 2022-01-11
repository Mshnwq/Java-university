package ch3Package;

public class Account4 {
	
	private String name ;//instance var
	private double balance;
	
	
	
	//constructor initialize name with parameter name
	public Account4(String name, double balance) {
		this.name = name;
		
		if (balance > 0.0) {
			this.balance = balance; //instance var = local var 
		}
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setBalance(double balance) {
		this.balance = balance; 
	}
	
	public double getBalane() {
		return balance;
	}
	
	
	public void deposite(double depositeAmount) {
		if (depositeAmount > 0) {
			balance = balance + depositeAmount;
		}
	}
	
	public void withdraw(double withdrawAmount) {
		if (withdrawAmount < balance) {
			balance = balance - withdrawAmount;
		}
	}
	

}
