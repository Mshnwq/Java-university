import java.util.Scanner;
public class LabChapter6 {

	static Scanner input = new Scanner(System.in);
	
	public static int sumOfDigits(int number) {//Method1
		int sum = 0;
		int ten = 1;
		while(number / ten != 0) {			
			ten *=10;
			sum += (number % ten) / (ten/10);
			
		}
		return sum;
	}//end sumOfDigits
	
	public static boolean isPerfect(int number) {
		int counter = 1; 
		int sum = 0;
		
		boolean isPerfect = false;
		
		while(counter < number) {//must not equal to numberPLEASE!
			if(number % counter == 0 )  {
				sum +=counter;
			}//end f1
			
			counter++;
		}//end while loop
		if(sum == number ) isPerfect = true;
	return isPerfect;
	}
	
	
	
	public static void main(String[] args) {
		
		
		
	}//end main method
}//end class
