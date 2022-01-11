import java.util.Scanner;
public class Q5{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int number, digit1 = 0, digit2 = 0, digit3 = 0, digit4 = 0, digit5 = 0;//number = 65432
		int reminder;
		
		System.out.print("Enter a 5-digit number: ");
		number = input.nextInt();
		
		
		//while loop to check if the input number is just FIVE digit:) 
		while ( (number / 100000 != 0) || (number /10000 == 0) ){
			System.out.println("Number must be 5 digits");
			System.out.print("Enter a 5-digit number: ");
			number = input.nextInt();
		}//end while 
		
		
		digit1 = number / 10000; //digit1 = 6
		reminder = number % 10000; //reminder = 5432
		
		digit2 = reminder / 1000; //digit2 = 5
		reminder = reminder %1000; //reminder = 432
		
		digit3 = reminder /100; //digit3 = 4
		reminder = reminder %100; // reminder = 32
		
		digit4 = reminder / 10; //digit4 = 3;
		reminder = reminder % 10; //reminder = 2;
		
		digit5 = reminder;
		
		while((digit1 != digit5) || (digit2 != digit4) ){
			System.out.println("Great job it's a five digit but..");
			System.out.println("It's not a palindrome!..");
			System.out.println("Try agian:) ");
			System.out.print("Enter a 5-digit number: ");
			number = input.nextInt();
			
			while ( (number / 100000 != 0) || (number /10000 == 0) ){
			System.out.println("Number must be 5 digits");
			System.out.print("Enter a 5-digit number: ");
			number = input.nextInt();
		    }//end while 
			
			digit1 = number / 10000; //digit1 = 6
			reminder = number % 10000; //reminder = 5432
		
			digit2 = reminder / 1000; //digit2 = 5
			reminder = reminder %1000; //reminder = 432
		
			digit3 = reminder /100; //digit3 = 4
			reminder = reminder %100; // reminder = 32
		
			digit4 = reminder / 10; //digit4 = 3;
			reminder = reminder % 10; //reminder = 2;
		
			digit5 = reminder;
			
			
			
			
			
			
			
		}
		System.out.println(number + " is a palindrom!!");
			
			
			
			
		
			
			
			
			
			
		
			
		
		
		
		
			
			
		
		
				
				
		
		
		
		//System.out.print(digit1 + " " + digit2 + " " + digit3 + " " + digit4 + " " + digit5);
		
		
		
		
		
		
	}//end main
}//end class