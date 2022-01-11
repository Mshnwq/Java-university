import java.util.Scanner;
public class LargestNumber{
public static void main(String[] args){
	
	
	int number, 
		counter = 1, 
		largest1,
		largest2;
		
	Scanner input = new Scanner(System.in);
	System.out.print("Enter number: ");
	number = input.nextInt();
	largest1 = number; 
	
	System.out.print("Enter number: ");
	number = input.nextInt();
	largest2 = number; 
	
	
	
	
	
	while(counter <= 8){
		System.out.print("Enter number: ");
		number = input.nextInt();
		
		if(number > largest1 || number > largest2){
			if(largest1 < largest2){
				largest1 = number;
			}
			else if(largest2 < largest1){
				largest2 = number;
			}
			
		}
		
		counter++;
		
	}//end while
	
	System.out.println("Largest number1 is " + largest1 + " Largest number2 is  " + largest2);
}//end main method
	
}//end class
