
public class Q20 {//q20 in the book

	public static void main(String[] args) {
		
		double sum = 0;
		int p = 1;
		int counter = 0;
		
		for(int i = 1; i<=2 * (200000); i +=2) {
			p++;
			sum +=(4/(double)i) * Math.pow(-1, p);
			
			counter++;
			System.out.println("Counter " + counter + " Pi " + sum);
			//Why the counter starts with 197868
			
					
			
			
			
			
		}
		
		
	}//end main method
}//class
