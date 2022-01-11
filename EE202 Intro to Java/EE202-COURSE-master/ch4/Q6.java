import java.util.Scanner;
public class Q6{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		int f = 1;
		
		System.out.print("Please enter a nonnegative number: ");
		int number = input.nextInt();
		
		while(number < 0){
			System.out.println("Factorial is undefined to negative numbers.");
			System.out.print("Please enter a non-negative number: ");
		    number = input.nextInt();
			
		}//end while loop
		
		if(number == 0){
			System.out.println("0! = 1");
		}
		else{
			
			int i = number;
			while(i!= 0){
				f = f * i;
				i--;
				
			}
			
			System.out.println(number + "! = " + f);
			
		}
		
		
		
		
		
		
		
		
		
	}//end main method
}//end class