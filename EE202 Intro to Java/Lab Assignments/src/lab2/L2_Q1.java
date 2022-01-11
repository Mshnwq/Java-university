package lab2;
import java.util.Scanner;

public class L2_Q1 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner( System.in );
		int num1, num2, num3;
		int sum;
		int product;
		double average;
		System.out.println( "Enter first integer:" );
		num1 = input.nextInt();
		System.out.println( "Enter second integer:" );
		num2 = input.nextInt();
		System.out.println( "Enter third integer:" );
		num3 = input.nextInt();
		sum = num1 + num2 + num3;
		product = num1 * num2 * num3;
		average = ( num1 + num2 + num3 ) / 3.0;
		System.out.printf( "The sum is %d\nThe product is %d\nThe average is %f\n",
		sum,product, average );
		}
}
