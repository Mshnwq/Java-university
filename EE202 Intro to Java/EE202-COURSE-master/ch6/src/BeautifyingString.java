import java.lang.*;
import java.util.Scanner;
public class BeautifyingString {

	static Scanner input = new Scanner(System.in);
	
	public static String fullStopString(String string) {//method1
		if(string.endsWith(".") == false)
			string +=".";
		return string;
	}
	

	public static StringBuffer capitalFirstChar(String string) {
		StringBuffer s = new StringBuffer(string);
		Character firstChar = string.charAt(0);
		if(Character.isUpperCase(firstChar) == false) {
			s.deleteCharAt(0);
			s.insert(0,Character.toUpperCase(firstChar));
		}
		return s;
		
	}
	
	public static void beautifyString(String string) {
		System.out.println("BEFORE: " + string);
		System.out.println("AFTER:  " + capitalFirstChar(fullStopString(string)));
	}
	
	public static void main(String[] args) {
		System.out.print("Write somethin: ");
		String string = input.next();
		
		beautifyString(string);
		
	}
		
}//end class
