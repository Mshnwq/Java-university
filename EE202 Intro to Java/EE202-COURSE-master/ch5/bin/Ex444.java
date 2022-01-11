import java.util.*;
public class Ex444 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Input: ");
		int number = input.nextInt();
		
		
		String letters = " ABCDEFGHIJKLMN";
		int j = 1;
		for(int i = 1; i<=number; i++) {
			for(int space = 1; space<=number-i; space++)
				System.out.print(" ");
			
			for(j = 1; j<=i; j++) {
				System.out.print(letters.charAt(j));
				if(i == j) {
					for(int k = i-1; k>=1; k--) 
						System.out.print(letters.charAt(k));
				}//end if
			}//end for j loop
			
			
			System.out.println();
			
			if(i == number) {
				for(int i2 = number-1; i2>=1; i2--) {
					for(int space = 1; space<=number-i2; space++)
						System.out.print(" ");
						
					for(int j2 = 1; j2<=i2; j2++) {	
						System.out.print(letters.charAt(j2));
						if(i2 == j2) {
							for(int k2 = i2-1; k2>=1; k2--) {
								System.out.print(letters.charAt(k2));
							}
						}
						
					}
					System.out.println();
				}
			}//end if loop
		}//end for i loop
		
		
		
//		for(int i = 1; i<=number; i++) {
//			for(int space = 1; space<=number-i; space++)
//				System.out.print(" ");
//			for(int stars = 1; stars<=( 2 * i ) - 1; stars++)	
//				System.out.print("*");
//			
//			System.out.println();
//			
//			if(i == number) {
//				for(int j = number - 1; j>=1; j--) {
//					for(int space = 1; 
//							space<=number - j; space++)
//						System.out.print(" ");	
//					
//					for(int stars = 1; stars <=(2*j) - 1; stars++) 
//						System.out.print("*");	
//					
//					System.out.println();
//				}
//				
//			}//end if 
//		}//end for 
//		
//		
//		
		
//		for(int i = 1; i<=number; i++) {
//			for(int j = 1; j<=i ;j++) {
//				if( i % 2 == 0) {//i is even
//					if(j % 2 == 0) 
//						System.out.print(1);
//					else 
//						System.out.print(0);
//				}//end if
//				else { //i is odd
//					
//					if( j % 2 != 0) 
//						System.out.print(1);
//					else
//						System.out.print(0);		
//					
//				}//end else
//				
//				
//			}//end for j loop
//			
//			
//			System.out.println();
//		}//end for i loop
//		
		
		
		
		
//		for(int i = 1; i<=number; i++) {
//			for(int space = 1; space<=number-i; space++)
//				System.out.print(" ");
//			for(int numbers = 1; numbers<=i; numbers++)	
//				System.out.print(i + " ");
//			System.out.println();
//		}
//		
		
		
		
		
		
//		int k = 1;
//		for(int i = 1; i<=number; i++) {
//			for(int j = 1; j<=i ; j++) {
//				System.out.print(k + " ");
//				k++;
//			}
//			System.out.println();
//			
//		}
		
		
		
		
//		for(int i = 1; i<=number; i++) {
//			for(int j = 1; j<=i; j++)
//				System.out.print(i + " ");
//			System.out.println();
//		}
		
		
		
//		for(int i = 1; i<=number; i++) {
//			for(int j = 1; j<=i; j++) 
//				System.out.print(j + " ");
//			System.out.println();
//		}
//		
//		
//		System.out.println("Input: ");
//		int number = input.nextInt();
//		
//		int sum = 0;
//		int i = 1; 
//		while(number / i != 0) {
//			i *=10;
//			
//			sum += (number % i) / (i/10) ;
//		}
//		System.out.println(sum);
//		
		
//		int p = 1; 
//		int i = 1; 
//		do {
//			if(i % 2 != 0)
//				p *=i;
//			i++;
//			
//		}while(i <= 15);
//		
//		System.out.println("The result of the product is: " + p);
//		
		
		
//		System.out.println("How many numbers do you want to enter: ");
//		int number = input.nextInt();
//		System.out.println("Enter " + number + " numbers: ");
//		int n = input.nextInt();
//		int min = n;
//		for(int i = 2; i<=number; i++) {
//			 n = input.nextInt();
//			if (n < min)
//				min = n;
//		
//		}
//		
//		System.out.println("The smallest is: " + min);
		
		
		
		
		
		
		
		
	}//end main method
}//end class
