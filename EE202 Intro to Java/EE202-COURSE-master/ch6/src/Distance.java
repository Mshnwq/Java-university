import java.util.Scanner;
public class Distance {

	public static double calcDistance(double x1, double y1, double x2, double y2) {
		return Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Or Enter x1: ");
		
		while(input.hasNext()) {
			double x1 = input.nextDouble();
			System.out.print("Enter y1: ");
			double y1 = input.nextDouble();
			System.out.print("Enter x2: ");
			double x2 = input.nextDouble();
			System.out.print("Enter y2: ");
			double y2 = input.nextDouble();
			
			System.out.printf("Distance is  %.6f%n" ,calcDistance(x1, y1, x2, y2));
			
			System.out.print("Or Enter x1: ");
		}
	}
}
