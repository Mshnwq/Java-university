package ch3Package;

//AccessModifier class nameOfClass
public class Account3 {
	private String name; //instanc variables 
	private double balance;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void setDeposite(double depositeAmount) {
		if (depositeAmount > 0) {
			balance = balance + depositeAmount;
		}
		
		else {
			System.out.println("Deposite Amount should be POSITIVE");
		}
		
	}
	
	public void setWithdraw(double withdrawAmount) {
		if (withdrawAmount <= balance) {
			balance = balance - withdrawAmount;
		}
		
		else {
			System.out.println("Withdrawal amount exceeded account balance!");
		}
	}
	
	public String getName() {
		return name;
	}
	
	public double getBalance() {
		return balance;
	}
	
	
	
}
