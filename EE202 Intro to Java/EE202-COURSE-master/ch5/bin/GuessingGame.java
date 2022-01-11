import java.util.*;
public class GuessingGame {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random  rand  = new Random();
		int randomNumber = rand.nextInt(10);
		
		boolean isTrue = false;
		
		
		for(int i = 3; i>=1; i--) {
			System.out.print("I'm thinking about a number between 0 and 9.");
			System.out.print(" Can you guess it? (" + i + " attempts(s) lift) : ");
			int number = input.nextInt();
			
			
			if(number == randomNumber) {
				System.out.println();
				System.out.print("Cong!! correct");
				isTrue = true;
				break;
			}//if cond
			else {
				System.out.println();
				System.out.println("Sorry, Wrong number");
				System.out.println();
			}
			
			
		}//for loop
		
		if(isTrue == false) {
			System.out.println("The correcct number is " + randomNumber);
		}
		
		
		
	}//end main method
}//end class
