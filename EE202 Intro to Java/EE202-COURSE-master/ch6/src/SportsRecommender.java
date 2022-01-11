
public class SportsRecommender {

	public static String sportsRecommender(int c) {
		String s ;
		switch(c) {
		case 20: case 30: s ="lovely";break;
		case 10: case 40: s ="reasonable";break;
		default: s = "Please";
		}
		return s;
	}
	
	public static void main(String[] args) {
		System.out.println(sportsRecommender(20));
	}
}
