package lab2;
import java.util.Scanner;

public class L2_Q2 {

	public static void main(String[] args) {
		Scanner input = new Scanner( System.in );
		System.out.print("Enter the radius of circle in integer: "); 
		int rad = input.nextInt();
		if(rad >= 0) {
		System.out.printf("Diameter is %d%nArea is %.2f%nCircumfrence is %.2f%n", 
				(2*rad), (Math.PI*rad*rad), (2*Math.PI*rad));}
		else {System.out.print("Invalid number, try again and enter a postive integer: ");}
	}
}