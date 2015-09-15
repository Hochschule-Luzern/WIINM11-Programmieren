package application.persister;

import java.util.List;

import application.modell.Person;

public interface Persister {

	/**
	 * Speichert das �bergebene Person-Objekt.
	 * 
	 * @param person
	 * @throws Exception
	 */
	void save(Person person) throws Exception;

	/**
	 * Entfernt das �bergebene Person-Objekt aus dem Datenbestand.
	 * 
	 * @param peson
	 * @throws Exception
	 */
	void delete(Person peson) throws Exception;

	/**
	 * Liefert alle im Datenbestand enthaltenen Personen zur�ck, falls welche
	 * vorhanden, sonst eine leere Liste.
	 * 
	 * @return
	 * @throws Exception
	 */
	List<Person> all() throws Exception;
}
