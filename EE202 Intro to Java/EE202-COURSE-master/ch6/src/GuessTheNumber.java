import java.security.SecureRandom;
import java.util.Scanner;
public class GuessTheNumber {

	public static final Scanner input = new Scanner(System.in);
	public static final SecureRandom randomNumber = new SecureRandom();
	
	public static int guessNumber() {
		return 1 + randomNumber.nextInt(1000);
	}
	
	
	public static void main(String[] args) {
		//boolean continueLoop = true;
		
		int guessNumber1 = guessNumber();
		int guessNumber2 = guessNumber();
		
		
		do {
			System.out.print("Asma: ");
			int asmaGuess = input.nextInt();
			if(asmaGuess == guessNumber1) {
				System.out.println("Pravo Asma!");
				break;
				
			}
			else {
				if(asmaGuess> guessNumber1)System.out.println("Too high");
				if(asmaGuess< guessNumber1)System.out.println("Too Low");
				
			}
				
			
			System.out.print("DAD: ");
			int muhammadGuess = input.nextInt();
			
			if(muhammadGuess == guessNumber2) {
				System.out.println("Pravo DAD!");
				break;
			}
			else {
				if(muhammadGuess> guessNumber2)System.out.println("Too high");
				if(muhammadGuess< guessNumber2)System.out.println("Too low");
				
			}
			
			
			
		}while(true);
		
//		
//		do {
//			System.out.print("Enter y to start the game or anything to quit: ");
//			String yourAnswer = input.next();
//			
//			switch(yourAnswer) {
//			case "Y": case "y":
//				int guessNumber = guessNumber();
//				System.out.println("Enter number: ");
//				int yourNumber = input.nextInt();
//				while(yourNumber!= guessNumber) {
//					if(yourNumber > guessNumber)System.out.println("Too high");
//					else System.out.println("Too low");
//					
//					System.out.println("Enter number: ");
//					yourNumber = input.nextInt();
//				}
//				System.out.println("Pravo");
//				
//				break;
//			default:
//				continueLoop = false;
//			}//end switch
//		}while(continueLoop);
	}//end do while loop
}//end class
