import java.util.*;
public class Q2Lab6 {
public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
//		for(int i = 1; i<=5; i++) {
//			for(int space = 1; space<=5-i; space++)
//				System.out.print(" ");
//			for(int stars = 1; stars<=2*i -1; stars++)	
//				System.out.print("*");
//			
//			System.out.println();
//			
//			
//			
//			if(i == 5) {
//				for(int i2 = 4; i2>=1; i2--) {
//					for(int space2 = 1; space2<=5-i2; space2++)
//						System.out.print(" ");
//					for(int stars2 = 1; stars2<=2*i2 - 1; stars2++)
//						System.out.print("*");
//				 System.out.println();	
//				}
//			}
//		}
//		
		
		
		
//		int p =1;
//		int i = 1; 
//		do {
//			if(i % 2 != 0) {
//				p *=i;
//			}
//			i++;
//		}while(i<=15);
//		System.out.println("The product is: "  + p);
	
	
	int i = 1;
	do {
		if(i ==6) {
			i++;
			continue;
		}
		System.out.print(i + " ");
		i++;
	}while(i<=10);
	
	}//end main 
	
}//end class
