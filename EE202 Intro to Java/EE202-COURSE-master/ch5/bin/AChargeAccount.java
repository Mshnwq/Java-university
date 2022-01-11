import java.util.Scanner;
public class AChargeAccount {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the previous Balance: ");
		double balance = input.nextDouble();
		
		System.out.print("Enter the additional charges: ");
		double charges = input.nextDouble();
		
		double interest;
		if(balance <= 0) {
			interest = 0;
		}
		else {
			interest = 0.02;
		}
		
		double newBalance = balance + charges + balance * interest;
		double minPayment;
		
		if(newBalance < 50) {
			minPayment = newBalance;
		}
		else if(newBalance >= 50 && newBalance <=300) {
			minPayment = 50.00;
		}
		else {
			minPayment = 0.2 * newBalance;
		}
			
		System.out.printf("%n10%s %s %s %s%n=============================%n%n", "CS", "CARD", "International", "Statement");
		System.out.printf("%-20s  %5s%,.2f%n", "Previous Balance:","$", balance);
		System.out.printf("%-20s  %5s%,.2f%n", "Additional Charges:","$" , charges);
		System.out.printf("%-20s  %5s%,.2f%n%n%n", "Interest:", "$",interest);
		
		System.out.printf("%-20s  %5s%,.2f%n%n%n", "New Balance:","$", newBalance);
		System.out.printf("%-20s  %5s%,.2f%n", "Minimum Payment:","$" ,minPayment);
		
		
		
	}//end main
}//end class
