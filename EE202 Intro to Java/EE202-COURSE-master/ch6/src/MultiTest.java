import java.util.Scanner;
import java.security.SecureRandom;
public class MultiTest {
	private static final Scanner input = new Scanner(System.in);
	private static final SecureRandom randomNumber = new SecureRandom();
	
	private static int number1, number2;
	
	public static int multiply() {
		number1 = randomNumber.nextInt(11);
		number2 = randomNumber.nextInt(11);
		System.out.println("How much is " + number1 + " times " + number2 + " ?");
		return number1 * number2;
		
	}
	
	public static void main(String[] args) {
		int  countCorrect = 0, countWrong = 0;
		
		int correctAnswer = multiply();
		while(true) {
			System.out.println("Enter your answer of -1 to exist: ");
			int yourAnswer = input.nextInt();
			int chance = 1 + randomNumber.nextInt(4);
			
			if(yourAnswer == -1)break;
			if(yourAnswer == correctAnswer) {
				switch(chance) {
				case 1 : System.out.println("Very good!");break;
				case 2 : System.out.println("Excellent!");break;
				case 3 : System.out.println("Nice work!");break;
				case 4 : System.out.println("Keep up");break;
				}
				countCorrect++;
				if (countWrong+countCorrect == 10)
					break;
			}
			else {
				while(yourAnswer != correctAnswer) {
					countWrong++;
					switch(chance) {
					case 1: System.out.println("No. Please Try");break;
					case 2: System.out.println("Wrong");break;
					case 3: System.out.println("Don't give up!");break;
					case 4: System.out.println("No. keep trying");break;
					}
					if (countWrong+countCorrect == 10)
						break;
					System.out.println("How much is " + number1 + " times " + number2 + " ?");
					yourAnswer = input.nextInt(); 
					chance = 1 + randomNumber.nextInt(4);
					if(yourAnswer == -1)break;
					
					
				}//end while2
				
				if (countWrong+countCorrect == 10)
					break;
				switch(chance) {
				case 1 : System.out.println("Very good!");break;
				case 2 : System.out.println("Excellent!");break;
				case 3 : System.out.println("Nice work!");break;
				case 4 : System.out.println("Keep up");break;
				}
				countCorrect++;
				
				
			}//end else
			
			correctAnswer = multiply();
		}//end while
		
		double percentage = (countCorrect/10.0)*100;
		if(percentage >=75)
			System.out.println("Pravo");
		else
			System.out.println("Please ask your instructor");
		
	}//end main method

}//end class
