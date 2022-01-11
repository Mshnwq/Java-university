package lab1;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an integer: ");   int val = sc.nextInt();
		
		if (val % 2 == 0) {System.out.printf("Number %d is even", val);	}
		
		else {System.out.printf("Number %d is odd", val); }
	}
}
