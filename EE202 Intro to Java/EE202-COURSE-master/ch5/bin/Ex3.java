import java.util.*;
public class Ex3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int proNo;
		int quSo;
		double pro1 = 0.00, pro2 = 0.00, pro3 = 0.00, pro4 = 0.00, pro5 = 0.00;
		
		System.out.print("Enter product number(1-6) (0 to stop): ");
		proNo = input.nextInt();
		
		while(proNo != 0) {
			if(proNo>0 && proNo<=6) {
			
				System.out.print("Enter quantity sold: ");
				quSo = input.nextInt();
				
				switch(proNo) {
				
				case 1:
					pro1 += quSo * 2.98;
					break;
				case 2:
					pro2 += quSo * 4.50;
					break;
				case 3: 
					pro3 += quSo * 9.98;
					break;
				case 4: 
					pro4 += quSo * 4.49;
					break;
				case 5: 
					pro5 += quSo * 6.87;
					break;
				case 6:
					pro1 +=8.00;
					pro2 +=8.00;
					pro3 +=8.00;
					pro4 +=8.00;
					pro5 +=8.00;
				
					
				}//end switch

				System.out.print("Enter product number(1-6) (0 to stop): ");
				proNo = input.nextInt();
				
			}
			
			
		}
		
		System.out.println();
		
		System.out.printf("Product 1: $%.2f%n", pro1);
		System.out.printf("Product 2: $%.2f%n", pro2);
		System.out.printf("Product 3: $%.2f%n", pro3);
		System.out.printf("Product 4: $%.2f%n", pro4);
		System.out.printf("Product 5: $%.2f%n", pro5);
		
		
	}//end main 

}
