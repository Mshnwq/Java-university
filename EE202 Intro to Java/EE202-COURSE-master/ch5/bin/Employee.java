
public class Employee {

	private String firstName, lastName;
	private double monthlySalary;
	
	public Employee(String fN, String lN, double mS) {
		firstName = fN;
		lastName = lN;
		setMonthlySalary(mS);
	}//end constructor
	
	//setters
	public void setMonthlySalary(double ms) {
		if(ms > 0)
			monthlySalary = ms;
		else 
			monthlySalary = 0.00;
		
	}
	
	public double getMonthlySalary() {
		return monthlySalary;
	}
	
	
}//end class
