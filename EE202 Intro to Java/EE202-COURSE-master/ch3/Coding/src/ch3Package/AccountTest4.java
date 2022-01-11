package ch3Package;
import java.util.*;
public class AccountTest4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Account4 myAccount4 = new Account4("Asma Sarouji", 400);
		System.out.printf("your name is : %s and your balance is: %.2f by CONSTRUCTOR!%n", myAccount4.getName(), myAccount4.getBalane());
		
		System.out.print("Enter your deposite amount to your balance: ");
		double depositeAmount = input.nextDouble();
		myAccount4.deposite(depositeAmount);
		System.out.printf("you added %.2f now your balance is: %.2f%n", depositeAmount, myAccount4.getBalane());
		
		System.out.print("Enter your withdraw: ");
		double withdrawAmount = input.nextDouble();
		myAccount4.withdraw(withdrawAmount);
		System.out.printf("you withdrawed %.2f and your balance now is: %.2f", depositeAmount, myAccount4.getBalane());
		
		
		
		
		
	}
		
		
		
		
		
}
