import java.util.Scanner;

public class Q17 {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int aCount = 0,
		bCount = 0,
		cCount = 0,
		dCount = 0;
	
	for(int i = 1; i<= 5; i++) {
		System.out.print("Enter letter grade: ");
		char grade = input.next().charAt(0);
		
		switch (grade) {
		case'A':
			aCount++;
			break;
		case 'B':
			bCount++;
			break;
		case 'C':
			cCount++;
			break;
		case 'D':
			dCount++;
			break;
		
		}//end switch
		
		
	}//end for loop
	
		System.out.printf("%s%d%n%s%d%n%s%d%n%s%d%n", "A: ", aCount, "B: ", bCount, "C: ", cCount, "D: ", dCount);
	}//end main method
}//end class
