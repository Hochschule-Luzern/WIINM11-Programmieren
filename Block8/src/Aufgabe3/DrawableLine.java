package Aufgabe3;

import java.awt.Color;
import java.awt.Graphics;

public class DrawableLine extends Line implements Drawable {

	private Color c;
	private double x, y;
	
	public DrawableLine(int l,int g){
		super(l,g);
	}
	
	@Override
	public void setColor(Color c) {
		// TODO Auto-generated method stub
		this.c = c;
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(c);
		g.drawLine((int) x, (int) y,(int)(x+this.l),(int)(y+this.g));
	}

	@Override
	public void setPosition(double x, double y) {
		this.x = x;
		this.y = y;

	}

}
