package excersice;

public class HealthProfileTest {

	public static void main(String[] args) {
		HealthProfile healthProfile1 = new HealthProfile("Asma", "Sarouji", 25, 6, 1998);
		
		healthProfile1.askUser();
		
		healthProfile1.calcAge();
		healthProfile1.calcMaxHeartRate();
		healthProfile1.calcTargetHeartRate();
		healthProfile1.calcBMI();
		
		healthProfile1.displayInfo();
		
		
		
		
		
	}
}
