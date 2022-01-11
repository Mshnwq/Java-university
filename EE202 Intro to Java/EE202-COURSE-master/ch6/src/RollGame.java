import java.security.SecureRandom;
public class RollGame {

	public static int rollRandom() {
		SecureRandom randomNumbers = new SecureRandom();
		return 1+randomNumbers.nextInt(6);}
	
	public static void main(String[] args) {
		int number1, number2, sum;
		number1 = rollRandom();
		number2 = rollRandom();
		sum = number1 + number2;
		System.out.println("Player rolled " + number1 + " + " + number2 + " = " + sum);
		switch(sum) {
		case 7: case 11: System.out.println("Player wins");break;
		case 2: case 3: case 12: System.out.println("Player loses");break;
		default:
			System.out.println("Point is " + sum);
			number1 = rollRandom();
			number2 = rollRandom();
			int sum2 = number1+number2;
			while(sum2 != sum) {
				if(sum2 == 7) {
					System.out.println("Player loses");
					break;
				}
				number1 = rollRandom();
				number2 = rollRandom();
				sum2 = number1 + number2;
				System.out.println("Player rolled " + number1 + " + " + number2 + " = " + sum2);
			}
			if(sum == sum2) {
				System.out.println("Player wins");	
			}
			
		}
	}
}



