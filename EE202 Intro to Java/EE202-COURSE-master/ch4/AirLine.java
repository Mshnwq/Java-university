import java.util.Scanner;
public class AirLine{
	Scanner input = new Scanner(System.in);
	//instance var
	int miles, totalBlue = 0, totalSilver = 0, totalGolden = 0;
	//method
	
	public void airlineMethod(){
		System.out.print("Enter Miles Travel: ");
		miles = input.nextInt();
		
		
		
		while(miles >5000){
			
			if(miles > 15000){
				System.out.println("GOLDEN!");
				totalGolden++;
				
			}
			else if(miles > 10000){
				System.out.println("SILVER");
				totalSilver++;
			}
			
			else{
				System.out.println("BLUE");
				totalBlue++;
			}
			
			System.out.print("Enter Miles Travel: ");
		    miles = input.nextInt();
			
		}
		
		System.out.println("Sorry Error input!");
		System.out.println("The result are: ");
		System.out.println("Blue customers numbers: " + totalBlue);
		System.out.println("Silver customers numbers: " + totalSilver);
		System.out.println("Golden customers numbers " + totalGolden);
		
		System.out.println();
		System.out.println("Thank you..!");
		
		
	}
	
	
	
	public static void main(String[] args){
		
		AirLine airLine1 = new AirLine();
		airLine1.airlineMethod();
		

	
	}//end main method
	
}//end class