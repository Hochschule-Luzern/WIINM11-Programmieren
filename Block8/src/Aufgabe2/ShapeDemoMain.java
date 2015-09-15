package Aufgabe2;

public class ShapeDemoMain {
	
	
    public static void main(String[] args) {
    	Rect  r1 = new Rect(1, 1, 4, 4);
    	Rect  r2 = new Rect(2, 3, 5, 7);
    	Kreis k1 = new Kreis(2,2,1);
    	Kreis k2 = new Kreis(4,3,2);
    	// Added
    	Line l1 = new Line(1,1,5,3);
    	Line l2 = new Line(2,2,14,7);
    	
    	System.out.println("Fläche r1:  " + r1.flaeche());
    	System.out.println("Fläche r2:  " + r2.flaeche());
    	System.out.println("Umfang r1:  " + r1.umfang());
    	System.out.println("Umfang r2:  " + r2.umfang());
    	System.out.println("Fläche k1:  " + k1.flaeche());
    	System.out.println("Fläche k2:  " + k2.flaeche());
    	System.out.println("Umfang k1:  " + k1.umfang());
    	System.out.println("Umfang k2:  " + k2.umfang());
    	// Added
    	System.out.println("Fläche l1:  " + l1.flaeche());
    	System.out.println("Umfang l1:  " + l1.umfang());
    	System.out.println("Fläche l2:  " + l2.flaeche());
    	System.out.println("Umfang l2:  " + l2.umfang());
  	  }
} 