import java.security.SecureRandom;
public class Lab7 {
	private static final SecureRandom randomNumber = new SecureRandom();
	private static int die1, die2;
	private static int total;
	
	
	public static void roll() {
		die1 = 1 + randomNumber.nextInt(6);
		die2 = 1 + randomNumber.nextInt(6);
		
		total = die1 + die2;
		System.out.printf("You rolled, die1-%d and die2-%d for a total of %d", die1,die2, total);
		
		
	}
	
	public static void main(String[] args) {
		int counter = 1; 
		while(counter<=5) {
			roll();
			if(total > 10) {
				System.out.printf(", Total is>10%n");
				continue;
				
			}//end if 
			System.out.println();
			counter++;
		}
	}

}
