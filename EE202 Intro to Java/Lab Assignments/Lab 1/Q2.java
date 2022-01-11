package lab.assignment;
import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {
		int khalidAge = 0;
		int turkeyAge = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("What is Turkey's current age? ");
		turkeyAge = scan.nextInt();
		khalidAge = (turkeyAge*3)-6;
		System.out.println("If Turkey is " + turkeyAge + " then Khalid must be " +
		khalidAge + ".");
	}
}