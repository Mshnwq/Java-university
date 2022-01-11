import java.security.SecureRandom;
public class ProgrammingChallenging {

	private final static SecureRandom randomNumber = new SecureRandom();
	
	private static int die1, die2, sum;
	
	public static void roll() {
		die1 = 1 + randomNumber.nextInt(6);
		die2 = 1 + randomNumber.nextInt(6);
		
		sum = die1 + die2;
	}
	public static void main(String[] args) {
		
		int[] freq = new int[13];
		
		for(int i = 1; i<=36_000; i++) {
			roll();
			++freq[sum];
		}
		
		int total = 0;
		for(int element: freq)
			total +=element;
		
		double p = 0.0;
		System.out.printf("%5s %10s %10s %n", "Sum", "Freq", "Percentage");
		for(int i = 2; i<freq.length; i++) {
			p = ((double)freq[i]/total)*100;
			System.out.printf("%5d %10d %10.2f%n", i, freq[i], p);
		}
		

	}

}

