import java.util.Scanner;
public class TotalAndAverage {

	public static double sum(double n1, double n2, double n3, double n4, double n5) {
		return n1+n2+n3+n4+n5;
	}
	public static double average(double sum) {
		return sum/5;
	}
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number 1: ");
		double n1 = input.nextDouble();
		System.out.println("Enter number 2: ");
		double n2 = input.nextDouble();
		System.out.println("Enter number 3: ");
		double n3 = input.nextDouble();
		System.out.println("Enter number 4: ");
		double n4 = input.nextDouble();
		System.out.println("Enter number 5: ");
		double n5 = input.nextDouble();
		
		System.out.printf("The sum is: %.1f%n", sum(n1, n2, n3, n4, n5));
		System.out.printf("The average is: %.1f%n", average(sum(n1, n2, n3, n4, n5)));
	}
}
