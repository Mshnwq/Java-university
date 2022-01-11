import java.security.SecureRandom;
public class Statistics {
	private static final SecureRandom randomNumber = new SecureRandom();
	
	public static void main(String[] args) {
		int count1 = 0,
			count2 = 0,
			count3 = 0,
			count4 = 0,
			count5 = 0, 
			count6 = 0;
		for(int i = 1; i<= 60_0000; i++) {
			int chance = 1 + randomNumber.nextInt(6);
			switch(chance) {
			case 1: count1++;break;
			case 2: count2++;break;
			case 3: count3++;break;
			case 4: count4++;break;
			case 5: count5++;break;
			case 6: count6++;break;
			}//end switch 
			
		}//end loop
		
		System.out.println("1\t" + count1);
		System.out.println("2\t" + count2);
		System.out.println("3\t" + count3);
		System.out.println("4\t" + count4);
		System.out.println("5\t" + count5);
		System.out.println("6\t" + count6);
		
	}//end main method

}//end class
