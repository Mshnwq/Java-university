package excersice;

import java.util.Scanner;

public class TriangleTest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Triangle triangle1 = new Triangle();
		
		System.out.printf("The triangle's Area is %.16f%n", triangle1.getArea(3, 2.6));
		System.out.printf("The triangle's perimete is %.1f%n", triangle1.getPerimeter(3, 3, 3));
		
	}
}
