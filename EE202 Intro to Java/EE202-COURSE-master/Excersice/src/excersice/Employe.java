 package excersice;

public class Employe {
	//instance var
	private String name;
	private int year;
	private double salary;
	private String address;
	
	//constructor:
	public Employe(String n, int y, Double s, String a) {
		this.name = n;
		this.year = y;
		this.salary = s; 
		this.address = a;
		
	}
	
	public void dispayInf() {
		System.out.printf("%s    %d    %.2f    %s", name, year, salary, address);
	}
	
	

}
