
public class Circle {
	double radius;
	
	public Circle(double rad) {
		radius = rad;
	}
	
	public double getDiameter(){
		double diameter = 2.0 * radius;
		return diameter;
	}
	
	public double getArea(){
		double area = Math.PI * Math.pow(radius ,2);
		return area;
	}
	
	public double getCircumference() {
		double circumference = 2 * Math.PI * radius;
		return circumference;
	}
	
	
	
	
}

