public class Q2{
	public static void main(String[] args){
		
		System.out.println("Number\tSquare\tCube");
		for(int i = 1; i<=10; i++){
			System.out.println(i + "\t" + (int)Math.pow(i,2) + "\t" + (int)Math.pow(i,3) );
		}//end for loop
	}//end main method
}//end class