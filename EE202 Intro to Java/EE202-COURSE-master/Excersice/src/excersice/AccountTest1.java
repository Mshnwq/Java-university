package excersice;

public class AccountTest1 {

	public static void main(String[] args) {
		
		Account1 account1 = new Account1("account1", 50);
		Account1 account12 = new Account1("account2", -3);
		
		account1.displayInfo();
		account12.displayInfo();
		
		account1.depit();
		account1.displayInfo();
		account12.displayInfo();
		
		account12.depit();
		account1.displayInfo();
		account12.displayInfo();
		
		account1.deposit();
		account1.displayInfo();
		account12.displayInfo();
		
		account12.deposit();
		account1.displayInfo();
		account12.displayInfo();
		
	}
	
}
