public class Q2{
	public static void main(String[] args){
		
		System.out.printf("%-10s %-10s %-10s\n", "Number", "Square", "Cube");
		
		for(int x = 1; x<=10;  x++){
			System.out.printf("%-10d %-10d %-10d\n", x, x*x, x*x*x);
		}
		
	}//end main method
}//end class