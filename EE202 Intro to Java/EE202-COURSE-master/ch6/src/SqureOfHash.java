import java.security.SecureRandom;
public class SqureOfHash {
	public static void squreOfHashes(int number) {
		for(int i = 1; i<=number; i++ ) {
			for(int j = 1; j<=number; j++)
				System.out.print("#");
			
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		SecureRandom randomNumber = new SecureRandom();
		int dic = 1 + randomNumber.nextInt(6);
		squreOfHashes(dic);
	}

}
