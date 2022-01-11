import java.util.Scanner;
public class Factorial{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		int number, factorial = 1, counter = 0; 
		
		System.out.print("Enter number: ");
		number = input.nextInt(); //number = 4;
		
		while(counter <number){ 
			factorial *=(number-counter);//f = 4, f = 12, f = 24, 
			
			counter++;//c = 1, c = 2 , c =3
			
		}
		
		System.out.printf("The factorial of %d is %d \n", number, factorial);
	}//end main method
	
	
}//end class