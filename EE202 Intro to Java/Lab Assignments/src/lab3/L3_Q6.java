package lab3;

public class L3_Q6 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 10; i <= 17; ++i) {
			if (i == 12 || i == 16) {
				continue;
			}
			sum += i;
		}
		System.out.print(sum);
	}
}
