package Aufgabe3;

// A class that implements Shape
public class Rectangle extends Shape{


	protected double w, h;
	
	public Rectangle(){
		w = 0.0;
		h = 0.0;
    // sp_x = 0.0; sp_y = 0.0;
	}
	public Rectangle(double w, double h){	
		this.w = w;
		this.h = h;    //sp_x = 0.0; sp_y = 0.0;
	}

	public double area(){return w * h;}
	public double circumference(){return 2 * (w + h);}
	public double getWidth(){return w;}
	public double getHeight(){ return h;}
}
