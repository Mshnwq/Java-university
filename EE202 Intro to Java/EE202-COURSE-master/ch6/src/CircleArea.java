import java.util.Scanner;
public class CircleArea {

	public static double circleArea(double radius) {
	return Math.PI * radius * radius;

	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(true) {
			System.out.print("Enter the radius (negative to quit): ");
			double radius = input.nextDouble();
			if(radius == -1) break;
			System.out.printf("Area is %.6f%n", circleArea(radius));
			
		}
	}
	
}
