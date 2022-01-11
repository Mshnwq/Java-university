package ch3Package;

import java.util.Scanner;
public class AccountTest1 {

	public static void main(String[] args) {
		/*LOCAL VAR ARE NOT AUTOMATICALLY INITIALIZED
		String myName;
		myName = "asma";
		System.out.println(myName);
		*/
		Account1 myAccount = new Account1("\"No name yet!\"", 0.0); //create object from Account1 class
		Scanner input = new Scanner(System.in);
		
		/*ANOTHER WAY TO CREATE OBJECT!
		 *Account1 myAccount;
		 *myAccount = new Account1(); 
		*/
		
		System.out.printf("Initial name is: %s and Initial balance is: %f%n", myAccount.getName(), myAccount.getBalance());
		
		System.out.print("Please enter the name: ");
		//String name = input.next();//Store the first word just!. Read the input only till the space
		String name = input.nextLine();//read a line of text
		myAccount.setName(name); //put var in myAccount name
		
		
		System.out.print("Enter your balance: ");
		double balance = input.nextDouble();
		myAccount.setBalance(balance);
		
		
		System.out.printf("Name in object myAccount is:%s and my balance is: %f%n",myAccount.getName(), myAccount.getBalance());
		
		
		System.out.print("Enter your deposite: ");
		double deposite = input.nextDouble();
		myAccount.depoite(deposite);
		System.out.printf("your balance is: %f", myAccount.getBalance());
		
		
		
		
	}

}
