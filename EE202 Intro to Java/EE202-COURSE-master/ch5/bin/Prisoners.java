import java.util.*;
public class Prisoners {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] names = new String[99];
		int [] ages = new int[99];
		String[] civilian = new String[99];
		int [] years = new int[99];
		double[] fine = new double[99];
		int count = 0;
		
		System.out.print("Enter yes to continou: ");
		String ask = input.next();
		
		
		while(ask.toUpperCase().equals("YES")) {
			System.out.println("Prisoner #" + (count+1) );
			System.out.print("Enter name: ");
			names[count] = input.next();
			
			System.out.print("Enter ages: ");
			ages[count] = input.nextInt();
			
			System.out.print("Enter civilian: ");
			civilian [count] = input.next();
			
			System.out.print("Enter years in prison: ");
			years[count] = input.nextInt();
			
			System.out.print("Enter fine: ");
			fine[count] = input.nextDouble();
			
			count++;
			System.out.print("Enter yes to continou: ");
			ask = input.next();
			
		}//end while
		
		for(int i = 0; i<count ; i++) {
			System.out.println();
			System.out.println("Prisoner#" + (i+1) );
			System.out.println("Name: " + names[i]);
			System.out.println("Ages: " + ages[i]);
			System.out.println("Civilian: " + civilian[i]);
			System.out.println("Years in prison: " + years[i]);
			System.out.printf("Fine: SR%.1f%n", fine[i]);
			System.out.println();
			
		}
		
	}//end main method
}//end class
