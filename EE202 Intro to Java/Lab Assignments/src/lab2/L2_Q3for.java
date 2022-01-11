package lab2;
import java.util.Scanner;
public class L2_Q3for {
	public static void main(String[] args) {
		Scanner input = new Scanner( System.in );
		int sum = 0;
		System.out.println("Enter ten integers");
		
		for (int i = 0; i<10 ; i++) {
			int inp = input.nextInt();
			sum += inp;
		}
		System.out.printf("The sum of the first ten integers is %d%n"
				+ "The average of the first ten integers is %.2f%n", sum, sum/10.0);
	}
}
