import java.util.*;
public class FactorialForLoop {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Input the number:  ");
		int num = input.nextInt();
		
		String letters = " ABCDEFGHIJKLMNOPQRSTUVWYZ";
		for(int i = 1; i<=num; i++) {
			for(int space = 1; space<=7-i; space++) {
				System.out.print(" ");
			}
			
			int j =1;
			for(; j<=i ; j++) {
				System.out.print(letters.charAt(j));
			}
			
			if(i!= 1) {
				j -=2;
				for( ; j>=1; j--) {
					System.out.print(letters.charAt(j));
				}
			}
			
			
			System.out.println();
		}
		for(int i = num-1; i>=1; i--) {
			for(int space = 1; space<=num - i; space++) {
				System.out.print(" ");
			}
			int j = 1;
			for(; j<=i; j++) {
				System.out.print(letters.charAt(j));
			}
			
			if(i!= 1) {
				for(int k = j-2; k>=1; k--) {
					System.out.print(letters.charAt(k));
				}
			}
			
			
			System.out.println();
		}
		
		
		
		/*//computing factorial
		System.out.print("Please enter a nonnegative integer: ");
		int number = input.nextInt();
		
		for(; number<0; ) {
			System.out.println("Factorial is undefined for negative numbers.");
			System.out.print("Please enter a non-negative integer: ");
			number = input.nextInt();
		}
		
		int f = 1;
		for(int i = 1; i<=number; i++) {
			f *=i;
		}
		
		System.out.printf("%d! = %d%n", number, f);
		*/
		
	}//end main method
}//end class
