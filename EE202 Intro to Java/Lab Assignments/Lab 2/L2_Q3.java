package lab.assignment2;
import java.util.Scanner;
public class L2_Q3 {
	public static void main(String[] args) {
		Scanner input = new Scanner( System.in );
		int i = 0;
		int sum = 0;
		System.out.println("Eneter ten integers");
		
		while (i<10) {
			int inp = input.nextInt();
			sum += inp;
			i++;
		}
		System.out.printf("The sum of the first ten integers is %d%n"
				+ "The average of the first ten integers is %f%n", sum, sum/10.0);
	}
}
