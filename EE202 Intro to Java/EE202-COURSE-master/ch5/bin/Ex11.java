import java.util.*;
public class Ex11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Enter num: ");
		int num = input.nextInt();
		String letters = " ABCDEFGHIJKLMNORPQ";
		for(int i = 1; i<= num; i++) {
			for(int space = 1; space<= num - i; space++) {
				System.out.print(" ");
			}
			for(int j = 1; j<=i; j++) {
				System.out.print(letters.charAt(j));
			}
			for(int j = i-1; j>=1; j--) {
				System.out.print(letters.charAt(j));
			}
			
			
			System.out.println();
		}
		
		for(int i = num-1; i>=1; i--) {
			for(int space = 1; space<=num-i; space++) {
				System.out.print(" ");
			}
			for(int j = 1; j<=i; j++) {
				System.out.print(letters.charAt(j));
			}
			for(int j = i-1; j>=1; j--) {
				System.out.print(letters.charAt(j));
			}
			System.out.println();
			
			
		}
		
		/*
		System.out.print("Enter n: ");
		int num = input.nextInt();
		
		for(int i = 1; i<=(num*2) -1; i+=2) {
			for(int space = 1; space<=(num*2 -1) -i; space +=2) {
				System.out.print(" ");
			}
			for(int j = 1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i = num*2 -3; i>=1; i -=2) {
			for(int space = 1; space<=(num*2 -2)-i; space +=2) {
				System.out.print(" ");
			}
			for(int j = 1; j<=i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		*/
		
	}
}
