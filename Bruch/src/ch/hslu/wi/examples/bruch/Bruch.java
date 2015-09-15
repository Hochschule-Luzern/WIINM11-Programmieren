package ch.hslu.wi.examples.bruch;

/** Eine eigene einfache Bruchklasse
 *  mit einer add(...)-Methode
 * @autor Erwin Mathis
 * @version 1.0.1
 * @since 1.0.1
 * @see 	Folien von Dozent
 */

public class  Bruch extends Object{
	int zaehler;                         //Instanzvariable
	int nenner;                          //Instanzvariable


	/** (Standard-)Konstruktor für Klasse Bruch
	 * Erzeugt einen Bruch (0/1)
	 * @autor Erwin Mathis
	 *
	 */
	public Bruch() {                    //Standardkonstruktor
		zaehler = 0;			 //d.h. Konstruktor mit 0 Parameter
		nenner = 1;
	}

	/** Konstruktor für Klasse Bruch
	 * erzeugt einen Bruch (zz/nn)
	 * @param zz ist der Zaehler, nn ist der Nenner
	 * @autor Erwin Mathis
	 */
	public Bruch(int zz, int nn) {     //Konstruktor mit 2 Paramter
		zaehler = zz;
		nenner = nn;
	}

	/** Konstruktor für Klasse Bruch
	 * erzeugt einen Bruch (zz/1)
	 * @param zz ist der Zaehler, Nenner wird auf "1" gesetzt
	 * @autor Erwin Mathis
	 */
	public Bruch(int zz) {              //Konstruktor mit 1 Parameter
		zaehler = zz;
		nenner = 1;
	}

	/** add-Methode (Addieren von zwei Brüchen)
	 *  mit einer add(...)-Methode
	 *  @return Gibt die Summe der beiden Brüche zurück
	 *  @param bb ist ein Bruch, der zum aufrufenden Bruch gezählt
	 *  @autor Erwin Mathis
	 *
	 */
	public Bruch add(Bruch bb) {
		Bruch local = new Bruch();
		local.zaehler = this.zaehler * bb.nenner + bb.zaehler * this.nenner;
		local.nenner = this.nenner * bb.nenner;
		return local;                      // local ist in Bruch-Objekt!
	}
	/** toString-Methode wird überschrieben gibt den Bruch als String aus
	 * @return String der den Bruch darstellt
	 * @autor Erwin Mathis
	 */
	public String toString() {
		return this.getClass().getName() + " = " + this.zaehler + "/" + this.nenner;
	}

	/** print-Methode gibt den Bruch als String aus
	 * @return String der den Bruch darstellt in der Form: z/n
	 * @autor Erwin Mathis
	 */   

	public String print() {
		return this.zaehler + "/" + this.nenner;
	}

	/** equals-Methode zeigt, wie 2 Brüche verglichen werden
	 * kein Test auf mathematische Gleichheit!
	 * muss noch weiter ausprogrammiert werden!
	 * @return true, wenn z.B. 3/4 = 3/4
	 * @autor Erwin Mathis
	 */   
	public boolean equals(Bruch obj) {
		if (this.zaehler == obj.zaehler && this.nenner == obj.nenner)
			return true;
		else
			return false;
	}
}