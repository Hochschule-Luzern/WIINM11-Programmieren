package Aufgabe1;

/**
 * TestClass
 * Testet die 3 Klassen A, B und C im 
 * Zusammenhang mit dem Thema Vererbung
 * 
 * @author E.Mathis
 * @version 1.0 - 2014 
 * 
 */
public class TestClass {
	public static void main(String[] args) {
		int a = 13;
		long lng = 123456;
		String monat = "Januar";

		KlasseA objA = new KlasseA(a);
		KlasseB objB = new KlasseB(lng);
		KlasseC objC = new KlasseC(monat);

		// Ausgabe
		print("\nAusgabe:\n========");
		print(objA.toString());
		print(objB.toString());
		print(objC.toString());
		print("\n");
	}

	private static void print(String msg) {
		System.out.println(msg);
	}
}
