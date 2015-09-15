package application.persister;

import application.modell.Person;

public class Util {

	/**
	 * Hilfsmethode, welche aus der übergebenen Zeile ein Person-Objekt
	 * erstellt.
	 * 
	 * @param line
	 * @return
	 */
	public static Person toPerson(String line) {
		// Format: name#vorname#strasse#plz#ort

		String[] parts = line.split(PersisterImpl.DEL);

		return new Person(parts[0], parts[1], parts[2],
				Integer.parseInt(parts[3]), parts[4]);
	}

	/**
	 * Hilfsmethode, welche das übergebene Person-Objekt in eine Zeichenkette
	 * überführt, bei der die einzelnen Teile durch das vordefinierte
	 * Delimiter-Zeichen voneinander getrennt werden.
	 * 
	 * @param person
	 * @return
	 */
	public static String personToString(Person person) {

		// Beispiel: person --> Weber#Roland#Lindenstrasse 12#6010#Kriens

		String str = person.getName() + PersisterImpl.DEL + person.getVorname()
				+ PersisterImpl.DEL + person.getStrasse() + PersisterImpl.DEL
				+ person.getPlz() + PersisterImpl.DEL + person.getOrt();

		return str;
	}
}
