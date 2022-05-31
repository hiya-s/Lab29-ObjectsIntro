
public class DrawingTheLine {
	public static void main  (String args[]) {
		//a
		Point p1 = new Point(23.14, 4.87);
		
		//b
		Point p2 = new Point(15.2, 6.87);
		
		//c
		Line line1 = new Line(p1,p2);
		
		//d
		Line line2 = new Line (12.45, 8.1, 9.2, 14.7);
		
		//e
		System.out.println(line1.getString());
		
		//f
		System.out.println(line2.getString());
		
		//g
		double x = line1.getSlope();
		System.out.println(x);
		
		//h
		double y = line2.getSlope();
		System.out.println(y);
		
		//i
		//output
		
	}
	
}


	