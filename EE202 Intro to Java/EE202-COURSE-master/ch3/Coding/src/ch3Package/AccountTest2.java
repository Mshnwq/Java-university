package ch3Package;
import java.util.Scanner;

public class AccountTest2 {
	public static void main (String[] arg) {
	//Creating objects from classes	
	Scanner input = new Scanner(System.in);
	Account2 accountJG = new Account2("Jane Green", 50.00);
	Account2 accountJB = new Account2("John Blue", -7.53);
	
	accountJG.displayAccount();
	accountJB.displayAccount();
	
	System.out.print("Enter deposite amount for account1: ");
	double depositeAmount = input.nextDouble();
	accountJG.deposite(depositeAmount);
	System.out.printf("adding %.2f to account1 balance%n", depositeAmount);
	
	accountJG.displayAccount();
	accountJB.displayAccount();
	
	System.out.printf("Enter deposite amount for account2: ");
	double depositeAmount2 = input.nextDouble();
	accountJB.deposite(depositeAmount2);
	System.out.printf("adding %.2f to account2 balance%n", depositeAmount2);
	
		
	accountJG.displayAccount();
	accountJB.displayAccount();
	}
	
}
