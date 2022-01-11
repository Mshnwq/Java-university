/**
 * This class for practicing midTerm
 */
import java.util.*;
public class TestApp{
	//Constants
	public static final int i = 1;
	//instance variables
	private char letter ;
	private double balance;
	
	public static boolean isPositive(int n, int r) {
		return (n-r > 0); 
	}
	//main method
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println(isPositive(1,4));
		
	}//end main method
	
	//constructors
	
	
		
		
		
	//methods
	public void factorial(int number) {
		if(number == 0)
			System.out.println("0! = 1");
		else {
			int f = 1;
			for(int i = 1; i<=number; i++)
				f *=i;
			System.out.printf("%d! = %d%n", number, f);
		}
			
	}
	public static int tenPowerOfDigits(int number) {
		
		int i = 1; 
		while(number / i != 0) {
			i *=10;
		}
		
		return i;
	}
	
	public static int getPentagonal(int n) {
		return (n*(3*n-1)/2);
	}//getPentagonal
	
	public static long sumDigits(int n) {
		long sum = 0;
		int i = tenPowerOfDigits(n);
		
		for(; i >=1; i /=10) {
			sum +=(n/i)%10;
		}
		
		return sum;
		
	}//end sumDigits
	
	public static int numberOfDigits(int number) {
		int count = 0, i = 1; 
		while(number / i != 0) {
			i *=10;
			count++;
		}
		return count;
		
	}//end numberOfDigits
	public static int reverse(int number) {
		int reverse = 0;
		int numberOfDigits = numberOfDigits(number);
		int tenPowerOfDigits = tenPowerOfDigits(number);
		int div = number;
		int rem = 0;
		for(int i = 1; i<=numberOfDigits; i++) {
			rem = div % 10; 
			tenPowerOfDigits /=10; 
			reverse += (tenPowerOfDigits) * rem;
			div /= 10; 
		}
		
		return reverse;
	}
	
	public static boolean isPalindrome(int number) {
		
		boolean isPalindrome = (number == reverse(number) ? true:false);
		
		return isPalindrome;
	}
	
	public static void displaySortedNumbers(double num1, double num2, double num3) {
		double middle = 0;
		if((num1 < num2 && num2 < num3 ) || (num3 < num2 && num2 < num1 ) )
			middle = num2;
		if((num2 < num1 && num1 < num3 ) || (num2 < num1 && num1 < num2 ) )
			middle = num1;
		if( (num1 < num3 && num3 < num2 ) || (num2 < num3 && num3 < num1 ) )
			middle = num3;
		String s =Math.min(num1, Math.min(num2, num3)) + "\n" + middle + "\n" + Math.max(num1, Math.max(num2, num3));
		
		System.out.println(s);
		
	}
	
	public static void dispalyPattern1(int number ) {
		for(int i = 1; i<=number; i++) {
			for(int j = 1; j<=i; j++)
				System.out.print(j + " ");
			System.out.println();
		}
	}
	
	public static void displayPattern2(int number) {
		for(int i = number; i >= 1; i--) {
			for(int j = i; j>=1; j--)
				System.out.print(j + " ");
			for(int j = 2; j <= i; j++)
				System.out.print(j + " ");
			
			System.out.println();
			
		}//end for loop
		
		
	}//end displayPattern2 method
	
	public static void stars(int number) {
		for(int i = 1; i<=number; i++) {
			for(int space = 1; space<=number-i; space++)
				System.out.print(" ");
			for(int j = 1; j<=2*i-1; j++)
				System.out.print("*");
				
			System.out.println();	
		}
		
		for(int i = number-1; i >=1; i--) {
			for(int space = 1; space<= number -i; space++)
				System.out.print(" ");
			for(int j = 1; j<=2*i-1;j++)
				System.out.print("*");
			
			System.out.println();
			
		}
		
	}//end stars method
	public static void letters(int number) {
		String s = " ABCDEFGHIJKLMNOPQRSTUVWYZ";
		for(int i =1 ; i<=number; i++) {
			for(int space = 1; space<=number-i; space++)
				System.out.print(" ");
			for(int j = 1; j<=i; j++)
				System.out.print(s.charAt(j));
			for(int j = i-1; j>=1; j--)
				System.out.print(s.charAt(j));
			
			System.out.println();
				
		}//end for loop1!
		
		for(int i = number-1; i>=1; i--) {
			for(int space = 1; space<=number-i; space++)
				System.out.print(" ");	
			for(int j = 1; j<=i; j++)
				System.out.print(s.charAt(j));
			for(int j = i-1; j>=1; j--)
				System.out.print(s.charAt(j));	
				
			System.out.println();	
			
		}
		
	}//end letters method
	public static void starsAndPlusDisplay() {
		int k = 9;
		for(int i = 1; i<=5; i++) {
			for(int j = 1; j<=i; j++)
				System.out.print("+");
			for(int j = 1; j<=k ; j++) {
				System.out.print("*");
			
			}
			k -=2;
			for(int j = 1; j<=i ; j++) 
				System.out.print("+");
				
			
				
			
			
			System.out.println();
		}
	}
	
	public void setBalance(double balance) {this.balance = balance;}
	public double getBalance() {return balance;}
	
	public void withdrawAmount(double withdrawAmount) {
		balance -=(withdrawAmount > balance? 0:withdrawAmount);
	}
	
	public void emptyAccount() {balance = 0.0; }
}//end class