import java.util.Scanner;
public class Credit{
	int numberOfAccounts, accountNumber,
	balance, charges, credits, creditLimit,
	newBalance, counter = 1;
	
	Scanner input = new Scanner(System.in);
	public void calacMethod(){
		
		System.out.print("Enter number of Accounts: ");
		numberOfAccounts = input.nextInt();
		
		while(counter <= numberOfAccounts){
			System.out.println();
			
			System.out.print("Enter account number: ");
			accountNumber = input.nextInt();
			
			System.out.print("Enter Balance: ");
			balance = input.nextInt();
			
			System.out.print("Enter Charges: ");
			charges = input.nextInt();
			
			System.out.print("Enter Credits: ");
			credits = input.nextInt();
			
			System.out.print("Enter Credit Limit: ");
			creditLimit = input.nextInt();
			
			newBalance = balance + charges - credits;
			System.out.println("New balance is " + newBalance);
			
			if(newBalance > creditLimit){
				System.out.println("Credit limit exceedded");
			}
			
			
			
			
			
			
			
			counter++;
		}
		
		
	}
	
}//end class