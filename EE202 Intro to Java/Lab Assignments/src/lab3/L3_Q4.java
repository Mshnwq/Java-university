package lab3;

public class L3_Q4 {

	public static void main(String[] args) {
		int i = 0;
		int sum = 0;
		while (i<10) {
			++i;
			if (i == 3 || i == 6) {continue;}
			sum += i;
		}
		System.out.printf("Sum is: %d%n",sum);
	}
}
