
public class IsPerfect {

	public static boolean isPerfect(int number) {
		int counter = 1;
		int sum = 0;
		boolean isPerfect = false;
		while(counter < number) {
			if(number % counter == 0) {
				sum +=counter;
			}
			counter++;
		}
		if(sum == number)isPerfect = true;
		return isPerfect;
	}
	
	public static void main(String[] args) {
		for(int i = 1; i<= 50_000; i++)
			if(isPerfect(i)) {
				System.out.println(i + "\t" + isPerfect(i));
			}
	}
}
