import java.util.Scanner;
public class largest {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int largest ; 
		
		System.out.print("Enter number: ");
		largest = input.nextInt();
		int smallest = 0;
		
		for(int counter = 2; counter<=10; counter++) {
			System.out.print("Enter number: ");
			int number = input.nextInt();
			
			if(number > largest) {
				largest = number; 
			}
			else {
				smallest = number;
			}
			
		}
		
		System.out.println("Largest number is " + largest);
		System.out.println("Smallest number is " + smallest);
		
		
	}//end main method

}//end class
