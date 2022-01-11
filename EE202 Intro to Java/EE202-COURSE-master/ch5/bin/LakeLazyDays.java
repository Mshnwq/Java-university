import java.util.Scanner;
public class LakeLazyDays {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter tem: ");
		int temp = input.nextInt();
		
		if(temp >= 95) {//>=95
			System.out.println("Visit out shops!");
		}
		else if (temp >= 80){//>=80
			System.out.println("Swimming");
		}
		else if(temp >= 60 && temp< 80) {//tem>= 60  && tem<80
			System.out.println("Tennis");
		}
		else if(temp >= 40 && temp<60) {//tem>20 && tem<40
			System.out.println("golf");
		}
		else if (temp >= 20 && temp<40) {//tem<=20
			System.out.println("Skinnig");
		}
		else if(temp<20) {
			System.out.println("Visit out shops!");
		}
			
			
	}//end main method
}//end class 
