package Aufgabe4.solution;

public class Test {


	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Groesse f1 = new Fussballplatz();
		Groesse a3 = new PapierBlatt("A3");
		Groesse a4 = new PapierBlatt("A4");
//		Groesse a5 = new PapierBlatt("A5");

		System.out.println("f1.laenge: " + f1.laenge());
		System.out.println("a3.laenge: " + a3.laenge());
		System.out.println("a4.laenge: " + a4.laenge());
	}

}
