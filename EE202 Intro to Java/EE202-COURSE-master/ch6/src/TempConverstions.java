import java.util.Scanner;
public class TempConverstions {

	static Scanner input = new Scanner(System.in);
	
	public static double kelvin(double c) {
		return c+273.15;
	}
	
	public static double celsius(double k) {
		return k-273.15;
	}
	
	public static void main(String[] args) {
		
		System.out.print("Enter k or c to convert? ");
		String tempString = input.next();
		System.out.print("Enter temp value: ");
		double value = input.nextDouble();
		
		switch(tempString) {
		case "K": case "k": System.out.println(kelvin(value));break;
		case "C": case "c": System.out.println(celsius(value));break;
		}
	}
}
