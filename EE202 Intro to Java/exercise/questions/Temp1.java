package excersice;

public class Temp1 {

	
	private double feh;
	
	public void setFeh(double f) {
		this.feh = f;
		
	}
	
	
	public double toCeluis() {
		return (feh - 32) * (5/9.0);
	}
}
