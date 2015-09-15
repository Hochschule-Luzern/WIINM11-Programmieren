package ch.hslu.wi.examples.bruch;

public class MainBruch {

	public static void main(String[] args) {

		Bruch b1 = new Bruch(1,2);
		Bruch b2 = new Bruch(3,4);
		Bruch b3 = new Bruch(8,7);
		Bruch b4 = new Bruch(4,5);

		Bruch b5;                // ?? Erklärung??
				b5 = b1.add(b2);
		Bruch b6 = b3.add(b4);

		System.out.println("Resultat: b5 = " + b5.print());
		System.out.println("b1 ist jetzt: " + b1.print());
		System.out.println("b2 ist jetzt: " + b2.print());
		System.out.println();
		System.out.println("Resultat: b6 = " + b6.print());
		System.out.println("b3 ist jetzt: " + b3.print());
		System.out.println("b4 ist jetzt: " + b4.print());

	}

}