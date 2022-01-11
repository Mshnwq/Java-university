import java.util.Scanner;
public class PowersOf2{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int num;
		System.out.println("How many powers of 2 would you like printed? ");
		num = input.nextInt();
		
		System.out.println("Here are the first " + num + " powers of 2: ");
		int counter = 0;
		int p = 1;
		
		while(counter < 6){
			
			System.out.println("2^" + counter + " = " + p);
			
			p *=2;
			
			counter++;
		}
		
	}//end main
}//end class