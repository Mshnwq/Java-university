package excersice;

import java.util.Scanner;

public class AccountTest {

	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Account account1 = new Account("account1", 50);
		Account account2 = new Account("account2", 0);
		
		account1.displayInfo();
		account2.displayInfo();
		
		account1.withdraw();
		
		account1.displayInfo();
		account2.displayInfo();
		
		account2.withdraw();
		account1.displayInfo();
		account2.displayInfo();
		
		
		
		
	}
}

