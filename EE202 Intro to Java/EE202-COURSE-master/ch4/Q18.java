import java.util.Scanner;
public class Q18{
	public static void main(String[] args){
		//my variables
		int numberOfCustomers,
			accountNumber,
			balance,
			charges,
			credits,
			creditsLimit,
			newBalance;
			
			Scanner input = new Scanner(System.in);
			
			System.out.print("Enter Number of Customers: ");
			numberOfCustomers = input.nextInt();
			
			int counter = numberOfCustomers;
			while(counter > 0){
				
				System.out.print("Enter account number: ");
				accountNumber = input.nextInt();
				
				System.out.print("Enter balance: ");
				balance = input.nextInt();
				
				System.out.print("Enter charges: ");
				charges = input.nextInt();
				
				System.out.print("Enter credits: ");
				credits = input.nextInt();
				
				System.out.print("Enter allowed credit: ");
				creditsLimit= input.nextInt();
				
				System.out.println();
				newBalance = balance + charges - credits;
				
				System.out.print("The new balance: ");
				System.out.print(newBalance + "\n");
				
				System.out.println(newBalance > creditsLimit ? "Credit limit exceede \n" : "" );
				
				counter--;
				
			}//end while loop!
			
		
	}//end main method
}//end class