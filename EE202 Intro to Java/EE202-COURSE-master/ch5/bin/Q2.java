import java.util.*;
public class Q2 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int proNo, quSo;
		double pro1 = 0.00,
			   pro2 = 0.00,
			   pro3 = 0.00,
			   pro4 = 0.00,
			   pro5 = 0.00;
		
		System.out.print("Enter product number (1-5) (0 to stop): ");
		proNo = input.nextInt();
		
		while(proNo != 0) {
			System.out.print("Enter quantity sold: ");
			quSo = input.nextInt();
			
			if(proNo >= 1 && proNo<= 5) {
				switch(proNo) {
				case 1: 
					pro1 +=quSo * 2.98;
					break;
				case 2: 
					pro2 +=quSo * 4.50;
					break;
				case 3: 
					pro3 +=quSo * 9.98;
					break;
					
				case 4: 
					pro4 +=quSo * 4.94;
					break;	
				case 5: 
					pro5 +=quSo * 6.87;
					break;
				
				
				}//end switch
			}//end if check
			
			
			
			
			System.out.print("Enter product number (1-5) (0 to stop): ");
			proNo = input.nextInt();
			
			
		}//end while
		
		System.out.println();
		System.out.printf("Product 1: $%.2f%n", pro1);
		System.out.printf("Product 2: $%.2f%n", pro2);
		System.out.printf("Product 3: $%.2f%n", pro3);
		System.out.printf("Product 4: $%.2f%n", pro4);
		System.out.printf("Product 5: $%.2f%n", pro5);
		
	}//end main method

}//end class
