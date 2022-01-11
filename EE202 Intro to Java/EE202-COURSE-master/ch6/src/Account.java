
//************************************************************
// Account.java
//
// A bank account class with methods to deposit to, withdraw from,
// change the name on, and get a String representation
// of the account.
//************************************************************
import java.security.SecureRandom;
public class Account {
	private double balance;
	private String name;
	private int acctNum;
	private  final SecureRandom randomNumber = new SecureRandom();
//-------------------------------------------------
//Constructor -- initializes balance, owner, and account number
//-------------------------------------------------
	public Account(double initBal, String owner, int number) {
		balance = initBal;
		name = owner;
		acctNum = number;
	}
	
	public Account(double initBal, String owner) {
		balance = initBal;
		name = owner;
		acctNum = 1 + randomNumber.nextInt(9);
	}
	
	public Account(String owner) {
		balance = 0;
		name = owner;
		acctNum = 1 + randomNumber.nextInt(9);
	}

//-------------------------------------------------
// Checks to see if balance is sufficient for withdrawal.
// If so, decrements balance by amount; if not, prints message.
//-------------------------------------------------
	public void withdraw(double amount) {
		if (balance >= amount)
			balance -= amount;
		else
			System.out.println("Insufficient funds");
	}
	
	public void withdraw(double amount, double fee) {
		if (balance >= amount)
			balance -= (amount + fee);
		else
			System.out.println("Insufficient funds");
	}

//-------------------------------------------------
// Adds deposit amount to balance.
//-------------------------------------------------
	public void deposit(double amount) {
		balance += amount;
	}

//-------------------------------------------------
// Returns balance.
//-------------------------------------------------
	public double getBalance() {
		return balance;
	}

//-------------------------------------------------
// Returns a string containing the name, account number, and balance.
//-------------------------------------------------
	public String toString() {
		return "Name:" + name + "\nAccount Number: " + acctNum + "\nBalance: " + balance;
	}
}