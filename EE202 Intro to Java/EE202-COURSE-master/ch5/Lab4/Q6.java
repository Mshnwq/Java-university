import java.util.Scanner;

public class Q6{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter a nonnegative integer: ");
		int number = input.nextInt();
		
		for(; number<0; ){
			System.out.println("Factorial is undefined for negative numbers.");
			System.out.print("Please enter a non-negative integer: ");
		    number = input.nextInt();
			
		}
		
		if(number == 0){
			System.out.println("0! = 1\n");
		}
		else{
			int counter = number;
			int factorial = 1;
			for(; counter>1; counter--){
				factorial *= counter;
			}
			System.out.printf("%d! = %d\n", number, factorial);
			
		}
		
		
		
	}//end main method
	
}//end class