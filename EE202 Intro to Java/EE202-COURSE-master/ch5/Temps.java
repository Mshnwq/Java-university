
import java.util.Scanner;

public class Temps {

	public static void main(String[] args) {
		int HOURS_PER_DAY = 6;
		int temp; 
		Scanner scan = new Scanner(System.in);
		System.out.println();
		System.out.println("Temperature Readings for 6 Hour Period");
		System.out.println();
		
		for (int hour = 1; hour <= HOURS_PER_DAY; hour++) {//six times
			System.out.print("Enter the temperature reading at " + hour + " hours: ");
			temp = scan.nextInt();
		}
	}
}