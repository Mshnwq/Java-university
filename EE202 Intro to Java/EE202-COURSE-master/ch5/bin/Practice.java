import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
//		
//		for(int s1 = 1; s1<=500; s1++) {
//			for(int s2 = 1; s2<=500; s2++) {
//				for(int h = 1; h<= 500; h++) {
//					if(Math.sqrt(s1 * s1 + s2 * s2) == h) {
//						System.out.printf("%s: %d %s: %d %s: %d %n", "s1", s1, "s2", s2, "h", h);
//					}
//					
//				}//h
//			}//s2 side
//		}//s1 side
		
		
		
		
//		int sum = 0;
//		System.out.print("Input the number: ");
//		int number = input.nextInt(); //num = 34521
//		
//		int div = 1;
//		
//		while(number / div != 0) {
//			div *=10;
//			sum +=(number%div)/(div/10);
//			
//			
//		}
//		
//		System.out.println("Sum of digits = " + sum);
		
		
//		int k = 1;
//		for(int i = 1; i<= 4; i++) {
//			for(int j = 1; j<= i; j++) {
//				System.out.print(k + " ");
//				k++;
//			}
//			System.out.println();
//		}
		
		
//		for(int i = 1; i<= 4; i++) {
//			for(int space = 1; space<=4-i; space++ ) {
//				System.out.print(" ");
//			}
//			for(int j = 1; j<=i; j++) {
//				System.out.print(i+ " ");
//			}
//			System.out.println();
//		}
//		
		
//		System.out.print("Input number of rows: ");
//		int num = input.nextInt();
//		
//		for(int i = 1; i<=num; i++) {
//			
//			if(i % 2 != 0) {//i is odd
//				for(int j = 1 ;  j<=i; j++) {
//					if(j % 2 != 0) {
//						System.out.print(1);
//					}
//					else {
//						System.out.print(0);
//					}
//						
//				}
//				
//				
//				
//			}
//			else {
//				for(int j = 1; j<=i; j++) {
//					if(j%2 == 0) {
//						System.out.print(1);
//					}
//					else {
//						System.out.print(0);
//					}
//				}
//			}
//			
//			System.out.println();
//			
//		}
//		
		
//		System.out.print("Input number of rows:  ");
//		int num = input.nextInt();
//		
//		for(int i = 1; i<=num; i++) {
//			for(int j = 1; j<=i; j++) {
//			
//				if(i % 2 == 0) {//i is even
//					if(j % 2 == 0) {
//						System.out.print(1);
//					}
//					else {
//						System.out.print(0);
//					}
//				}
//				else {
//					if(j % 2 != 0) {
//						System.out.print(1);
//					}
//					else {
//						System.out.print(0);
//					}
//				}
//					
//					
//			
//			
//				
//			}
//			
//			System.out.println();
//		}
//		
		
		
//		System.out.print("Input number of rows (half of the diaminod: )");
//		int num = input.nextInt();
//		
//		//upper
//		for(int i = 1; i<= num; i++) {
//			for(int space = 1; space<=(num) - i; space++) {
//				System.out.print(" ");
//			}
//			for(int j = 1; j<=i; j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//				
//		}
//		
//		
//		//lower
//		for(int i = num-1; i>= 1; i--) {
//			for(int space = i; space< num; space++) {
//				System.out.print(" ");
//			}
//			for(int j = 1; j<= i; j++) {
//				System.out.print("* ");
//			}
//			
//			System.out.println();
//		}
		
		
		
		
//		System.out.print("Input the number: ");
//		int num = input.nextInt();
//		for(int i = num; i>=1; i--) {
//			for(int space = 1; space<=num - i; space++) {
//				System.out.print(" ");
//			}
//			for(int j = 1; j<=i; j++) {
//				System.out.print("*");
//		
//			}
//			System.out.println();
//		}
		
//		System.out.print("INput hte number: ");
//		int num = input.nextInt();
//		for(int i = 1; i<=num; i++) {
//			for(int space = 1; space<=num-i; space++) {
//				System.out.print(" ");
//			}
//			
//			for(int j = 1; j<=i; j++) {
//				System.out.print("@");
//			}
//			System.out.println();
//		}
		
		
		
