
public class Line {

		 Point firstPoint;
		 Point secondPoint;
			public Line(double x1, double y1, double x2, double y2) {
				Point PointOne = new Point(x1, y1); 
				firstPoint = PointOne;
				Point PointTwo = new Point(x2, y2); 
				secondPoint = PointTwo;
			}
			
			public Line(Point p, Point p2) {
				firstPoint = p;
				secondPoint = p2;
			}
			
			public double getSlope() {
				double slope=  ((double)(secondPoint.y - firstPoint.y)/ (secondPoint.x -firstPoint.x));
				return slope;
			}

			public String getString() {
				return "<Point one: " + firstPoint.getString()+ ", Point two: " + secondPoint.getString()+ ">";
				
			}


		
}
