import java.util.Scanner;
public class Q16 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s1 ="", s2="", s3="", s4="", s5="";
		
		for(int i = 1; i<= 5; i++) {
			System.out.print("Enter number: ");
			int number = input.nextInt();
			if(i == 1) {
				for(int j = 1; j<=number; j++) {
					s1 +="*";
				}
					
			}
			else if(i ==2) {
				for(int j = 1; j<=number; j++) {
					s2 +="*";
				}
				
			}
			else if(i ==3) {
				for(int j = 1; j<=number; j++) {
					s3 +="*";
				}
				
			}
			else if(i == 4) {
				for(int j = 1; j<=number; j++) {
					s4 +="*";
				}
				
			}
			else {
				for(int j = 1; j<=number; j++) {
					s5 +="*";
				}
				
			}
				
			
		}//end outer loop //five loops
			System.out.printf("%s%n%s%n%s%n%s%n%s%n", s1, s2, s3, s4, s5);
		
	}//end main method
	
}//end class
