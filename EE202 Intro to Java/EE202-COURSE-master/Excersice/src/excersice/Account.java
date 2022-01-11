package excersice;
import java.util.Scanner;

public class Account {
	private String name;
	private double balance;
	
	
	public Account(String n, double b) {

		this.name = n;
		this.balance = b;
	}
	
	public void  withdraw() {//wA-withdraw Amount
		Scanner input = new Scanner(System.in);
		
		System.out.println();//line
		System.out.printf("Enter withdraw amount for %s: ", name);
		double wA = input.nextDouble();
		System.out.println();//line
		
		System.out.printf("subtracting %.2f from %s balance%n", wA, name);
		if (wA <= balance) {
			balance -=wA;
		}
		
		else {
			System.out.println("Debit amount exceede account balance");
		}
		
	}
	
	public void displayInfo() {
		System.out.printf("%s balance: $%.2f%n", name, balance);
	}
	

}
