package practiceQuizCh3Package;

import java.util.Scanner;

public class HeartRatesTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		HeartRates heartRates1 = new HeartRates("asma", "sarouji", 25, 6, 1998);
		
		System.out.println(heartRates1.getMaxHeartRate(16, 9, 2020));
		
	}
}
