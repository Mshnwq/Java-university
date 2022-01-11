package practiceQuizCh3Package;

import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Account account1 = new Account();
		
		System.out.print("Enter your name: ");
		String name = input.nextLine();
		account1.setName(name);
		
		System.out.print("Enter your balance: ");
		double balance = input.nextDouble();
		account1.setBalance(balance);
		
		account1.displayMethod();
		account1.deposite();
		account1.withdraw();
		
		
		
	}

}
