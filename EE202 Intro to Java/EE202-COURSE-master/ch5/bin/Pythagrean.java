
public class Pythagrean {

	public static void main(String[] args) {
		int count = 0;
		int count2 = 0;
		for(int s1 = 1; s1<=500; s1++) {
			for(int s2 = 1; s2<=500; s2++) {
				
				for(int h =1 ; h<=500; h++) {
					
					
					if(Math.sqrt(s1*s1 + s2*s2) ==h) {
						count2 ++;
						System.out.printf("s1: %d, s2: %d, h: %d%n",s1,s2,h);
						
						
						}
					
					}
				count++;
				if(count2 == 20) {
					
					break;
				}
					
				}
			
			
			}
		
		System.out.println("The inner loop irated " + count + " times.");
	}//end main
}
