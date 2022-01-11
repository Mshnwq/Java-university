import java.util.Scanner;
import java.security.SecureRandom;
public class CrapsGame {
	
	private static final SecureRandom randomNumber = new SecureRandom();
	private static final Scanner input = new Scanner(System.in);
	private static int sum;
	
	
	
	//methods
	public static void roll() {
		int die1 = 1 + randomNumber.nextInt(6);
		int die2 = 1 + randomNumber.nextInt(6);
		sum = die1 + die2;
		
		System.out.printf("%d+%d=%d%n", die1, die2, sum);
		
	}
	
	public static boolean isWin() {
		if(sum == 7 || sum == 11) 
			return true;
		
		else if (sum == 2 || sum == 3 || sum == 12)
			return false;
		else
			return myPoint();
	}
	
	public static boolean myPoint() {
		boolean isWin = true;
		int myPoint = sum;
		roll();
		while(myPoint != sum) {
			if(sum == 7) {
				isWin = false;
				break;
			}//end if
			roll();
			
		}//end while
		return isWin;
	}//end myPoint
	
	
	public static void main(String[] args) {
	
		roll();
		if(isWin())System.out.println("Win");
		else System.out.println("lose");
		
	}//end main method

	
}
