package practiceQuizCh2Package;

import java.util.*;
public class Digits {

	public static void main(String[] args) {
		 
		Scanner input = new Scanner(System.in);
		int num, digit1, digit2, digit3, digit4, digit5, remainder;
		
		System.out.println("Enter number:");
		num = input.nextInt(); //num = 43219
		
		digit1 = num /10000; // digit1 = 4
		remainder = num % 10000; //remainder = 3219
		digit2 = remainder / 1000; //digit2 = 3
		remainder = remainder % 1000; //remainder = 219
		digit3 = remainder / 100; //digit3 = 2
		remainder= remainder%100; //remainder = 19
		digit4 = remainder/10; //digit4 = 1
		digit5 = remainder % 10 ;
		
		System.out.printf("%d  %d  %d  %d  %d  %n", digit1, digit2, digit3, digit4, digit5);
		
	}

}
