import java.util.*;
import java.text.NumberFormat;
public class Salary {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		double cS,
			   r = 0.00,
			   nS= 0.00;
		String rating;
		
		System.out.print("Enter current salary: ");
		cS = input.nextDouble();
		System.out.print("Enter the performance rating (Excellent, Good, or poor) : ");
		rating = input.next();
		
		switch(rating) {
		case "Excellent":
			r = 0.06 * cS;
			break;
		case "Good":
			r = 0.04 * cS;
			break;
			
		case "poor":
			r = 0.015 * cS;
			break;
		
		}//end switch
		
		nS = cS + r;
		System.out.println();
		System.out.printf("%-20s   %10s%,.2f%n", "Current Salary:","SAR", cS);
		System.out.printf("%-15s   %4s%,.2f%n", "Your Amount of your raise:","SAR", r);
		System.out.printf("%-20s   %10s%,.2f%n", "Your new salary:", "SAR",nS);
		
		
	}//end main method
}//end class
