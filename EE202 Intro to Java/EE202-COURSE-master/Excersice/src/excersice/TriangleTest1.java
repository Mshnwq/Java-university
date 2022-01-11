package excersice;

public class TriangleTest1 {

	public static void main(String[] args) {
		
		Triangle1 triangle1 = new Triangle1();
		System.out.printf("The Triangle's Ares is %.10f\n", triangle1.getArea(3, 2.6));
		System.out.printf("The Triangles's perimeter is %.1f\n", triangle1.getPerimeter(3, 3, 3));
		
		
	}
}
