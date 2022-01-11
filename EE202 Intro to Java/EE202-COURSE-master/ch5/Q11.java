import java.util.Scanner;
public class Q11{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("How many value? ");
		int counter = input.nextInt();
		
		int number = 0,
			largest = 0,
			smallest = 0,
			sum = 0;
		
		System.out.print("Enter a number: ");
		largest = input.nextInt();
		
		for(; counter > 1; counter--){
			
			System.out.print("Enter a number: ");
			number = input.nextInt();
			
			if(number > largest){
				largest = number;
			}//end if cond
			else if(number < largest ){
				smallest = number; 
			}//end else if cond
			
		}//end for loop
		
		System.out.printf("%d is largest, %d is smallest\nThe sum is %d\n", largest, smallest, (largest+smallest));
		
	}//end main method
}//end class