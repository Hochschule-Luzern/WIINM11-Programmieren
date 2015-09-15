public class MainBruch {
 
  public static void main(String[] args) {
    Bruch b1 = new Bruch(1,2);
    Bruch b2 = new Bruch(3,4);
    Bruch b3 = new Bruch(8,7);
    Bruch b4 = new Bruch(4,5);
	Bruch b5; 					//?? Erklärung??
    b5 = b1.add(b2);
 
    System.out.println("Resultat: b5 = " + b5.print());
	System.out.println("b1 ist jetzt: " + b1.print());
	System.out.println("b2 ist jetzt: " + b2.print()); 	
	
	
	int i1;
	int i2 =3;
	int i3 = 5;
	i1 = i2 + i3;
	i2 = i3 - i1;
	
	System.out.println(i1);
  }
}