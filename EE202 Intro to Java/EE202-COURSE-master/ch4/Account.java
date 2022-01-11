import java.util.Scanner;

public class Account{
	Scanner input = new Scanner(System.in);
	
	//instanc var
	private String name;
	private double balance;
	private double withdrawAmount;
	
	//construcor
	public Account(String name, double balance){
		this.name = name;
		if(balance > 0){
			this.balance = balance;
		}//end if cond.
	}
	
	//setMethod
	public void setName(String name){
		this.name = name;
	}
	
	public void setBalance(double balance){
		if(balance > 0){
			this.balance = balance;
		}
	}
	
	//getMethod
	public String getName(){
		return name;
	}
	
	public double getBalance(){
		return balance;
	}
	
	//dispMethod
	public void displayInfo(){
		System.out.printf("%s balance: $%.2f\n", name, balance);
	}
	
	//withdrawMethod
	public void withdraw(){
		
		System.out.printf("\nEnter withdrawl amount for %s: ", name);
		withdrawAmount = input.nextDouble();
		System.out.println();
		
		System.out.printf("Substracting %.2f from %s balance\n",withdrawAmount, name );
		if(withdrawAmount < balance){
			balance -=withdrawAmount;
		}
		else{
			System.out.println("Debit amount exceede account balance");
		}
		
		
	}
	
	//main method
	public static void main(String[] args){
		
		Account account1 = new Account("account1", 50);//create first object
		Account account2 = new Account("account2", -3);//creat second object
		
		account1.displayInfo();
		account2.displayInfo();
		
		account1.withdraw();
		account1.displayInfo();
		account2.displayInfo();
		
		account2.withdraw();
		account1.displayInfo();
		account2.displayInfo();
		
		
		
		
		
	}//end main method
}//end class