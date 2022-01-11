import java.util.*;
public class SumOfDigits {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Input: ");
		int number = input.nextInt();
		
		
		
		int i = 1, sum = 0;
		
		while(number/i !=0) {
			i *=10;
			sum += (number % i) / (i/10) ;
		}
		
		System.out.println("Sum of digits: " + sum);
		
	}
}
