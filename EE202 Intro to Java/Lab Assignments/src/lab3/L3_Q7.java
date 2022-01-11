package lab3;
import java.util.Scanner;

public class L3_Q7 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number to compare: ");
		int inp = input.nextInt();
		
		if (inp > 120)
			System.out.printf("%s is greater than 120",inp);
		else if (inp < 120)
			System.out.printf("%s is less than 120",inp);
		else
			System.out.printf("%s is equal to 120",inp);
	}
}