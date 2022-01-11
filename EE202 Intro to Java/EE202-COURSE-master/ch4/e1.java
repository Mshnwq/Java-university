import java.util.Scanner;
public class e1{
	
	public void calaculateBalance(){
	Scanner input = new Scanner(System.in);
	int numberOfAccounts,
		accountNumber,
		oldBalance,
		charges,
		credits,
		creditLimit,
		newBalance;
		
	System.out.print("Enter Number of Accounts: ");
	numberOfAccounts = input.nextInt();
	
	System.out.println("\n");
	
	while(numberOfAccounts > 0){
		System.out.print("Enter Account Number: ");
		accountNumber = input.nextInt();
		System.out.print("Enter Balance: "); //balance
		oldBalance = input.nextInt();
		System.out.print("Enter Charges: ");//charges
		charges = input.nextInt();
		System.out.print("Enter Credits: ");//credits
		credits = input.nextInt();
		System.out.print("Enter Credit Limit: ");//creditLimit
		creditLimit = input.nextInt();
		
		newBalance = oldBalance + charges - credits;
		System.out.println("New balance is " + newBalance);
		
		
		System.out.print(newBalance > creditLimit? "Credit limit exceedeed": "");
		System.out.println("\n");
		
		System.out.println("\n");
		numberOfAccounts--;
		
		
	}//end while loop
	}//end method
	
	
	
}//end class e1