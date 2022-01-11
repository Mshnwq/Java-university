package excersice;

public class Employee {
	
	private String firstName;
	private String lastName;
	private double monthlySalary;
	private double yearlySalaryAfterRaise;
	//private double yearlySalary = 12 * monthlySalary;
	private double raiseAmount;
	
	public Employee(String fN, String lN, double mS) {
	
		this.firstName = fN;
		this.lastName = lN;
		if (mS >= 0) {
			this.monthlySalary= mS;
		}
	}
	
	
	//setMehtods
	public void setFirstName(String fN) {
		this.firstName = fN;
	}
	
	public void SetLastName(String lN) {
	
		this.lastName = lN;
	}
	
	public void setMonthlySalary(double mS) {
		if(mS >=0 ) {
			this.monthlySalary = mS;
		}
	}
	
	//getMethods
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public double  getMonthlySalary() {
		return monthlySalary;
	}
	
	
	
	public void getRaise(double rA) {//rA = raise Amount
		this.raiseAmount = rA;
		yearlySalaryAfterRaise = 12 * monthlySalary * (1 + raiseAmount);
	}
	
	//displayInfo
	public void displayInfo() {
		System.out.println();//new line
		System.out.println("Information of Employee");
		System.out.println();//New Line
		System.out.printf("First name: %s%n", firstName);
		System.out.printf("Last name: %s%n", lastName);
		System.out.printf("Monthly salary is: %.2f%n", monthlySalary);
		System.out.printf("Yearly Salary is: %.2f%n", 12 * monthlySalary);
		System.out.printf("Raise yearly Salary by %.2f is %.2f%n", raiseAmount, yearlySalaryAfterRaise);
		
	}
	

}
