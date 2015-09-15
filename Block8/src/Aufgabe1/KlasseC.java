package Aufgabe1;

/**
 * @author E.Mathis
 * @version 1.0 - 2014
 */
public class KlasseC extends KlasseB {
	private String monat;

	public KlasseC(String monat) {
		super(3);
		this.monat = monat;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "monat: " + monat;
	}

	/**
	 * setzt den Wert fuer die Instanzvariable monat
	 * 
	 * @param monat
	 * String name des Monats
	 */
	public void setMonat(String monat) {
		this.monat = monat;
	}

	/**
	 * liefert den Wert der Instanzvariable monat zurueck
	 * 
	 * @return monat String
	 */
	public String getMonat() {
		return monat;
	}
}
