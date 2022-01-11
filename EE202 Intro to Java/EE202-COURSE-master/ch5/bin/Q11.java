import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("How many time? ");
		int times = input.nextInt();
		
		int number = 0,
			max = 0,
			min = 0, 
			sum = 0;
		
		if(times > 0) {
			System.out.print("Enter number: ");
			number = input.nextInt();
			max = number;
		}
		
		
		for(int i = 1; i <= times-1; i++) {
			System.out.print("Enter number: ");
			number = input.nextInt();
			
			if(number > max) {
				max = number;
			}
			else
				min = number;
			
			
			
		}//end for loop
		
		sum = max + min;
		System.out.println("Sum " + sum);
		
	}//end main 
}//end classs
