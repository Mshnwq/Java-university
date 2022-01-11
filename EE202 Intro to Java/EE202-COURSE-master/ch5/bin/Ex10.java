import java.util.*;
public class Ex10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter num : ");
		
		int num = input.nextInt();
		for(int i = 1; i<=(num * 2) - 1; i +=2) {
			for(int space = 1; space<=((num * 2) -1) - i; space +=2) {
				System.out.print(" ");
			}
			for(int j = 1; j<=i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i = (num * 2) - 2; i>=1; i -=2) {
			for(int space = 1; space<=(num*2)-1 -i; space +=2) {
				System.out.print(" ");
			}
			for(int j = 1; j<i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}//end main method
}//end class
