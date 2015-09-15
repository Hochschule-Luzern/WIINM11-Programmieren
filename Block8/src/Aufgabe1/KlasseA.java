package Aufgabe1;

/**
 * @author E.Mathis
 * @version 1.0 - 2014
 */
public class KlasseA {
	private int a;
	
	public KlasseA(){
		
	}
	/**
     * @author E.Mathis
     * @version 1.0 - 2014
	 * @param a int
	 */
	public KlasseA(int a) {
		this.a = a;
	}

	/**
	 * liefert den Wert der Instanzvariable a zurueck
	 * 
	 * @return a int
	 */
	public int getA() {
		return a;
	}

	/**
	 * liefert eine passende String-Darstellung des aktuellen Objekts
	 * 
	 * @return String
	 */
	public String toString() {
		return "a = " + a;
	}
}
