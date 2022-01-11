package lab.assignment;
import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		int val1, val2;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first integer: ");   val1 = sc.nextInt();
		System.out.print("Enter second integer: ");  val2 = sc.nextInt();
		
		if (val1 > val2) { int larger = val1;
				System.out.printf("%d is larger", larger);	}
		
		else if (val2 > val1) { int larger = val2; 
			System.out.printf("%d is larger", larger); }
		
		else {System.out.printf("These numbers are equal");}
	}
}
