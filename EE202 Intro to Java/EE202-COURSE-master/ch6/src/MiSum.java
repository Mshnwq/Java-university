
public class MiSum {

	public static void miSum() {
	double sum = 0;
	System.out.println("i" + " " + "m(i)");
	for(int i = 1; i<=20; i++) {
		sum +=i/(double)(2*i+1);
		System.out.printf("%d %.4f%n", i, sum);
	}
	}
	
	public static void main(String[] args) {
		miSum();
	}
}
