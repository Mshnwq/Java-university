import java.util.Scanner;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.ArrayList;

	
public class Duplicate {
	final static Scanner input = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		

		int[] array = new int[11];
		int index = 0;
		
		for(int i = 1; i<=10; i++) {
			System.out.print("Enter: ");
			int number = input.nextInt();
			
			while(number < 10 || number > 100 ) {
				System.out.println("OUT OF RANGE!");
				System.out.print("Enter ");
				number = input.nextInt();
				
			}//end while
			
			for(int e : array) {
				if(e == number) {
					System.out.println("Duplicate");
					break;
				}
				else {
					array[index] = number;
					index++;
					break;
					
					
				}
			}
			
				for(int counter = 0; counter < index; counter++) 
					System.out.print(array[counter] + " ");
				
				System.out.println();	
			
		}

		
		
		
		

	}//end main method

}//end class

