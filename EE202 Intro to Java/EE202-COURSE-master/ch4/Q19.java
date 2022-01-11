import java.util.Scanner;
public class Q19 {
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		int itemNumber;
		double value,
			   result;
		
		System.out.print("Enter number of items: ");
		itemNumber = input.nextInt();
		
		while(itemNumber > 0){
			
			System.out.print("Enter the value: ");
			value = input.nextDouble();
			
			result = 200 + (0.09) * value;
			System.out.print("The result is: ");
			System.out.println(result);
			
			System.out.print("Enter number of items: ");
		    itemNumber = input.nextInt();
			
			
			
		}//end while
		System.out.println("Error input! Number of items must be positive");
			
			
		
		
	}//end main method
	
}//end class 