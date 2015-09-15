
package Aufgabe3;


// Define a abstract class
public abstract class Shape{

  	protected double sp_x, sp_y;                // sp:= special point
	public abstract double area();
	public abstract double circumference();   
  	public double distanzVonNull(){return Math.sqrt(sp_x*sp_x + sp_y*sp_y);}
}
