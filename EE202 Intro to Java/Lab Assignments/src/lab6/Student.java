package lab6;

public class Student {

		private String firstName;
		private String lastName;
		private double exam1, exam2, exam3;

		public Student ( String firstName,
					     String lastName,
					     double exam1,
				         double exam2,
				         double exam3) {
			
			 this.firstName = firstName;
			 this.lastName = lastName;
			 this.exam1 = exam1;
			 this.exam2 = exam2;
			 this.exam3 = exam3;
		}
		
		public String getFirstName() {
			return firstName;
			}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
			}
		public double getExamGrade1() {
			return exam1;
		}
		public void setExamGrade1(double exam1) {
			this.exam1 = exam1;
		}
		public double getExamGrade2() {
			return exam2;
		}
		public void setExamGrade2(double exam2) {
			this.exam2 = exam2;
		}
		public double getExamGrade3() {
			return exam3;
		}
		public void setExamGrade3(double exam3) {
			this.exam3 = exam3;
		}
		public double getAverage(){
			double Avg = ((exam1+exam2+exam3)/3.0);
			return Avg;
		} 
}