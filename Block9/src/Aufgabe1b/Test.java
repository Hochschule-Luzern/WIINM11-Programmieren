package Aufgabe1b;

import java.util.LinkedList;
import java.util.List;

public class Test {

	public static int grundflaeche(Groesse g) {
// to do!!		
		return 0;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Groesse f1 = new Fussballplatz();
		Groesse a3 = new PapierBlatt("A3");
		Groesse a4 = new PapierBlatt("A4");
		Groesse a5 = new PapierBlatt("A5");
		
		System.out.println("Fläche von f1 in mm^2: " + grundflaeche(f1));
		System.out.println("Fläche von A3 in mm^2: " + grundflaeche(a3));
		System.out.println("Fläche von A4 in mm^2: " + grundflaeche(a4));
		System.out.println("Fläche von A5 in mm^2: " + grundflaeche(a5));

		// Liste mit Papierblättern, wird über deren compareTo Methode sortiert
		// to do!!!! (add all elements!)
		List<Groesse> l2 = new LinkedList<Groesse>();
		l2.add(f1);
		l2.add(a3);
		l2.add(a4);
		l2.add(a5);
		
		int res = a5.compareTo(a4);
		
		if(res==0){System.out.println("Gleich gross");}
		if(res==-1){System.out.println("Papier ist kleiner");}
		if(res==1){System.out.println("Papier is grösser");}
		
		// to do: imlement the for-loop!!
		double summe = 0;
		for(int i=0; i<l2.size();i++){
			summe += l2.get(i).grundflaeche();
		}
		
		System.out.println("Die Gesamtfläche beträgt: " + summe);

	}
}
