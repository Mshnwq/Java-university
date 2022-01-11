import java.util.*;
public class Class {

	//instance variable
	private int value;
	
	//constructoe
	public Class(int value) {
		this.value = (value > 0? value:0);
	}
	public void setValue(int value) {
		this.value = (value > 0? value:0);
	}
	public int getValue() {return value;}
	public void increment() {value++;}
	public void decrement() {value--;}
	
	public static void main(String[] args) {
		
		
		
	}//end mai method
	
}//end class
