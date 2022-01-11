import java.util.Scanner;

public class Lab4AsmaSarouji {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int times;
		
		System.out.print("How many times? ");
		times = input.nextInt();
		
		int number,
			max = 0,
			min = 0,
			sum = 0;
		
		if(times > 0 ) {
			System.out.print("Enter number: ");
			number = input.nextInt();
			max = number;
		}
		
		for(int i = 1; i <=times-1 ; i++) {
			System.out.print("Enter number: ");
			number = input.nextInt();
			
			if(number > max) {
				max = number;
			}
			else {
				min = number;
			}
				
			
		}
		
		sum = max + min;
		System.out.println("Sum " + sum);
			
		
		
		

	}

}
