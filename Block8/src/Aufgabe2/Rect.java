package Aufgabe2;

import java.lang.Math;


/**
 * Diese Klasse repräsentiert ein Rechteck. Die Variablen x1,
 * y1,.. stellen die Ecken des Recktecks dar. Die Methoden
 * stellen Operationen dar, die mit Rechteck-Objekten gemacht 
 * werden können.
 **/
public class Rect extends Shape {
	// Attribute der Klasse
	protected double x1, y1, x2, y2;
	protected double sp_x, sp_y;

	/**
	 * Konstruktor mit 4 Koordinaten
	 **/
	public Rect(double x1, double y1, double x2, double y2) {
		double temp;
		if ((x1 < x2) && (y1 > y2)){
			temp = y1;
			y1 = y2;
			y2 = temp;
		}
		if ((x1 > x2) && (y1 > y2)){
			temp = x1;
			x1 = x2;
			x2 = temp;
			temp = y1;
			y1 = y2;
			y2 = temp;
		}
		if ((x1 > x2) && (y1 < y2)){
			temp = x1;
			x1 = x2;
			x2 = temp;
		}
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		sp_x = this.x1; // linker unterer Ecken als sp (spectial point) 
		sp_y = this.y1; // linker unterer Ecken als sp (spectial point
	}

	/**
	 * Ein anderer Konstruktor, der auf dem obigen basiert!
	 **/
	public Rect(double width, double height) {
		this(0, 0, width, height);
	}

	/** Standardkonstruktor, basiert auch auf dem ersten Konstruktor */
	public Rect() {
		this(0, 0, 0, 0);
	}


	/** Berechnet die Fläche eines Rechtecks
	 */
	public double flaeche() throws ArithmeticException {
		return Math.abs(x1 - x2) * Math.abs(y1 - y2);
	}

	/** Berechnet den Umfang eines Rechtecks
	 */
	public double umfang() {
		return 2 * (Math.abs(x1 - x2) + Math.abs(y1 - y2));
	}
}
