public class Q4{
	public static void main(String[] args){
		double sum = 0, j = 0;
		
		for(int i = 0; i<=11; i++){
			j = i;
			
			if ( i % 2 == 0){
				
				sum = sum + (i /++j );	
				
				
			}
			
		}//end for loop
		
		System.out.printf("The sum is: %.2f\n", sum);
		
	}//end main method
	
}//end class Q4