import java.util.Scanner;

public class Temps {

	public static void main(String[] args) {
		int HOURS_PER_DAY = 6;
		int temp;
		
		Scanner scan = new Scanner(System.in);
		System.out.println();
		System.out.println("Temperature Readings for 6 Hour Period");
		System.out.println();
		
		
		System.out.print("Enter the temperature reading at " + hour + " hours: ");
		temp = scan.nextInt(); //temp = 4; 
		
		int max = temp, min = temp;//max = min = temp = 4; 
		int hMax = 1, hMin = 1;
		
		int hour = 1;
		
		
		for ( hour = 2; hour <= HOURS_PER_DAY ; hour++) {//hour=2,3,4,5,6
			System.out.print("Enter the temperature reading at " + hour + " hours: ");
			temp = scan.nextInt();  //temp = 12; 
			
			if(temp > max) {
				max =temp; //max = 12; 
				hMax = hour;//hour = 2; 
			}//end if1
			if(temp < min) {
				min = temp;
				hMin = hour;
			}//end if2
			
			
		}//end for loop
		
		
		
		System.out.println();
		
		System.out.println("The maximum temperature is " + max);
		System.out.println("It occured at hour " + hMax);
		System.out.println("The minimum temperature is " + min);
		System.out.println("It occured at hour " + hMin);
		
	}//end main method
}//end class
