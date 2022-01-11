import java.util.Scanner;
public class IsPrime {

	static Scanner input = new Scanner(System.in);

	public static boolean isPrime(int number) {
		boolean isPrime = true;
		if(number == 1 || number == 0) isPrime = false;
		if(number % i == 0) {
		for(int i = 2; i<=number-1; i++) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}
	
	public static void main(String[] args) {
		
		
		System.out.println(isPrime()? "Prime":"NOT Prime");
	}

}
