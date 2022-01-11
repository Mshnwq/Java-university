import java.util.*;
public class EmployeeTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Triangle triangle1 = new Triangle();
		
		System.out.print("Enter heigth: ");
		double h = input.nextDouble();
		
		System.out.print("Enter base: ");
		double b = input.nextDouble();
		
		System.out.printf("Area = %.2f%n", triangle1.area(h,b));
		
	}//end main method
}//end class
