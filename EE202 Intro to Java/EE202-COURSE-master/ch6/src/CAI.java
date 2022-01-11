import java.security.SecureRandom;
import java.util.Scanner;
public class CAI {
	private static final SecureRandom randomNumber = new SecureRandom();
	private static final Scanner input = new Scanner(System.in);
	private static int number1, number2;
	
	public static int multiplay() {
		 number1 = 1 + randomNumber.nextInt(10);
		 number2 = 1 + randomNumber.nextInt(10);
		
		System.out.printf("How much is %d times %d ? %n", number1, number2);
		return number1*number2;
	}
	
	
	public static void main(String[] args) {
		
		int countCorrect = 0, countWrong = 0, count = 0;
		boolean isContinue = true;
		
		while(isContinue) { 
			
			int correctAnswer = multiplay();
			
			int yourAnswer = input.nextInt();
			int response = 1 + randomNumber.nextInt(4);
			
			boolean isWrong = yourAnswer!= correctAnswer;
			while(isWrong) {
				
				countWrong++;
				count++;
				if(count == 10)
					break;
				switch(response) {
				case 1: System.out.println("No. Please try again.");break;
				case 2: System.out.println("Wrong. Try once more.");break;
				case 3: System.out.println("Don't give up!");break;
				case 4: System.out.println("No. Keep Trying");break;
				}//end switch
				System.out.printf("How much is %d times %d ? %n", number1, number2);
				yourAnswer = input.nextInt();
				isWrong = yourAnswer!=correctAnswer;
				response = 1 + randomNumber.nextInt(4);
				
			}//end while loop
			
			countCorrect++;
			count++;
			
			
				response = 1 + randomNumber.nextInt(4);
				switch(response) {
				case 1: System.out.println("Very good!");break;
				case 2: System.out.println("Excellent!");break;
				case 3: System.out.println("Nice work!");break;
				case 4: System.out.println("Keep up the good work!");break;
				}//end switch
				
				if(count == 10) {
					double percentage = (countCorrect/10.0) * 100;
					if(percentage >= 75) 
						System.out.println("Pravo you are ready to go to the next leve!");
					else 
						System.out.println("Please ask yout teacher for extra help!"); 
					countCorrect = 0;
					countWrong = 0;
					count = 0;
					System.out.println("Reset....");
					//isContinue = false;
				}//end == 10 if
			
			
			
		}//end while true 
		
		
	}//end main method

}//end classs
