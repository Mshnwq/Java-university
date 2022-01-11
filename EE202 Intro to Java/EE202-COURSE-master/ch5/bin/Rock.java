import java.util.Scanner;
import java.util.Random;

public class Rock {

	public static void main(String[] args) {
		
		String personPlay;
		String computerPlay = "";
		int computerInt;
		
		Scanner scan = new Scanner(System.in);
		Random generator = new Random();
		
		System.out.println("Enter your play: R, P, or S");
		personPlay = scan.next();
		
		computerInt = generator.nextInt(3);//[0,3) or [0, 3-1] =[0,2]
		
		switch (computerInt) {
		case 0:
			computerPlay = "R";
			break;
		case 1:
			computerPlay = "P";
			break;
		case 2: 
			computerPlay = "S";
			break;
			
		
		}//end switch
		
		System.out.println("Computer play is " + computerPlay);
		
		if(personPlay.toUpperCase() == computerPlay) {
			System.out.println("It's a tie!");
		}
		else if(personPlay.toUpperCase().equals("R")) {//rock
			if(computerPlay.equals("S")) {
				System.out.println("Rock crushes scissor. You win!!");
			}
			else if(computerPlay.equals("P")) {
				System.out.println(". You loose!! Computer wins");
			}
		}
		
		else if(personPlay.toUpperCase().equals("P")) {
			if(computerPlay.equals("R")) {
				System.out.println(". You win!!");
			}
			else if(computerPlay.equals("S")) {
				System.out.println("scissor cut the paper. You loose!! Computer wins");
				
			}
				
		}
		
		else if(personPlay.toUpperCase().equals("S")) {
			if(computerPlay.equals("P")) {
				System.out.println("scissor will cut paper You win!!");
			}
			
			else if(computerPlay.equals("R")) {
				System.out.println("Rock crushes scissor. you loose win!! Computer wins");
				
			}
		}
		
		
	}//end main
}//end class Rock
