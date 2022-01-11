package ch3Package;


public class Employee {
	//instance va
	private String firstName;
	private String lastName;
	private double monthlySalary;

	
	//constructor
	public Employee(String firstName, String lastName, double monthlySalary) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.monthlySalary =monthlySalary;
		
	}
	
	//set methods
	
	public void setFirstName(String firstNam ) {
		this.firstName = firstNam;
		
	}
	
	public void setLastName(String lastname) {
		this.lastName = lastname;
	}
	
	public void setMonthlySalary( double monthlySalary) {
		if(monthlySalary > 0) {
			this.monthlySalary = monthlySalary;
		}
		
	}
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public double getMonthlySalary() {
		return monthlySalary;
	}
	
	
	



}
