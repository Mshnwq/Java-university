import java.security.SecureRandom;
public class StimulateTwoRolling {

	static SecureRandom randomNumber = new SecureRandom();
	
	public static int rolling() {
		int dic1 = 1 + randomNumber.nextInt(6);
		int dic2 = 1 + randomNumber.nextInt(6);
		
		return dic1 + dic2;
	}
	
	public static void main(String[] args) {
		int f2 = 0,
			f3 = 0,
			f4 = 0,
			f5 = 0,
			f6 = 0,
			f7 = 0,
			f8 = 0,
			f9 = 0,
			f10 = 0,
			f11 = 0,
			f12 = 0;
		int totalf;
		for(int counter = 1; counter <=36_000; counter++) {
			int sum = rolling();
			switch(sum) {
			case 2: f2++; break;
			case 3: f3++; break;
			case 4: f4++; break;
			case 5: f5++; break;
			case 6: f6++; break;
			case 7: f7++; break;
			case 8: f8++; break;
			case 9: f9++; break;
			case 10: f10++; break;
			case 11: f11++; break;
			case 12: f12++; break;
			}
		}
		totalf = f2+f3+f4+f5+f6+f7+f8+f9+f10+f11+f12;
		double p2 = 0, p3 = 0, p4 = 0, p5 = 0, p6 = 0, p7 = 0, p8 = 0, p9 = 0, p10 = 0, p11 = 0, p12 = 0;
		for(int counter = 2; counter<=12; counter++ ) {
			switch(counter) {
			case 2: p2 = f2/(double)totalf; break;
			case 3: p3 = f3/(double)totalf; break;
			case 4: p4 = f4/(double)totalf; break;
			case 5: p5 = f5/(double)totalf; break;
			case 6: p6 = f6/(double)totalf; break;
			case 7: p7 = f7/(double)totalf; break;
			case 8: p8 = f8/(double)totalf; break;
			case 9: p9 = f9/(double)totalf; break;
			case 10: p10 = f10/(double)totalf; break;
			case 11: p11 = f11/(double)totalf; break;
			case 12: p12 = f12/(double)totalf; break;
			}
		}
		
		System.out.printf("Sum\tFrequency\tPercentage%n");
		System.out.printf("2\t%d\t\t%f%n", f2, p2*100);
		System.out.printf("3\t%d\t\t%f%n", f3, p3*100);
		System.out.printf("4\t%d\t\t%f%n", f4, p4*100);
		System.out.printf("5\t%d\t\t%f%n", f5, p5*100);
		System.out.printf("6\t%d\t\t%f%n", f6, p6*100);
		System.out.printf("7\t%d\t\t%f%n", f7, p7*100);
		System.out.printf("8\t%d\t\t%f%n", f8, p8*100);
		System.out.printf("9\t%d\t\t%f%n", f9, p9*100);
		System.out.printf("10\t%d\t\t%f%n", f10, p10*100);
		System.out.printf("11\t%d\t\t%f%n", f11, p11*100);
		System.out.printf("12\t%d\t\t%f%n", f12, p12*100);
		
		
		
	}
}
