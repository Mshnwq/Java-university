package ch3Package;

import java.util.Scanner; // import declaration 
/*java.util.Scanner
--full package name and class name-this known as:
--class's fully qualified class name 


*/
public class AccountTest3 {

	public static void main(String[] args) {
		//create objects
		Scanner input = new Scanner(System.in);
		
	   //typeAndNameOfClass  objectName = newToCreatObject defaultConstructor 
		Account3 myAccount3 = new Account3();//constructor
		
		//balance should equal to 0.0! right? 
		System.out.printf("The default constructor tha name is: %s and the balance is: %f%n", myAccount3.getName(), myAccount3.getBalance());
		
		System.out.print("Enter your name: ");
		String name = input.next();
		myAccount3.setName(name);
		
		System.out.print("Enter your balance: ");
		double balance = input.nextDouble();
		myAccount3.setBalance(balance);
		
		System.out.printf("Your account name is:%s%nYour balance is:%.2f%n", myAccount3.getName(), myAccount3.getBalance());
		
		System.out.print("Enter your deposite amount: ");
		double depositeAmount = input.nextDouble();
		myAccount3.setDeposite(depositeAmount);
		
		System.out.printf("you added %.2f your balance now is %.2f%n",depositeAmount, myAccount3.getBalance());
		
		System.out.print("Enter withdrawal amount: ");
		double withdrawAmount = input.nextDouble();
		myAccount3.setWithdraw(withdrawAmount);
		
		System.out.printf("You withdrawal amount is %.2f and your balance is %.2f%n",withdrawAmount,myAccount3.getBalance() );
		

		
		
	}

}
