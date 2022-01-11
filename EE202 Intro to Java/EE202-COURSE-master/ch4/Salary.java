import java.util.Scanner;
public class Salary{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double cS, rating, raise;
		
		System.out.print("Enter the current salary: ");
		cS = input.nextDouble();
		System.out.print("Enter the performance rating: ");
		rating = input.nextDouble();
		
		if(rating == 1){
			raise = 0.06 * cS;
		}//end if
		else if(rating == 2){
			raise = 0.04 * cS;
		}
		else if(rating ==3){
			raise = 0.015 * cS;
		}
		else{
			System.out.println("Error input!");
			raise = 0;
			
		}
		
		System.out.printf("Amount of your raise: $%.1f\n", raise);
		System.out.printf("Your new salary: $%.1f\n", raise + cS);
		
	}//end main method
	
}//end class