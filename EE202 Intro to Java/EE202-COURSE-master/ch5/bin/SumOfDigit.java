import java.util.*;
public class SumOfDigit {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Input: ");
		int number = input.nextInt();
		
		int sum = 0;
		int i = 1; 
		while(number/i !=0) {
			i *=10;
			sum +=(number % i) / (i/10);
		}
		System.out.println(sum);
		
	}//end main method
}//end class
