public class Q22{
	public static void main(String[] args){
	
		int counter = 0;
		System.out.println("N\tN^2\tN^3\tN^4\t");
		while(counter < 5){
			counter++;
			System.out.print(counter + "\t");
			System.out.print( (int)Math.pow(counter,2) + "\t");
			System.out.print((int)Math.pow(counter,3) + "\t");
			System.out.println((int)Math.pow(counter,4));
			
		}
	}
}//end class