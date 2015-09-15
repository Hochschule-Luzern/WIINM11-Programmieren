package Aufgabe3;
// A class that implements Shape
public class Circle extends Shape { 


	protected double r;
	
	protected static final double PI = 3.14159265358979323846;
	
	public Circle(){r = 1.0; }	
	public Circle(double r){this.r = r;} 
				
	public double area(){return PI * r * r;}		
	public double circumference(){return 2 * PI * r;}
	public double getRadius(){return r;}
}
