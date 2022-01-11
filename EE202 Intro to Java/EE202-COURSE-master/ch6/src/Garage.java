import java.util.*;
public class Garage {

	public static double currentCharge(int hour) {
		
		switch(hour) {
		case 1: case 2: case 3: return 2.00; 
		default:
			int rem = hour - 3;
			if(rem > 21)
				return 0.00;
			else {
				return 2.00 + rem * 0.50;
			}
		}//end switch
		
	}//end currentCharge method
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int hour;
		double currentCharge, total = 0;
		do {
			System.out.print("Enter number of hours (a negative to quit): ");
			hour = input.nextInt();
			if(hour < 0 ) break;
			currentCharge = currentCharge(hour);
			total +=currentCharge;
			System.out.printf("Current charge: $%.2f, Total recipts: $%.2f%n", currentCharge, total);
		}while(true);
	}//end main method
	
}
