package Aufgabe3;

public interface Groesse {
	
	static final int dim = 3;
	
	public int laenge();	
	public int hoehe();	
	public int breite();
	public int grundflaeche();
	public int compareTo(Groesse g);

}