import java.util.Scanner;
public class Palindrome{

Scanner input = new Scanner(System.in);



private int num; //input number declartion

public void checkFiveDigits(){ //method NO.1
	System.out.print("Enter a 5-digit number: ");
	num = input.nextInt();
	
	while( ((num /(int)Math.pow(10,5) ) != 0 ) || ( num / ((int)Math.pow(10,4)) == 0 ) )
	{
		System.out.println("Number must be 5 digits!");
		
		System.out.print("Enter a 5-digit number: ");
		num = input.nextInt();
		
	}

}//end checkFiveDigitsMethod	

int rem, d1, d2, d3, d4, d5; //rem-remainder, -d1,d2,d3,d4,d5--digits!
public void seprateDigits(){ //Method NO.2
	d1 = num / (int) Math.pow(10,4);
	rem = num % (int) Math.pow(10,4);
	d2 = rem / (int) Math.pow(10,3);
	rem = rem % (int) Math.pow(10,3);
	d3 = rem /  (int) Math.pow(10,2);
	rem = rem %  (int) Math.pow(10,2);
	d4 = rem / (int) Math.pow(10,1);
	d5 =  rem % (int) Math.pow(10,1);
	
	
	
	
	
	
}//end seprateDigitsMethod

public void checkPalindrome(){//Method No.3
	
	this.seprateDigits();
	while (d1 != d5 ||  d2 != d4){
		
		System.out.println("Good it's a five digit number but it's not a palindrome!");
		System.out.println("Try again..");
		this.checkFiveDigits();
		this.seprateDigits();
		
		
		
	}
	
	System.out.println(num + " is a plaindrome!!!");
}//end checkPalindromeMethod



	
} //end class