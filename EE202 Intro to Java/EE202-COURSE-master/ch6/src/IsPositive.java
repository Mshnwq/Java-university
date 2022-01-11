import java.util.Scanner;
public class IsPositive {
	public static boolean isPositive(int number) {
		return (number>=0);
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("How many number do you want to test? ");
		int times = input.nextInt();
		
		for(int counter = 1; counter<=times; counter++) {
			System.out.println("Enter a number: ");
			int number = input.nextInt();
			System.out.println("The result is: " + isPositive(number));
		}

	}

}
