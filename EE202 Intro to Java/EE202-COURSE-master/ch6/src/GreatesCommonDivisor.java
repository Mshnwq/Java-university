
public class GreatesCommonDivisor {

	public static int gcd(int number1, int number2) {
		int gcd = 1;
		int counter = (number1>number2? number1:number2);
		for(int i = 1; i<=counter; i++) {
			if((number1 % i == 0) && (number2 % i== 0))
				gcd = i;
		}
		
		return gcd;
	}
	
	public static void main(String[] args) {
		System.out.println(gcd(123, 36));
	}
	
}//end class
