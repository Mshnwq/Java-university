import java.util.Scanner;
public class SumOfSqure {

	public static int sumOfSqures(int num) {
		int sum = 0;
		for(int counter = 1; counter <=num; counter++)
			sum +=Math.pow(counter, 2);
		return sum;
		
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int number = input.nextInt();
		System.out.println("The sum is: " + sumOfSqures(number));
	}
}
