
public class Q14 {

	public static void main(String[] args) {
		double p5 = 1000, p6 = 1000, p7 = 1000, p8 = 1000, p9 = 1000, p10 = 1000;
		
		
		
		System.out.printf("%s\t%2s%16s%16s%16s%16s%16s%n", "years", "5%", "6%", "7%", "8%", "9%", "10%");
		for(int year = 1; year <= 10; year++) {
			double rate = 0.04;
			System.out.printf("%3d", year);
			for(int i= 5; i<=10; i++) {
				rate +=0.01;
				switch (i) {
				case 5:
					p5 +=p5*rate;
					break;
				case 6: 
					p6 +=p6*rate;
					break;
					
				case 7: 
					p7 +=p7*rate;
					break;
				case 8: 
					p8 +=p8*rate;
					break;
					
				case 9: 
					p9 +=p9*rate;
					break;
				
				case 10:
					p10 +=p10*rate;
				}//end switch
				
				
			}//end inner loop
			System.out.printf("\t%,3.2f\t%,3.2f\t%,3.2f\t%,3.2f\t%,3.2f\t%,3.2f%n", p5, p6, p7, p8, p9, p10);
			
			
		}//outer loop
		
		
	}//end main
}//end class
