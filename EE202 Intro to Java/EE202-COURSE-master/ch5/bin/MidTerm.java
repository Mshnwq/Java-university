import java.util.*;
public class MidTerm {

	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		int number,
			countP = 0,
			countN = 0,
			total = 0,
			count = 0;
		double average;
		int[] array = new int[100000];
		System.out.print("Enter integer: ");
		number = input.nextInt();
		array[count] = number;
		
		while(number != 0) {
			if(number>0) {
				countP++;
				total +=number;
			}//end if
			if(number<0) {
				countN++;
				total +=number;
			}//end if
		
		
		System.out.print("Enter ");
		number = input.nextInt();
		
		count++;		
		array[count] = number;
		
		}//end while
		
		System.out.println(count == 0? "No numbers":"");
		
		if(count != 0) {
			System.out.printf("Number of p: %d%n" , countP);
			System.out.printf("Number of N: %d%n" , countN);
			System.out.printf("Number of total %d%n" , total);
			average = (double)total/(countP + countN);
			System.out.printf("Number of p: %.2f%n" , average);
			
			for(int i = 0; i<=count; i++)
				System.out.print(array[i] + " ");
		}//end if conit
			
	}//end main 
}//class
