import java.util.Scanner;
import java.security.SecureRandom;
public class CH6{
	
	private static final SecureRandom randomNumber = new SecureRandom();
	private static final Scanner input = new Scanner(System.in);
	

	public static double min(int n1, int n2, int n3) {
		return Math.min(n1, Math.min(n2, n3));
	}
	
	public static void main(String[] args) {
		System.out.print("Or Enter: ");
		while(input.hasNext()) {
			int n1 = input.nextInt();
			System.out.print("Enter sec");
			int n2 = input.nextInt();
			System.out.print("Enter thi");
			int n3 = input.nextInt();
			double min = min(n1, n2, n3);
			System.out.printf(" Min is %.5f%n", min);
			System.out.println();
			
			System.out.print("Or Enter: ");
			
		}
		
		
	}//end main method
}//end class

