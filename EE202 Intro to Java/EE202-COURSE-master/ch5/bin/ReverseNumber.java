import java.util.*;
public class ReverseNumber {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number: ");
		int number = input.nextInt();
		
		int i = 1, reverse = 0, rem = 0, countDigit = 0;
		
		while(number / i != 0) {
			i *=10;
			countDigit ++;
			
		}//end while
		
		int number2 = number;
		for (i /=10; i>=1; i /=10) {
			rem = number2 % 10;
			number2 /= 10;
			reverse += rem * i;
		}
		
		System.out.println("Reverse " + reverse);
		System.out.println("Sum " + (number + reverse) ) ;
		
	}//end main method
}//end class
