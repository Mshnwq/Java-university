import java.util.Scanner;
public class Customers{
	//instance var
	private int balance, charges, credits, creditLimit, newBalance;
	
	//create a Scanner object!
	Scanner input = new Scanner(System.in);
	
	public void setBalance(){
		System.out.print("Enter Balance: ");
		balance = input.nextInt();
		
	}
	
	public void setCharges(){
		System.out.print("Enter Charges: ");
		charges = input.nextInt();
	}
	
	public void setCredits(){
		System.out.print("Enter Credits: ");
		credits = input.nextInt();
	}
	
	public void setCreditLimit(){
		System.out.print("Enter Credit Limit: ");
		creditLimit = input.nextInt();
	}
	
	public void setNewBalance(){
		newBalance = balance + charges - credits;
		System.out.println("New balance is " + newBalance);
		if(newBalance > creditLimit){
			System.out.println("Credit limit exceeded");
		}
	}
	
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		Customers customer1 = new Customers();
		
		
		
		int counter = 1, accountNumber;
		while(counter <= 10){
			System.out.print("Enter account number or(-1 to quit)");
			accountNumber = input.nextInt();
			customer1.setBalance();
			customer1.setCharges();
			customer1.setCredits();
			customer1.setCreditLimit();
			customer1.setNewBalance();
			
			System.out.println();
			
			counter ++;
			
			
			
			
		}
		
		




		
		
	}//end main method
}//end class









