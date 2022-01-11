import java.util.Scanner;
public class LoveJava{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int num, counter = 1, sum = 0;
		
		System.out.print("Enter the number of times the message should be printed: ");
		num = input.nextInt();
		
		while(counter<=num){
			System.out.println(counter + " I love Java!!");
			sum +=counter;
			counter++;
		}
		System.out.println("Message was printed " + num + " times"  + ".");
		System.out.println("The sum of the numbers from 1 to " + num + " is " + sum + ".");
		
		
	}//end main method
	
}//end class