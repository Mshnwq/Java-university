import java.util.Scanner;

public class Q7{
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int number, counter = 1, largest;
		
		System.out.print("Enter number: ");
		number = input.nextInt();
		largest = number;
		
		for(; counter<10; counter++){
			System.out.print("Enter number: ");
			number = input.nextInt();
			if(number > largest){
				largest = number;
			}
		}
		
		System.out.println("Largest number is " + largest);
		
		
	}//end main method
	
}//end class