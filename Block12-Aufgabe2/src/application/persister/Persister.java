package application.persister;

import java.util.List;

import application.modell.Person;

public interface Persister {

	/**
	 * Speichert das übergebene Person-Objekt.
	 * 
	 * @param person
	 * @throws Exception
	 */
	void save(Person person) throws Exception;

	/**
	 * Entfernt das übergebene Person-Objekt aus dem Datenbestand.
	 * 
	 * @param peson
	 * @throws Exception
	 */
	void delete(Person peson) throws Exception;

	/**
	 * Liefert alle im Datenbestand enthaltenen Personen zurück, falls welche
	 * vorhanden, sonst eine leere Liste.
	 * 
	 * @return
	 * @throws Exception
	 */
	List<Person> all() throws Exception;
}
