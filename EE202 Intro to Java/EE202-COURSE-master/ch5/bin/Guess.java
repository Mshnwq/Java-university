import java.util.Scanner;
import java.util.Random;
public class Guess {
	public static void main(String[] args) {
		
		int numToGuess;
		int guess;
		int counter = 0;
		int counterLow = 0;
		int counterHigh = 0;
		
		
		Scanner scan = new Scanner(System.in);
		Random generator = new Random();
		
		guess = generator.nextInt(11);//(0,10)
		System.out.print("Enter guess: ");
		numToGuess = scan.nextInt();
		
		
		while(numToGuess != guess) {
			if(numToGuess < guess) {
				System.out.println("Too low");
				counterLow++;
			}//end if
			else {
				System.out.println("Too high");
				counterHigh++;
			}//end else
			
			System.out.print("Enter guess: ");
			numToGuess = scan.nextInt();
			counter++;
			
		}//end while loop
		
		System.out.println("Congratulations!!");
		System.out.printf("%s %d%n%s %d%n%s %d%n", "Low times", counterLow, "High times", counterHigh,"Total tries", counter );
		
		
	}//end main

}//end class
