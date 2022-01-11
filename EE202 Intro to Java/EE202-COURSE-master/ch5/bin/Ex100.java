import java.util.*;
public class Ex100 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first: ");
		int n1 = input.nextInt();
		
		System.out.print("Enter second: ");
		int n2 = input.nextInt();
		
		System.out.print("Enter third: ");
		int n3 = input.nextInt();
	
		System.out.print("Enter fourth ");
		int n4 = input.nextInt();
	
		System.out.print("Enter fifth: ");
		int n5 = input.nextInt();
		
		int number = 0;
		number +=n1*10000;
		number +=n2*1000;
		number +=n3*100;
		number +=n4*10;
		number +=n5*1;
		
		System.out.println(number);
		
	}//end main
	
}//end class
