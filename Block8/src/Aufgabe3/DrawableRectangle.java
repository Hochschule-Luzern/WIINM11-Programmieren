package Aufgabe3;


// A class that inherits from Rectangle and implements Drawable
import java.awt.Color;
import java.awt.Graphics;

public class DrawableRectangle extends Rectangle implements Drawable{

	private Color c;
	private double x, y;

	// Constructor
	public DrawableRectangle(double w, double n){super(w, n);}
	// Implement the interface
	public void setColor(Color c){this.c = c;}
	public void setPosition(double x, double y){
		this.x = x;
		this.y = y;
	}
	public void draw(Graphics g){
		g.setColor(c);
		g.drawRect((int)x, (int)y, (int)w, (int)h);
	}
}
