package excersice;

import java.util.Scanner;

public class PracticeCh4 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		/* Q4.17
		int milesDriven, gallonUsed;
		double milesPerGallon, combinedMilesPerGallon =0;
		System.out.print("Enter miles driven: ");
		milesDriven = input.nextInt();
		System.out.print("Enter gallon used: ");
		gallonUsed = input.nextInt();
		
		while (milesDriven > 0 && gallonUsed > 0) {
			milesPerGallon = (double) milesDriven/gallonUsed;
			combinedMilesPerGallon +=milesPerGallon;
			System.out.printf("Your mile per gallon is: %.2f\n", milesPerGallon);
			
			System.out.print("Enter miles driven: ");
			milesDriven = input.nextInt();
			System.out.print("Enter gallon used: ");
			gallonUsed = input.nextInt();
			
		}
		System.out.printf("The combines is: %.2f\n", combinedMilesPerGallon );
		
		*/
		
		
		/* Q.17
		int accountNumber, balance, totalCharged, totalCredit, allowedCreditLimit, newBalance;
		System.out.print("Acount Number: ");
		accountNumber = input.nextInt();
		System.out.print("balance: ");
		balance = input.nextInt();
		System.out.print("total charged: ");
		totalCharged = input.nextInt();
		System.out.print("Total credit: ");
		totalCredit = input.nextInt();
		System.out.print("allowed limit credit ");
		allowedCreditLimit = input.nextInt();
		newBalance = balance + totalCharged - totalCredit;
		System.out.println("The new balance is:  "+ newBalance);
		if (newBalance > allowedCreditLimit) {
			System.out.println("New balance excedd credit limits");
		}
		else {
			System.out.println("credit limit is excedd");
		}
		
		*/
		
		
		/* Q4.19
		for(int i = 1; i<=4; i++) {
			System.out.print("Enter val: ");
			double val = input.nextDouble();
			double result = 200 +  (0.09 * val);
			System.out.printf("For item %s the sales person's earning is: $%.2f\n", i,result );
		}
		
		*/
		
		
		
		
		
	}

}
