import java.util.*;
public class ex188 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input: ");
		int number = input.nextInt();
		
		for(int i = 1; i<=number; i++) {
			for(int space = 1; space<=number-i; space++)
				System.out.print(" ");
			for(int stars = 1; stars<=2*i - 1; stars++)
				System.out.print("*");
			
			System.out.println();
			
			if(i == number) {
				for(int j = number-1; j>=1; j-- ) {
					for(int space = 1; space<=number-j; space++)
						System.out.print(" ");
					for(int stars = 1; stars<= 2*j - 1; stars++)	
						System.out.print("*");
					
					System.out.println();
				}//end for bottom loop
				
			}//end if cond
		}//end for upper loop
		
		
	}//end main
}//end class
