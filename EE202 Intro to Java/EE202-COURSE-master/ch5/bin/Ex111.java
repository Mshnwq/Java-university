import java.util.*;
public class Ex111 {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		/*
		System.out.print("Enter number of loop: ");
		int number = input.nextInt();
		int[] array = new int[number  + 1]; 
		array[0] = 0;
		
		for(int i = 1; i<=number; i++) {
			System.out.print("Enter number of stars : ");
			int starNumber = input.nextInt();
			array[i] = starNumber;
			
		}
		
		for(int i = 1; i<=number; i++) {
			for(int j = 1; j<=array[i]; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		*/
		
		
//		System.out.print("Input the number: ");
//		String letter = " ABCDEFGHIJK";
//		int number = input.nextInt();
//		
//		for(int i = 1; i<= number; i++) {
//			for(int space = 1; space<=number -i; space++) {
//				System.out.print(" ");
//			}
//			for(int j = 1; j<=i; j++) {
//				System.out.print( letter.charAt(j) );
//			}
//			for(int j = i-1; j>=1; j--) {
//				System.out.print( letter.charAt(j) );
//			}
//			
//			System.out.println();
//		}
//		
//		for(int i = 1; i<=number-1; i++) {
//			
//			for(int space = 1; space<=i; space++) {
//				System.out.print(" ");
//			}
//			for(int j = 1; j<=number-i; j++) {
//				System.out.print(letter.charAt(j));
//			}
//			for(int j = number-1-i; j>=1; j--) {
//				System.out.print(letter.charAt(j));
//			}
//			
//			System.out.println();
//			
//		}
		
//		System.out.print("Enter number: ");
//		int number = input.nextInt();
//		
//		for(int i = 1; i<=number-1; i++) {
//			for(int space = 1; space<=number-1-i; space++) {
//				System.out.print(" ");
//			}
//			for(int j = 1; j<=i; j++) {
//				System.out.print("@");
//			}
//			
//			System.out.println();
//		}
//		
		
//		System.out.print("Input the number: ");
//		int number = input.nextInt();
//		
//		for(int i = number; i>=1; i--) {
//			for(int space = 1; space<=number-i; space++) {
//				
//				System.out.print(" ");
//			}
//			for(int j = i; j>=1; j--) {
//				System.out.print("*");
//			}
//			
//			System.out.println();
//		}
		
		
		/*
		 * Strars^-^
		 */
		
		
//		System.out.print("Input: ");
//		int number = input.nextInt();
//		
//		for(int i = 1; i<=number; i++) {
//			
//			for(int space = 1; space<=number-i; space++) {
//				System.out.print(" ");
//			}
//			for(int j = 1; j<=2*i-1; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//			
//			
//			if(i == number) {
//				for(int i2 = 1; i2<=number-1; i2++) {
//					for(int space2 = 1; space2<=i2; space2++) {
//						System.out.print(" ");
//					}
//					for(int j2 = 1; j2<=2*(number-i2) -1; j2++) {
//						System.out.print("*");
//					}
//					
//					
//					System.out.println();
//				}
//				
//				
//			}//end if
//		}//end for loop1
		
		
//		System.out.print("INput number: ");
//		int number = input.nextInt();
//		
//		for(int i = 1; i<=number; i++) {
//			for(int j = 1; j<=i ; j++) {
//				if(i%2 == 0) {
//					if( j % 2== 0) {
//						System.out.print(1);
//					}
//					else {
//						System.out.print(0);
//						
//					}
//				}
//				else {
//					if(j % 2!=0) {
//						System.out.print(1);
//					}
//					else {
//						System.out.print(0);
//						
//					}
//					
//				}
//				
//				
//			}//end for j
//			
//			System.out.println();
//		}
//		
		
//		int k = 1;
//		for(int i = 1; i<=4; i++) {
//			for(int j = 1; j<=i; j++) {
//				System.out.print(k + " ");
//				k++;
//			}
//			System.out.println();
//		}
		
		
//		System.out.print("Input: ");
//		int number = input.nextInt();
//		for(int i = 1; i<=number; i++) {
//			for(int j = 1; j<=i; j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
		
		
		
		
		System.out.print("INput: ");
		int number1 = input.nextInt();
		int sum1 = 0;
		int i1 = 1;
		while(number1/i1 !=0) {
			i1 *=10;
			sum1 += number1 % i1 /(i1/10);
		}
		
		System.out.println("Sum of digit: " + sum1);
		
		System.out.println("-----------------");
		
		
		System.out.print("Enter number: ");
		int number = input.nextInt();
		int i = 1, reverse = 0;
		int countDigit = 0;
		
		//counting how many digits
		while(number / i !=0) {
			i *=10;
			countDigit++;
		}
		
		
		
		
		for(int j = 1; j<=countDigit; j++ ) {
			i /=10;
			
			reverse +=( (number %(int) Math.pow(10,j)) / (int)(Math.pow(10,j)/10) ) *i;
			
		}
		System.out.println("Reverse: " + reverse);
		System.out.println(number + " + " + reverse + " = " + (number + reverse));
		
		
		
	}//end main 
}//end class
