import java.util.Scanner;
public class Q5{
	static int number;
	
	public static void main(String[] args){
		
	
		
		Q5 q5 = new Q5();
		
		for(;q5.isFive() == false || q5.isPalindrome() == false;){
				
					System.out.printf("%d is %s a palindrome!!!\n", number, ( q5.isPalindrome() ? "": "NOT"));
				
				

			
		}
		System.out.println(number + " is a palindrome!!!");
		
		
		
	}//end main mehtod
	
	public static boolean isFive(){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a 5-digit number: ");
		number = input.nextInt();
		
		for(; number/100000 !=0  || number/10000 == 0; ){
			System.out.println("Number must be 5 digits");
			System.out.print("Enter a 5-digit number: ");
			number = input.nextInt();
			
		}
		return true;
		
	}
	
	public static boolean isPalindrome(){
		
		int d1 = number/10000;
		int d2 = number % 10000 /1000;
		
		int d4 = number %10000 % 1000 %100 / 10;
		int d5 = number % 10;
		
		if(d1 == d5 && d2 == d4){
			return true;
		}
		else{
			return false;
		}
		
	}
}//end class