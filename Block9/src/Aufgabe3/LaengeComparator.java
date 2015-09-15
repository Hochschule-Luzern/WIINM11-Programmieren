package Aufgabe3;

import java.util.Comparator;

class LaengeComparator implements Comparator<AbstractGroesse> {

	@Override
	public int compare(AbstractGroesse p1, AbstractGroesse p2) {
		
		if(p1.laenge() > p2.laenge()){
			return 1;
		}
		if(p1.laenge() < p2.laenge()){
			return -1;
		}
		return 0;
	}
}
