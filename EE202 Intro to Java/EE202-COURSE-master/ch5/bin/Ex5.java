import java.util.Scanner;
public class Ex5 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a 5-digit number: ");
		int number = input.nextInt();
		
		
		int flag = 0;
		for(;flag !=-1 ;) {
			//less than 5-digits
			if(number /10000 == 0) {
				System.out.println("Number must be 5 digits");
				System.out.print("Enter a 5-digit number: ");
				number = input.nextInt();
			}
			else {
				flag = -1;
			}
			
		}
		
		flag = 0;
		for(;flag != -1;) {
			//more than5-digit
			if(number/100000 != 0) {
				System.out.println("Number must be 5 digits");
				System.out.print("Enter a 5-digit number: ");
				number = input.nextInt();
				
			}
			else {
				flag = -1;
			}
		}
		
		int d1 = number/10000;
		int d5 = (number%10) ;
		int d2 = (number % 10000)/1000;
		int d4 = (number % 100)/ 10;
		
		
		if(d1 == d5) {
			if(d2 == d4) {
				System.out.println(number + " is a plalindrome!!!");
			}
		}
		
	}//end main method

}//end class
