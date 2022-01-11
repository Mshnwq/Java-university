import java.security.SecureRandom;
import java.util.Scanner;
public class CoinTossing {

	private enum Flip {HEAD, TAILS};//enum is class, Flip is Type
	public static final SecureRandom randomNumber = new SecureRandom();
	public static final Scanner input = new Scanner(System.in);
	
	private static Flip flip() { //must return Flip Type
	int random = randomNumber.nextInt(2);//[0,2)
	Flip flipSide ; //flipSide is object
	if(random == 0) flipSide = Flip.HEAD;
	else flipSide = Flip.TAILS;
	return flipSide;
	
	}
	
	public static void main(String[] args) {
		int countHead = 0, countTails = 0;
		Flip flipSide; /*
		must create flipSide object cuz flipSide of flip() is hidden from
		the main method
		 */
		boolean continueWhileLoop = true;
		do {
			
			System.out.print("Enter y to flip or n to quit: ");
			String answer = input.next();
			
			switch(answer) {
			case "Y": case "y": 
				flipSide = flip();
				if(flipSide == Flip.HEAD) countHead++;
				else countTails++; 
					
				System.out.println(flipSide);
				break;
			default:
				continueWhileLoop = false;
					
			}
			
		}while(continueWhileLoop);
		
		System.out.println("\nHead\tTails");
		System.out.println(countHead + "\t" + countTails);
	}//end main method
}//end CoinTossing
