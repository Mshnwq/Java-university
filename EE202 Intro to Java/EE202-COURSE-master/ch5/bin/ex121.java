import java.util.*;
public class ex121 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String s = "";
		
		for(int i = 1; i<=5; i++) {
			System.out.print("Input: ");
			int number = input.nextInt();
			
			for(int j = 1; j<=number; j++) {
				s +="*";
			}
			s +="\n";
		}
		
		System.out.println(s);
		
		
	}//end main method
}//end class
