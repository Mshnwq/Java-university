import java.util.Scanner;
public class TrackingSales {

	private final static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
	System.out.print("Enter number of sales people: ");
	int length = input.nextInt();
	
	if(length <= 0)
		System.out.println("Error");
	else {
		int[] array = new int[length];
		for(int i = 0; i<length; i++) {
			System.out.println("Sale person " + (i+1) + " amount: ");
			int amount = input.nextInt();
			array[i] = amount;
		}//end for loop
		
		
		//diesplay
		System.out.println("Id\tAmount");
		int total = 0;
		int max, min;
		max = array[0];
		min = array[0];
		int index = 0;
		
		for(int e : array) {
			total +=e;
			if(e > max)
				max = e;
			else if(e < min)
				min = e;
			
			
			System.out.println((index+1) + "\t" + array[index]);
			index++;
		}
		double average  = (double)total/length;
		index = 0;
		int[] exceedArray = new int[length] ;
		for(int e: array) {
			if(e > average) {
				exceedArray[index] = e;
				
			}
				
			index++;
				
		}
		
		
		System.out.println("Max: " + max);
		System.out.println("Min: " + min);
		System.out.println("Average: " + (double)total/length);
		System.out.println("exceed the average");
		System.out.println("Id\tAmount");
		int totalExceed = 0;
		for(int i = 0; i<length; i++) {
			if(exceedArray[i] != 0) {
				System.out.println((i+1) + "\t" + exceedArray[i]);
				totalExceed++;
			}
		}
			
		System.out.println("Total Exceed " + totalExceed);
		
		
		
	}//end else
	}//end main method
}//end class
