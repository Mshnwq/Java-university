import java.util.Scanner;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.ArrayList;

	
public class Practice {
	final static Scanner input = new Scanner(System.in);
	final static SecureRandom randomNumber = new SecureRandom();
	
	
		
	public static void main(String[] args) {
		int[] seats = new int[11];//last index = 10
		
		int indexF = 1;
		int indexE = 6;
		
		for(int i = 1; i<=10; i++) {
			System.out.println("1 First Class");
			System.out.println("2 Economy Class");
			System.out.print("Choice:  ");
			int choice = input.nextInt();
			
			switch(choice) {
			
			case 1:
				if(indexF<=5) {
					System.out.println("First Class seat#" + indexF);
					indexF++;
				}
				else {
					System.out.println("Sorry full seats for first Class");
					System.out.println("Economy class? ");
					System.out.print("1 Yes . 2 NO: ");
					int choice2 = input.nextInt();
					if(choice2 == 1) {
						if(indexE <= 10) {
							System.out.println("Economy class seat#" + indexE);
							indexE++;
						}
						else {
							System.out.println("Sorry full seats for Economy class");
						}
					}
						
				}
					
				break;
				
			case 2: 
				if(indexE <= 10) {
					System.out.println("Economy class seats#" + indexE);
					indexE++;
				}
				else {
					
					System.out.println("Sorry full seats for Economy Class");
					System.out.println("first class? ");
					System.out.print("1 Yes . 2 NO: ");
					int choice2 = input.nextInt();
					if(choice2 == 1) {
						if(indexF <= 5) {
							System.out.println("First class seat#" + indexF);
							indexF++;
						}
						else {
							System.out.println("Sorry full seats for First class");
						}
						
					}
				}
			}//end switch
		}//end for loop
		
		System.out.println("Thank you Asma for airLine");
		
		

	}//end main method

}//end class
