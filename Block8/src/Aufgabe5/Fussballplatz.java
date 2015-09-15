package Aufgabe5;

public class Fussballplatz implements Groesse {

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

}
