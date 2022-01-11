package practiceQuizCh2Package;

import java.util.Scanner;



public class Practice {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
//		
//		System.out.println("Enter num1");
//		int num1 = input.nextInt();
//		System.out.println("Enter num2");
//		int num2 = input.nextInt();
//		
//		if(num1 > num2) {
//			System.out.printf("%d is greater than %d%n", num1, num2);
//		}
//		else if (num2 > num1) {
//			System.out.printf("%d is greater than %d%n", num2, num1);
//		}
//		else {
//			System.out.printf("%d and %d are equal", num1, num2);
//		}

//		int num, d1, d2, d3, d4, d5, remainder;
//		System.out.print("Enter num:");
//		num = input.nextInt(); //num = 43194
//		
//		d1 = num /10000; //d1 = 4.3194
//		remainder = num % 10000; //remainder = 3194
//		d2 = remainder / 1000; //d2=3.194
//		remainder = remainder %1000; //remainder = 194
//		d3 = remainder / 100; //d3 = 1.94
//		remainder = remainder %100;// rmainder = 94
//		d4 = remainder / 10; //d4 = 9.4
//		d5 = remainder % 10;
//		
//		System.out.printf("%d %d %d %d %d %n", d1, d2, d3, d4, d5 );

//		System.out.printf("Enter num: ");
//		int num1 = input.nextInt();
//		System.out.printf("Enter num: ");
//		int num2 = input.nextInt();
//		System.out.printf("Enter num: ");
//		int num3 = input.nextInt();
//		
//		if (num1 < num2 && num2 < num3) {
//			System.out.println("Increasing!");
//		}
//		else if (num3 <  num2 &&  num2 <  num1 ) {
//			System.out.println("Decreasing!");
//		}
//		else {
//			System.out.println("Otherwise");
//		}

//		System.out.println("    J        a     V     V     a");
//		System.out.println("    J       a a     V   V     a a");
//		System.out.println("J   J      aaaaa     V V     aaaaa");
//		System.out.println(" JJ       a     a     V     a     a ");

//		int i = 1; 
//		while (i <=10) {
//			if (i % 2 != 0) {
//				System.out.printf("%d%n", i);	
//			}
//			
//			i = i + 1;

//			}

//		System.out.print("Enter num: ");
//		int num1 = input.nextInt();
//		System.out.print("Enter num: ");
//		int num2 = input.nextInt();
//		System.out.print("Enter num: ");
//		int num3 = input.nextInt();
//		
//		System.out.println((num1 + num2 ) == num3 ? "True": "False");
//		

//		int num, h, min, sec, remainder;
//		num = 86399;
//		h = num / 3600;
//		remainder = num % 3600;
//		min = remainder /60;
//		remainder = remainder%60;
//		sec = remainder;
//		System.out.printf("%d %d %d", h, min, sec);

//		int num, d1, d2, d3, d4, d5, remainder;
//		num = 91522;
//		
//		d1 = num / 10000; //d1=9.1522
//		remainder = num % 10000; //remainder = 1522
//		d2 = remainder/ 1000; //d2 = 1.522
//		remainder = remainder%1000; //remainder = 522
//		d3 = remainder/100; //d3 = 5.22
//		remainder = remainder%100;//remainder = 22
//		d4 = remainder /10; //d4= 2.2
//		remainder = remainder%10; //remainder = 2;
//		d5 = remainder;
//		System.out.printf("%d %d %d %d %d%n", d1, d2, d3, d4, d5);
//		

//		int num, h, min, sec, remainder;
//		num = 86399;
//		h = num / 3600;
//		remainder = num %3600;
//		min = remainder / 60;
//		sec = remainder % 60;
//		
//		System.out.printf("%d %d %d %n", h, min, sec);

//		int counter = 0;
//		int total = 0;
//		
//		System.out.print("Enter grade or -1 to quit: ");
//		int grade = input.nextInt();
//		
//		while(grade != -1) {
//			counter = counter + 1;
//			total = total + grade;
//			
//			System.out.print("Enter grade or -1 to quit: ");
//			grade = input.nextInt();
//		}
//		
//		double average = (double)total/ counter;
//		System.out.printf("Total of the %d grades entered is %d%n", counter, total);
//		System.out.printf("Class average is %.2f%n",average);
//		
//		

//		
//		int a = 4;
//		System.out.println(a);
//		System.out.println(a++); //print the value first then added one to the value and save it in the memory
//		System.out.println(a);
//		System.out.println();
//		int b = 8;
//		System.out.println(b);
//		System.out.println(++b);
//		System.out.println(b);
//		System.out.println();
//		int c = 9;
//		System.out.println(c);
//		System.out.println(c--);
//		System.out.println(c);
//		int  d = 10;
//		System.out.println();
//		System.out.println(d);
//		System.out.println(--d);
//		System.out.println(d);

//		int counter = 0;
//		int sumPass = 0;
//		int sumFail = 0;
//		
//		while (counter < 10) {
//			counter = counter + 1;
//			System.out.print("Enter result (1 = pass, 2 = fail): ");
//			int result = input.nextInt();
//			if(result == 1) {
//				sumPass = sumPass + 1;
//			}
//			else {
//				sumFail = sumFail + 1;
//			}
//		}
//		
//		System.out.printf("Passed: %d%n", sumPass);
//		System.out.printf("Failed: %d%n", sumFail);
//		
//		if(sumPass > 8) {
//			System.out.println("Bonus to instructor!");
//		}
		
		
		
		
//			
//			int num = 0;
//			int nP =0;
//			int nN = 0;
//			int nZ = 0;
//			
//			for(int i =0; i < 5; ++i) {
//				System.out.print("Enter num:");
//				num = input.nextInt();
//				if (num > 0) {
//					++nP;
//				}
//				else if (num < 0) {
//					++nN;
//				}
//				else {
//					++nZ;
//				}
//			}
//			
//			System.out.println("num of Positive: " + nP);
//			
//			System.out.println("num of Negative: " + nN);
//			
//			System.out.println("num of Zero: " + nZ);
		
		
//
//		Scanner input = new Scanner(System.in);
//		int myNum, d1, d2, d3, d4, d5, remainder;
//		
//		
//		System.out.print("Enter num:");
//		myNum= input.nextInt(); //myNum= 43215
//		
//		d1	= myNum/ 10000; //d1 = 4.3215
//		remainder = myNum% 10000; //remainder = 3215
//		d2 = remainder / 1000; //d2 = 3.215
//		remainder = remainder % 1000; //remainder = 215;
//		d3 = remainder / 100; //d3 = 2.15
//		remainder = remainder % 100; //remainder = 15
//		d4 = remainder / 10;//d4 = 1.5
//		d5 = remainder % 10;
//		
//		System.out.printf("%d %d %d %d %d %n", d1, d2, d3, d4, d5);
//		

		
//		
//	Scanner input = new Scanner(System.in);
//	int n1,n2,n3;
//	System.out.print("Enter num:");
//	n1 = input.nextInt();
//	System.out.print("Enter num:");
//	n2 = input.nextInt();
//	System.out.print("Enter num:");
//	n3 = input.nextInt();
//if (n1 > n2 && n1 > n3) {
//	System.out.println(n1);
//}
//else if (n2 > n1 && n2 > n3) {
//	System.out.println(n2);
//}
//else {
//	System.out.println(n3);
//}
//
//}
//		
	}

}
