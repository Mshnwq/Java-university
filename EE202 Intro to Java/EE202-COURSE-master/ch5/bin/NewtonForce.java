
public class NewtonForce {

	//instance var
	private double force;
	private double mass;
	
	//condtructor
	public NewtonForce(double m, double f) {
		mass = m;
		force = f;
	}//end condtructor
	
	public double compA() {
		return force/mass;
	}
	
	public void setMass(double m) {
		mass = m;
	}
	
	public void setForce(double f) {
		force = f;
	}
	
	public double getForce() {
		return force;
	}
	
	public double getMass() {
		return mass;
	}
	
	
}//end class
