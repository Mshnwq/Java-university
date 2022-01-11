import java.util.Scanner;
public class GasMileAge{
	Scanner input = new Scanner(System.in);
	private int num, miles, gallons, milesPerGallons, combinedMilesPerGallons; 
	
	public void calcMiles(){
		System.out.print("Enter your trip number or -1 to quit: ");
		num = input.nextInt();
		
		while(num != -1){
			System.out.print("Enter miles: ");
			miles = input.nextInt();
			
			System.out.print("Enter gallon: ");
			gallons = input.nextInt();
			
			milesPerGallons = miles / gallons;
			 
			 System.out.print("miles per gallons is: " + (double) milesPerGallons);
			combinedMilesPerGallons +=milesPerGallons;
			
			System.out.print("Enter your trip number or -1 to quit: ");
			num = input.nextInt();
			
			
			
		}
		
		System.out.print("Combined is: " + (double) combinedMilesPerGallons );
		
	}//end calcMiles method
	
	
	
	
}//end class