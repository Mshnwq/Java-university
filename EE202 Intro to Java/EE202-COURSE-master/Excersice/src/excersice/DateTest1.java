package excersice;

public class DateTest1 {
	public static void main(String[] args) {
		Date1 date1 = new Date1(7, 4, 2004);
		
		System.out.print("The initial date is: ");
		date1.displayDate();
		
		//changing value by using set
		date1.setMonth(11);
		date1.setDay(1);
		date1.setYear(2003);
		
		System.out.print("Date with new values is: ");
		date1.displayDate();
		
	}

}
