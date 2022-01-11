import java.util.*;
public class Ex68 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
//		System.out.print("Please input two integers: ");
//		int n1 = input.nextInt();
//		int n2 = input.nextInt();
//		int k = n1;
//		for(int i = n1; i<=n2; i++) {
//			System.out.print(k + " ");
//			k++;
//		}
//		
		
//		System.out.print("Input: ");
//		int number = input.nextInt();
//		
//		for(int i = 1; i<=number; i++) {
//			//space upper part
//			for(int space = 1; space<=number-i; space++) {
//				System.out.print(" ");
//			}
//			//Stars upper part
//			for(int j = 1; j<=(2*i) -1; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//			
//			//bottom part
//			if(i == number) {
//				for( int i2 = number-1; i2>=1; i2--) {
//					//space bottom
//					for(int space = 1; space<=number - i2; space++) {
//						System.out.print(" ");
//					}
//					//stars bottom
//					for(int j = 1; j<=(i2*2) -1; j++) {
//						System.out.print("*");
//					}
//					System.out.println();
//				}
//				
//			}//end for loop
//			
//			
//			
//		}//end 
		
//		System.out.print("Enter: ");
//		int number = input.nextInt();
//		int c = 1; 
//		for(int i = 1; i<=number; i++) {
//			for(int space = 1; space<=number-i; space++)
//				System.out.print(" ");
//			for(int j = 1; j<=i ;j++) {
//				if( (i==1 ||  j==1 ) ) {
//					System.out.print(1 + " ");
//				}
//				else if(i!=j) {
//					if((j-1) == 1) {
//						System.out.print(  ((i-1) * (j-1 ) )  + " ");
//					}
//					else {
//						System.out.print(  ((i-1) * (j) ) /2 + " ");
//					}
//					
//				}
//				else {
//					System.out.print(1 + " ");
//				}
//				
//			}
//				System.out.println();
//		}//end for loop
//		
		
		
		
//		
//		System.out.print("Enter number: ");
//		int number = input.nextInt();
//		for(int i = 1; i<=number; i++) {
//			//sapce
//			for(int space = 1; space<=number-i; space++) {
//				System.out.print(" ");
//			}
//			for(int j = i; j>=1; j--) {
//				System.out.print(j );
//				
//				if(j == 1) {
//					for(int k = 2; k<=i; k++ ) { 
//						System.out.print(k);
//					}
//				}
//			}
//			
//			System.out.println();
//			
//			if(i == number) {
//				for(int i2 = number-1; i2>=1; i2--) {
//					for(int space = 1; space<=number-i2; space++) {
//						System.out.print(" ");
//					}
//					
//					for(int j = i2; j>=1; j--) {
//						System.out.print(j);
//						if(j == 1) {
//							for(int k = 2; k<=i2; k++) {
//								System.out.print(k);
//							}
//							
//						}
//				
//					}
//					System.out.println();
//				}
//			}
//		}//end for loop
//		
		double sum =1;
		
		for(int i = 1; i<=3; i++) {
			if(i % 2!=0) {
				sum *=(1/(double)i) *(-1);
			}
			else {
				sum *=(1/(double)i);
			}
		}
		
		System.out.print(sum);
	}//end main

}//end class
