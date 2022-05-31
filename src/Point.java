
public class Point {

		double x;
		double y;
		
		public Point(double xVal, double yVal){
			x = xVal;
			y = yVal;
		}
		
		public String getString() {
			return "{x: " + x + ", y: " + y + "}";
		}
		
		
	}
