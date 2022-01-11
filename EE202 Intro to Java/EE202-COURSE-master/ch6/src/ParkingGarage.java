import java.util.Scanner;
public class ParkingGarage {

	private static final Scanner input = new Scanner(System.in);
	
	public static double charge(int hour) {
		if(hour>= 1 && hour<=3)
			return 2.00;
		else {
			if(hour <=24) {
				int rem = hour - 3;
				return 2.00+rem * 0.5;
			}
			else
				return 0.00;
		}
	}//end charge method
	
	public static void main(String[] args) {
		double sum = 0;
		int hour;
		
		do {
			System.out.print("Enter: ");
			hour = input.nextInt();
			if(hour == -1)break;
			sum += charge(hour);
			System.out.printf("currecnt $%.2f, Total %.2f%n", charge(hour), sum);
		}while(true);
	}
	
}//end class