//		System.out.print("Input the numbers: ");
//		int num = input.nextInt();
//		String letters = " ABCDEFGHIJKLMNORIPQSTUVWYZ";
//		for(int i = 1; i<=num; i++) {
//			for(int space = 1; space<=num-i; space++) {
//				System.out.print(" ");
//			}//end space loop
//			for(int j = 1; j<=i; j++) {
//				System.out.print(letters.charAt(j) );
//				
//				if(i == j) {
//					for(int k = j-1; k>=1; k--) {
//						System.out.print(letters.charAt(k));
//					}//end for k loop
//				}//end if cond
//			}//end for j loop
//			System.out.println();
//		}//end i loop
//	
//		
//		for(int i2 = num-1; i2>=1; i2--) {
//			for(int space2 = 1; space2<=num - i2; space2++) {
//				System.out.print(" ");
//			}
//			for(int j2 =1;  j2<=i2; j2++ ) {
//				System.out.print(letters.charAt(j2));
//				
//				if(i2 == j2) {
//					
//					for(int k2 = i2-1; k2>=1; k2--) {
//						System.out.print(letters.charAt(k2));
//					}
//				}
//			}
//			System.out.println();
//		}
		
		
//		double sum = 0;
//		int k1  = 1;
//		int k2  = 2;
//		for(int i = 1; i<=3; i++) {
//			sum +=(double) k1 /k2;
//			k1 +=2;
//			k2 +=2;
//			
//		}
//		System.out.println(sum);
//		System.out.println(k1);
//		System.out.println(k2);
		
		
//		double sum = 1;
//		
//		
//		for(int i  = 1; i<=17; i +=2) {
//				sum += (double)i/(i + 2);
//		}
//		
//		System.out.println(sum);
//		
		
		
//		System.out.print("Input number: ");
//		int num = input.nextInt();
//		
//		for(int i = 1; i<=num; i++) {
//			for(int j = 1; j<=num; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		
//		System.out.print("Input number:  ");
//		int num = input.nextInt();
//		
//		for(int i = 1; i<= num; i++) {
//			for(int j = 1; j<=i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
		
//		System.out.print("Enter num: ");
//		int num = input.nextInt();
//		
//		switch(num) {
//		case 1: 
//			System.out.println("Sun");
//			break;
//		case 2: 
//			System.out.println("MON");
//			break;
//			
//		case 3:
//			System.out.println("Tues");
//			break;
//		case 4: 
//			System.out.println("Wed");
//			break;
//		case 5: 
//			System.out.println("Thur");
//			break;
//		case 6: 
//			System.out.println("Fird");
//			break;
//		case 7: 
//			System.out.println("Sat");
//			break;
//		default: 
//			System.out.println("Error");
//			break;
//		
//		}
		
//		System.out.print("Input number: ");
//		int num = input.nextInt();
//		
//		for(int i = 1; i<= num; i++) {
//			for(int j = i; j>=1; j--) {
//				System.out.print(j*j + " ");
//			}
//			System.out.println();
//		}
		
		
//		double sum = 0;
//		int p = -1; 
//		
//		for(int i = 1; i<= 30; i++) {
//			sum +=  ( (double) i/(31 - i) ) * Math.pow(p, i+1) ;
//			
//		}
//		System.out.println(sum);
		
		
		
//		System.out.print("Enter number: ");
//		int num = input.nextInt(); //num = 12345
//		int div = 1;
//		int digits = 0;
//		int reverse = 0;
//		
//		//count how many digits
//		while(num / div != 0) {
//			digits++;
//			div *=10;
//		}
//		
//		div = 10;
//		while(digits >=1) { //digits = 5
//			
//			digits--;
//			reverse +=(num%div)/(div/10) * Math.pow(10, digits);
//			
//			div *=10;
//		}
//		System.out.println("The reverse number is: "+ reverse);
//		System.out.println("Sum of the number and reversal: " + (num + reverse));
//		
		
		
		
		
		
	}//end main 
	
}//end class
