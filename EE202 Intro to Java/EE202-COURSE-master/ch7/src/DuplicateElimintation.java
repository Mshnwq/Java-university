import java.util.Scanner;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.ArrayList;

	
public class DuplicateElimintation {
	final static Scanner input = new Scanner(System.in);
	
	
	
	
	public static void main(String[] args) {
		
		int[] array = new int[4];
		int index = 0;
		for(int i = 1; i<=5; i++) {
			System.out.print("Enter number: ");
			int number = input.nextInt();
			
			for(int element : array) {
				if(element == number) {
					System.out.println(+number + " has already been entered");
					break;
				}
				
				else {
					array[index] = number;
					index++;
					break;
				}	
 			}//end for2
			
			for(int j = 0; j<index; j++)
				System.out.print(array[j] + " ");
			
			System.out.println();
			
		}//end for1
		
		
		
		
		

	}

}







