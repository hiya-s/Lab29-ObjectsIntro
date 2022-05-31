
public class Bicycle {
	String color;
	double location;
	double speed;
	
	public Bicycle (String c) {
		color = c;
		location =0;
		speed =0;
		
	}
	
	public void setSpeed(double newSpeed) {
		speed = newSpeed;
		
	}

	public void increaseSpeed( double deltaSpeed) {
		speed = speed +deltaSpeed;
		
	}
	
	public double travel(double hours) {
		double distance = speed * hours;
		location = location + distance;
		return distance;
	}
	
	
}
