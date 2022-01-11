package ch3Package;
//AccountTest Class that creates and use an object of class Account
//Class Account cannot execute by itself because it does not contain a main method to fix: 
/*
 ** Declare a separate class that contains a main method OR --I will use this way
 ** Place a main method in class Account
 */
import java.util.Scanner;
//as Account and AccountTest classes are in the same package so I do not need to use import
public class AccountTest { //separate class AccountTest containing method main to test class Account
	//class AccountTest drives an Account object, telling it what to do by calling its methods.
	public static void main(String[] args) { //once main begins executing, it may call other methods in this and other classes
		//Class AccountTest's main method creates on Account object and calls its getName and setName methods.
		
		Scanner input = new Scanner(System.in);//create a Scanner object to obtain input from the command window
		//type  instance variable = create new object of the specified class
		Account myAccount = new Account("");//create an Account object and assign it to myAccount
		//new--the word new creates a new object of the specified class
		//Account()--the parentheses are required in combination with a class name represent a call to constructor which is similar to a method but is called implicitly by the new operator to initialize an objecct's instance variables when the object is created 
		//Account()--we can place an argument in the parentheses to specify an initial value for an Account object's name instance variable
		//myAccount--object
		
		System.out.printf("Initial name is : %s%n%n", myAccount.getName());//display initial value of name (null)
		//null--the Default initial value for String variables
		//every instance variable has a default initial value-a value that provided by java when you do not specify the instance variable's initial value
		//unlike local variables which are not automatically initialized
		
		
		System.out.println("Enter the name: "); //prompt for and read name
		String theName = input.nextLine();//read a line of text
		
		myAccount.setName(theName); //put theName in myAccount
		//myAccount --object
		//setName--method
		System.out.println(); // outputs a blank line;
		
		System.out.printf("Name in object myAccount is:%n%s%n", myAccount.getName());//display the name stored in object myAccount
		
		Account account1 = new Account("Asma");//constructor
		System.out.printf("account1 name is : %s%n", account1.getName());
		
	}



}
