package excersice;

public class Temp {
	
	
	
	public double getResult(double num, char l ) {
		if (l == 'f') {
			return 9 * (num /5) + 32;
			
		}
		else if (l == 'c'){
			return (num - 32) * 5/9;
		}
		else {
			return 0.0;
		}
		
	}
	
	
	
	

}
