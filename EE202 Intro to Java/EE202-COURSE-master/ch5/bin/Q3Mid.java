import java.util.*;
public class Q3Mid {

	
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	double sum = 0, odd = 1, even = 3;
	for(int i = 1; i<=3; i++) {
		if(i % 2 != 0) {
			sum +=(1/odd);
			odd +=4;
		}//end if
		else {
			sum +=(1/even) * (-1);
			even +=4;
		}//end else
	}
	
	System.out.println(sum);
	
	
	}//end amin 
	
}//end class
