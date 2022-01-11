import java.util.Scanner;
public class Hypotenus {
	public static double hypo(double side1, double side2) {
		return Math.sqrt(Math.pow(side1,2) + Math.pow(side2, 2));
	}
	
	public static void main(String[] args) {
		System.out.println("Triangle\tSide 1\tSide 2\tHypotensue");
		System.out.printf("1\t\t3.0\t4.0\t%f%n2\t\t5.0\t12.0\t%f%n3\t\t8.0\t15.0\t%f%n",hypo(3,4), hypo(5,12),hypo(8,15));
	}

}
