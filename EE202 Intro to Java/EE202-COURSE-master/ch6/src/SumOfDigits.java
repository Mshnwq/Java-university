
public class SumOfDigits {

	public static int sumOfDigit(int number) {
		int sum = 0;
		int ten = 1; 
		while(number / ten != 0) {
			ten *=10;
			sum +=(number % ten) / (ten/10);
		}
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println(sumOfDigit(54));
	}
}
