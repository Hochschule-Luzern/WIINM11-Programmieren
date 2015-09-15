package Aufgabe1a;

public class Fussballplatz implements Groesse{

	private int laenge;
	private int breite;

	public Fussballplatz() {
		laenge = 10500;
		breite = 7000;
	}

	@Override
	public int laenge() {
		return laenge;
	}

	@Override
	public int hoehe() {
		return 0;
	}

	@Override
	public int breite() {
		return breite;
	}

	public int grundflaeche(){
		return laenge*breite;
	}
	
	public int compareTo(Groesse o){
		
		int fo = o.breite()*o.laenge();
		int ft = laenge*breite;
		
		if(fo < ft){
			return 1;
		}
		if(fo > ft){
			return -1;
		}
		return 0;
	}
}
