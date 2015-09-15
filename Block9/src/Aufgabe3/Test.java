package Aufgabe3;

import java.util.Collections;
import java.util.Iterator;
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

		List<PapierBlatt> l2 = new LinkedList<PapierBlatt>();

		l2.add(new PapierBlatt("A3"));
		l2.add(new PapierBlatt("A4"));
		l2.add(new PapierBlatt("A5"));
		l2.add(new PapierBlatt("A3"));
		l2.add(new PapierBlatt("A3"));
		l2.add(new PapierBlatt("A4"));
		l2.add(new PapierBlatt("A5"));
		l2.add(new PapierBlatt("A5"));
		l2.add(new PapierBlatt("A3"));

		Iterator<PapierBlatt> it = l2.iterator();
		
		while(it.hasNext()){
			Groesse x = it.next();
			System.out.println("Laenge: "+x.laenge()+" Breite: "+x.breite());
		}
		
		System.out.println("Now sorted:");
		
		Collections.sort(l2,new LaengeComparator());
		
		it = l2.iterator();
		
		while(it.hasNext()){
			Groesse x = it.next();
			System.out.println("Laenge: "+x.laenge()+" Breite: "+x.breite());
		}
	}
}
