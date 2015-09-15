package Aufgabe2;

public class Kreis extends Shape{	
		static int anzahl = 0;		//Klassenvariable: 
		protected double x, y, r;	//Instanzvariablen 
		protected static final double PI = 3.1415926;	
		
		public Kreis( double x, double y, double r)	
					{this.x = x; this.y = y; this.r = r;}	
		public Kreis(double r){this(0.0, 0.0, r);}	
		public Kreis(Kreis k){this(k.x, k.y, k.r);}	
		public Kreis(){this(0.0, 0.0, 1.0);}	
		public double umfang(){return 2 * PI * r;}	
		public double flaeche(){return PI * r*r;}	
		public double getRadius(){return r;}	
}
