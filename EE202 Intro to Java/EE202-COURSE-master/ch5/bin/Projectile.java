
public class Projectile {

	private double vel, alpha;
	
	public Projectile(double vel, double alpha) {
		this.vel = vel;
		this.alpha = alpha;
	}
	
	public double getX(double t) {
		return(vel * Math.cos(alpha) * t);
	}
	
	public double getY(double t) {
		return((vel*Math.sin(alpha) * t) - (9.8 * t * t) /2);
	}
	
	
}//end Projectile class
