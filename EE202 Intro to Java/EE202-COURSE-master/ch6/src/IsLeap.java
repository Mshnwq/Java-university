import java.util.Scanner;
public class IsLeap {

	static Scanner input = new Scanner(System.in);
	
	static public boolean isLeap(int year) {
		return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
	}
	
	public static void main(String[] args) {
		System.out.print("Enter a year ");
		int number = input.nextInt();
		System.out.println(isLeap(number));
	}
}
