import java.security.SecureRandom;
public class EvenOrOdd {
	static SecureRandom randomNumber = new SecureRandom();
	public static void evenOrOdd() {
		int even = 0, odd = 0;
		for(int counter = 1; counter<=50; counter++) {
			int number = 11 + randomNumber.nextInt(89);
			switch(number % 2) {
			case 0 : even++; break;
			default: odd++; 
			}
			
		}
		System.out.println("The even number equal to:" + even);
		System.out.println("The odd number equal to:" + odd);
		
	}
	
	public static void main(String[] args) {
		evenOrOdd();
	}

}
