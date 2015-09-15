package Aufgabe3;
// A class that inherits from Circle and implements Drawable
import java.awt.Color;
import java.awt.Graphics;


public class DrawableCircle extends Circle implements Drawable{

	private Color c;
 	private double x, y;

	// Constructor
	public DrawableCircle(double r){super(r);}
		
	// Implement the interface
	public void setColor(Color c){this.c = c;}
	public void setPosition(double x, double y){
		this.x = x;
		this.y = y;
	}

	public void draw(Graphics g){
		g.setColor(c);
		g.drawOval((int)x, (int)y, (int)r, (int)r);
	}
}
