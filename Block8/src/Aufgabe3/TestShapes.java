package Aufgabe3;



// Usage of abstract classes
public class TestShapes{

	public static void main(String[] a){
	
		Shape[] shapes = new Shape[3]; // An array of shapes
		shapes[0] = new Circle(2.0);
		shapes[1] = new Rectangle(1.0,3.0);		
		shapes[2] = new Rectangle(3.0,9.0);
		double total_area =0d; 
		for(int i=0; i < shapes.length; i++){
			total_area= total_area+shapes[i].area();
		}
		// We do not need to care about rectangles or circles
		System.out.println("The total area: "+total_area);
	}
}
