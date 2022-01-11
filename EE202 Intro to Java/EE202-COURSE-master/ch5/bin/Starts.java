import java.util.Scanner;
import java.util.Random;
public class Starts {
	
	public static void name() {
		
		System.out.println("HI Asma!");
	}
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Random rand   =  new Random();
		for(int i = 0; i<=4; i++) {
			System.out.printf("%d", i);
		}
		
//		int counter =0;
//		int sum1 = 0;
//		int sum2 = 0;
//		
//		while(true) {
//			if(counter % 2 == 0) {
//				int rand1 = rand.nextInt(7);
//				sum1 +=rand1;
//				
//				System.out.printf("Player 1 after turn  %-5d is : %d%n", counter, sum1);
//				if(sum1 >=30) {
//					System.out.println("Player 1 WON!!");
//					break;
//				}
//			}
//			else {
//				int rand2 = rand.nextInt(7);
//				sum2 +=rand2;
//				
//				System.out.printf("Player 2 after turn  %-5d is : %d%n", counter, sum2);
//				if(sum2 >=30 ) {
//					System.out.println("Player 2 WON!!");
//					break;
//				}
//				
//			}
//		
//			counter++;
//		}
	
		
		
		
//		
//		System.out.print("Enter your name: ");
//		String name = input.nextLine();
//		
//		if(name.startsWith("Eng.")) {
//			System.out.println("Hello Engineers!!");
//		}
//		if(name.endsWith("Sarouji")) {
//			System.out.println("Hello Sarouji Family!!");
//		}
//		
		
//		int sum = 0;
//		
//		
//		while(sum != 7) {
//			
//			
//			int rand1 = rand.nextInt(7);
//			int rand2 = rand.nextInt(7);
//			sum =rand1 + rand2;
//			System.out.printf("%d + %d = %d%n", rand1, rand2, sum);
//			 
//		}
//		
//		
//		System.out.print("Enter number: ");
//		int num = input.nextInt();
//		
//		for(int i = 1; i<=num; i++) {
//			for(int space = 1; space<= num-i; space++) {
//				System.out.print(" ");
//			}
//			for(int j = 1; j<=i; j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//			
//		}
//		
//		for(int i2 = num-1; i2>=1; i2--) {
//			for(int space2 = 1; space2<=num -i2; space2++) {
//				System.out.print(" ");
//			}
//			for(int j2 = 1; j2<=i2; j2++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//		
//		for(int i = 1; i<=5; i++) {
//			for(int j = 1; j<=3; j++) {
//				for(int k = 1; k<=4; k++) {
//					System.out.print("*");
//				}
//				System.out.println();
//			}
//			System.out.println();
//		}
			
	}//end main

}//end class
