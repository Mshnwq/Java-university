import java.util.Scanner;
public class Q1{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int num;
		
		System.out.print("Input number between(1-7): ");
		num = input.nextInt();
		
		if(num > 0 && num < 8){ //[1, 7]
			if(num == 1){
				System.out.println("Saturday");
			}
			else if(num == 2){
				System.out.println("Sunday");
			}
			else if(num == 3){
				System.out.println("Monday");
			}
			else if(num == 4){
				System.out.println("Tuesday");
			}
			else if(num == 5){
				System.out.println("Wednsday");
			}
			
			else if(num == 6){
				System.out.println("Thursday");
			}
			
			else{
				System.out.println("Friday");
			}
			
			
			
		}//end if cond #NO.1
		else{
			System.out.println("Invalid range!");
		}//end else 
		
		
		
	}//end main
	
	
}//end class