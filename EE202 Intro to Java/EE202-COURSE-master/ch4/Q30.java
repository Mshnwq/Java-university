import java.util.Scanner;
public class Q30{
	public static void main(String[] args){
		
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		for(int i = 0; i<n ; i++){
			if(i == 0 || i == n-1){
				for(int j = 0; j<n; j++){
					System.out.print("*");
				}
				System.out.println();
			}
			else{
				System.out.print("*");
				for(int j=0;j<n-2;j++)System.out.print(" ");
				System.out.print("*");
				System.out.println();
				
			}
		}
		
	}//end main method
}//end class