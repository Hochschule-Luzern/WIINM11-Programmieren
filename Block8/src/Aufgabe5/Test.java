package Aufgabe5;

import java.util.LinkedList;
import java.util.List;

public class Test {

	public static int grundflaeche(Groesse g) {
// to do!!		
		return g.grundflaeche();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Groesse f1 = new Fussballplatz();
		Groesse a3 = new PapierBlatt("A3");
		Groesse a4 = new PapierBlatt("A4");
		Groesse a5 = new PapierBlatt("A5");
		
		System.out.println("Fl�che von f1 in mm^2: " + grundflaeche(f1));
		System.out.println("Fl�che von A3 in mm^2: " + grundflaeche(a3));
		System.out.println("Fl�che von A4 in mm^2: " + grundflaeche(a4));
		System.out.println("Fl�che von A5 in mm^2: " + grundflaeche(a5));

		// Liste mit Papierbl�ttern, wird �ber deren compareTo Methode sortiert
		List<Groesse> l2 = new LinkedList<Groesse>();
		l2.add(f1);
		l2.add(a3);
		l2.add(a4);
		l2.add(a5);
// to do!!!! (add all elements!)
		
		double summe = 0;
		for(int i=0; i<l2.size();i++){
			summe += l2.get(i).grundflaeche();
		}
// to do: imlement the for-loop!!
		
		
		
		
		System.out.println("Die Gesamtfl�che betr�gt: " + summe);

	}

}
