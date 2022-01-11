package practiceQuizCh3Package;

public class Account1Test {

	public static void main(String[] args) {
		Account1 account1 = new Account1("account1", 50.00);
		Account1 account2 = new Account1("account2", 0.00);
		
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
