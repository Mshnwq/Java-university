import java.util.Scanner;
public class IntegerPower {

	public static int integerPower(int base, int exp) {
		int result = 1;
		if(exp > 0) 
			for(int i = 1; i<= exp; i++ )
				result *=base;
		
		else 
			result =  0;
		return result;
		
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter base: ");
		int base = input.nextInt();
		System.out.print("Enter exp: ");
		int exp = input.nextInt();
		
		System.out.printf("%d^%d = %d%n",base, exp,integerPower(base, exp));
	}
}
