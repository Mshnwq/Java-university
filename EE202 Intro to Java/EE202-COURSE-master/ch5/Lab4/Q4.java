public class Q4{
	public static void main(String[] args){
		
		double sum = 0;
		
		for(int i = 0; i<=10; i +=2){
			sum += (double)i/(i+1);
		}
		System.out.printf("The sum is: %.2f" , sum);
		
	}//end main method
}//end class