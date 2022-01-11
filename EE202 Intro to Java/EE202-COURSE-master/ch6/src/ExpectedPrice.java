import java.util.Scanner;
public class ExpectedPrice {

	public static void expectedPrice(double price, double rate, int years) {
		for(int counter = 1; counter <= years; counter++) {
			System.out.println("The expected price after year " + counter + "is: " + price*Math.pow(1-rate, counter));
		}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the original price: ");
		double price = input.nextDouble();
		System.out.println("Enter the annual rate: ");
		double rate = input.nextDouble();
		System.out.println("Enter number of years: ");
		int years = input.nextInt();
		
		expectedPrice(price, rate, years);
	}
}
