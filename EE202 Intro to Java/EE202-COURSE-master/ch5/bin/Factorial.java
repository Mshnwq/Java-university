import java.util.Scanner;
public class Factorial {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int number; 
		do {
			System.out.print("Enter number: ");
			number = input.nextInt();
		}while(number < 0);
		
		
		
		int f = 1;
		for(int i = 1; i<=number; i++) {
			f *=i;
		}
		System.out.printf("Factorial of %d is %d%n", number, f);
		
			
	}//end main method

}//end class
