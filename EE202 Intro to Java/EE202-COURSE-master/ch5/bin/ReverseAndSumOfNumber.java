import java.util.*;
public class ReverseAndSumOfNumber {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Enter number: ");
		int number = input.nextInt();
		
		//counting digits
		int i = 1, countDigits = 0;
		while(number / i != 0) {
			i *=10;
			countDigits++;
		}//end while loop
		
		
		int reverse = 0, j = 1;
		for(int i2 = 1; i2<=countDigits; i2++) {
			j *=10;
			i /=10;
			reverse +=((number % j) / (j/10) ) * i;
			
		}//end for loop
		System.out.println( "Reverse "+ reverse);
		System.out.println("Sum: " + (reverse+number));
		
		
	}//end main 
}//end class
