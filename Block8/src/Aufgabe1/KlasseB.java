package Aufgabe1;

/**
 * @author E.Mathis
 * @version 1.0 - 2014
 */
public class KlasseB extends KlasseA{
	private long longValue;
		
	public KlasseB(long longValue) {
		this.longValue = longValue;
	}

	/**
	 * setzt den Wert fuer die Instanzvariable longValue
	 * 
	 * @param long
	 */
	public void setLongValue(long longValue) {
		this.longValue = longValue;
	}

	/**
	 * liefert den Wert der Instanzvariable longValue zurueck
	 * 
	 * @return longValue long
	 */
	public long getLongValue() {
		return longValue;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "lng: " + longValue;
	}
}
