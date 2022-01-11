import java.util.*;
import java.security.SecureRandom;
public class Multiply {
	static SecureRandom randomNumbers = new SecureRandom();
	public static int multiplay() {
		int number1 = randomNumbers.nextInt(11);
		int number2 = randomNumbers.nextInt(11);
		System.out.println("How much is " + number1 + " times " + number2 + " ? ");
		return number1*number2;
	}
	
	public static void main(String[] args) {
		Scanner input  = new Scanner(System.in);
		int countCorrect = 0, countInCorrect = 0;
		
		while(true) {
			int rightAnswer = multiplay();
			System.out.println("Enter your answer (-1 to exit): ");
			int yourAnswer = input.nextInt();
			if(yourAnswer == -1) {
				System.out.println("percentage :  " + (countCorrect/(double)(countCorrect+countInCorrect))*100.0  + " %"  );
				if((countCorrect/(double)(countCorrect+countInCorrect))*100.0 <=75.0) {
					System.out.println("Please ask your instructor for help! ");
					countCorrect = 0;
					countInCorrect = 0;
					
				}
				break;
			}
			while(yourAnswer != rightAnswer) {
				countInCorrect++;
				System.out.println("No. Please try again.");
				System.out.println("Enter your answer (-1 to exit): ");
				yourAnswer = input.nextInt();
				
				
			}
			System.out.println("Very Good!");
			countCorrect++;
			
		}
	}

}
