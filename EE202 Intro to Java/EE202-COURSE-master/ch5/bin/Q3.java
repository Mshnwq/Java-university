
public class Q3 {

	public static void main(String[] args) {
		for(int s1 = 1; s1 <=30; s1++) {
			for(int s2 = 1; s2<=30; s2++) {
				for(int h = 1; h<=30; h++) {
					if(Math.sqrt(s1*s1 + s2*s2) == h) {
						System.out.println("s1: " + s1 + "\t\t" + "s2: " + s2 + "\t\t" + "h: " + h+ "\t\t");
					}//end if
				}//end for3
			}//end for2
			
		}//end for1
		
	}//end main
}//end class
