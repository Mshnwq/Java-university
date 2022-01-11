package lab4;
import java.util.Scanner;

public class Palindrome 
{
	public void checkPalindrome()
	{
		Scanner input = new Scanner( System.in );
		int number;
		int digit1 = 0;
		int digit2 = 0;
		int digit4 = 0;
		int digit5 = 0;
		
		System.out.print("Enter a 5 digit number: ");
		number = input.nextInt();
		
		int digits = Integer.toString(number).length();
		
		while ( digits != 5) 
		{
			System.out.println("Number must be 5 digits long, try again");
			System.out.print("Enter a 5 digit number: ");
			number = input.nextInt();
			digits = Integer.toString(number).length();
		}
	
		digit1 = number/10000;
		digit2 = (number%10000)/1000;
		digit4 = (((number%10000)%1000)%100)/10;
		digit5 = ((((number%10000)%1000)%100)%10);
		
		if (digit1 == digit5 && digit2 == digit4)
			System.out.printf("%d is a Palindrome", number);
		else
			System.out.printf("%d is not a palindrome", number);
	}
}