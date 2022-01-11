import java.util.*;
public class Ex2 {
	public static void main(String[] args) {
		
		for(int i = 1; i<=10; i++) {
			for(int j = 1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();//new line
		
		
		for(int i = 10; i>=1; i--) {
			for(int j = 1; j<=i; j++) {
				System.out.print("*");
				
			}
			System.out.println();
		}
		
		
		System.out.println();//new line
		
		for(int i = 10; i>=1; i--) {
			for(int space = 1; space<=10-i; space++) {
				System.out.print(" ");
			}
			for(int j = 1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();//new line
		
		for(int i = 1; i<=10; i++) {
			for(int space = 1; space<=10-i; space++) {
				System.out.print(" ");
			}
			for(int j = 1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();//new line
		
		for(int i = 9; i>=1; i -=2) {
			for(int space = 1; space<=9-i; space+=2) {
				System.out.print(" ");
			}
			for(int j = 1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 1; i<=9; i+=2) {
			for(int space = 1; space<=9-i; space +=2) {
				System.out.print(" ");
			}
			for(int j = 1; j<=i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}//end main

}
