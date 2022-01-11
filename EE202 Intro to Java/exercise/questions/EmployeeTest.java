package excersice;

import java.util.Scanner;

public class EmployeeTest {
	public static void main(String[] args) {
		
		Employee employee1 = new Employee("Asma", "Sarouji", 150);
		employee1.getRaise(0.1);
		
		employee1.displayInfo();
		
		Employee employee2 = new Employee("Sereen", "Sarouji", 200);
		employee2.getRaise(0.1);
		employee2.displayInfo();
		
		
		
		

	}
}
