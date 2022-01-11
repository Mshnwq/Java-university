import java.util.Scanner;

public class Q7{
	public static void main(String[] args){
		int number, counter = 1, largest;
		Scanner input= new Scanner(System.in);
		
		System.out.print("Enter number: ");
		number = input.nextInt();
		
		largest = number;
		
		
		while(counter <10){
			
			if(number > largest){
				largest = number;
			}
			System.out.print("Enter number: ");
			number = input.nextInt();
			
			
			
			counter++;
			
		}
		
		System.out.println("Larges number is " + largest);
		
	}//end main method
}//end class