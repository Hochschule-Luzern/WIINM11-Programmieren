package Aufgabe3;

public class Line extends Shape {

	protected double l, g;
	
	public Line(double l, double g) {
		super();
		this.l = l;
		this.g = g;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double circumference() {
		// TODO Auto-generated method stub
		return l*2;
	}

}
