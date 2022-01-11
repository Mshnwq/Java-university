package lab5;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee Employee1 = new Employee("Bob", "Jones", 2875.00);
		Employee Employee2 = new Employee("Susan", "Baker", 3150.75);
		
		System.out.printf("Employee 1: %s %s; Yearly salary: %.2f%n",
				Employee1.getFirstName(),Employee1.getLastName(),Employee1.getMonthlySalary()*12);
		System.out.printf("Employee 2: %s %s; Yearly salary: %.2f%n",
				Employee2.getFirstName(),Employee2.getLastName(),Employee2.getMonthlySalary()*12);
		
		Employee1.setMonthlySalary(Employee1.getMonthlySalary()*1.10);
		Employee2.setMonthlySalary(Employee2.getMonthlySalary()*1.10);
		
		System.out.printf("%nIncreasing employee salaries by 10%% %n");
		System.out.printf("Employee 1: %s %s; Yearly salary: %.2f%n",
				Employee1.getFirstName(),Employee1.getLastName(),Employee1.getMonthlySalary()*12);
		System.out.printf("Employee 2: %s %s; Yearly salary: %.2f%n",
				Employee2.getFirstName(),Employee2.getLastName(),Employee2.getMonthlySalary()*12);
	}
}