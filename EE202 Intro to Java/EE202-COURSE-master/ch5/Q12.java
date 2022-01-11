public class Q12{
	public static void main(String[] args){
		int counter = 1,
			sum = 0;
			
		for(; counter <=30; counter++){
			
			if(counter % 3 == 0){
				sum +=counter;
			}//end if 
		}//end for loop	
		
		System.out.println("The sum " + sum);
		
	}
}//end class