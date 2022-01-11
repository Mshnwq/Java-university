import java.util.Scanner;

public class TriangleTest{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the base: ");
		int base = input.nextInt();
		
		System.out.print("Enter the height: ");
		int height = input.nextInt();
		
		
		System.out.println("\"hello\" ");
		
		Triangle triangle = new Triangle();
		double result = triangle.area(base, height);
		
		System.out.print("The area of the triangle of the base" + base + " and Height " + height + " is " + result);
		
		
	}//end main method
	
	
}//end class