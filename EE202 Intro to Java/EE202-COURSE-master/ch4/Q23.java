import java.util.Scanner;
public class Q23{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int counter = 0, num , largest1, largest2;
		
		System.out.print("Enter num: ");
		num = input.nextInt(); // num = 1
		
		largest1 = num; //largest1 = 1
		
		System.out.print("Enter num: ");
		num = input.nextInt(); //num = 2
		
		largest2 = num; //largest2 = 2
		while(counter < 8){
			
			System.out.print("Enter num: ");
		    num = input.nextInt(); //num = 3
			
			if(num > largest1 || num > largest2){
				if(largest1 < largest2){
					largest1 = num;
				}//end if NO.2
				else{
					largest2 = num;
				}
					
			}//end if No.1
			
			
			
			
			
			counter++;
		}//end while loop
		System.out.println("largest1 = " + largest1);
		System.out.println("largest2 = " + largest2);
		
	}//end main method
}//end class