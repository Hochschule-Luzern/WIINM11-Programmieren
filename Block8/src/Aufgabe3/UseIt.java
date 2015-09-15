package Aufgabe3;


// Usage of classes that implement interfaces
import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;

public class UseIt extends Applet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Shape[] shapes = new Shape[7]; // create an array for shapes
	Drawable[] drawables = new Drawable[7];
	// and an array for the drawable objects

	// Create some drawable forms
	DrawableCircle dc1 = new DrawableCircle(50);
	DrawableCircle dc2 = new DrawableCircle(50);
	DrawableCircle dc3 = new DrawableCircle(50);
	DrawableRectangle dr1 = new DrawableRectangle(190, 40);
	DrawableRectangle dr2 = new DrawableRectangle(80, 70);
	DrawableRectangle dr3 = new DrawableRectangle(50, 150);
	DrawableLine dl1 = new DrawableLine(40,0);

	public void paint(Graphics g) {

		// One can assign drawable forms to shapes and to drawables!
		shapes[0] = dc1;
		drawables[0] = dc1;
		dc1.setColor(new Color(176,134,245));
		
		
		shapes[1] = dr1;
		drawables[1] = dr1;
		drawables[1].setColor(new Color(12,12,12));
		
		shapes[2] = dr2;
		drawables[2] = dr2;
		drawables[2].setColor(new Color(222,12,12));
		
/*	    shapes[3] = dr3;
    	drawables[3] = dr3;  */
    	
		shapes[4] = dc2;
		drawables[4] = dc2;
		
		shapes[5] = dc3;
		drawables[5] = dc3;
		drawables[5].setColor(new Color(255,255,0));
		
		
		// Added
		shapes[6] = dl1;
		drawables[6] = dl1;
		drawables[6].setColor(new Color(255,255,0));

		double total_area = 0;

		// use the array
		for (int i = 0; i < shapes.length; i++) {
			total_area = total_area + shapes[i].area();
			drawables[i].draw(g);
		}
		System.out.println("total_area");
		g.drawString("Total area: " + total_area, 200, 400);
	}

	public void start() {

		shapes[0] = dc1;
		drawables[0] = dc1;
		drawables[0].setPosition(40, 200);
		
		shapes[1] = dc2;
		drawables[1] = dc2;
		drawables[1].setPosition(150, 200);
		
		shapes[2] = dr1;
		drawables[2] = dr1;
		drawables[2].setPosition(30, 160);
		
		shapes[3] = dr2;
		drawables[3] = dr2;
		drawables[3].setPosition(50, 90);
		
		// add
		shapes[5] = dc3;
		drawables[5] = dc3;
		drawables[5].setPosition(40, 40);
		
		shapes[6] = dl1;
		drawables[6] = dl1;
		drawables[6].setPosition(0, 60);

	}

}