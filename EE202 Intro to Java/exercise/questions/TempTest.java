package excersice;

import java.util.Scanner;

public class TempTest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Temp temp1 = new Temp();
		
		System.out.print("Enter the value of temp: ");
		double num = input.nextDouble();
		
		System.out.print("Choose F or C: ");
		char l = input.next().charAt(0);
		
		System.out.printf("The result of convert %.0f to %C is %.14f%n", num, l, temp1.getResult(num, l));
		
		

	
	}
	
	
}
