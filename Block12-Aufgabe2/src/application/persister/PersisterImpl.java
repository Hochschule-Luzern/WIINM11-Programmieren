package application.persister;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import application.modell.Person;

public class PersisterImpl implements Persister {

	/* Delimiter */
	public static final String DEL = "#";

	/* Name der Datei, in der die Personendaten verwaltet werden */
	private String fileName;

	public PersisterImpl() {
		readProperties();
	}

	@Override
	public void save(Person person) throws Exception {

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName,
				true))) {
			String line = Util.personToString(person);
			bw.write(line);
			bw.newLine();
		}
	}

	@Override
	public void delete(Person person) throws Exception {

		String personToDeleteAsString = Util.personToString(person);
		List<String> personAsStringListe = new ArrayList<>();

		/* Alle Zeilen aus der Datei auslesen */
		try (BufferedReader reader = new BufferedReader(
				new FileReader(fileName))) {
			reader.lines().forEach(line -> personAsStringListe.add(line));
		}

		/*
		 * Zeile für die übergebene Person aus der Liste entferenen, falls
		 * vorhanen
		 */
		personAsStringListe.removeIf(str -> str.equals(personToDeleteAsString));

		/* Den restlichen Inhalt in die Datei zurückschreiben */
		try (PrintWriter writer = new PrintWriter(fileName)) {
			for (String str : personAsStringListe)
				writer.println(str);
		}
	}

	@Override
	public List<Person> all() throws Exception {

		List<Person> personListe = new ArrayList<>();

		/* Alle Zeilen aus der Datei auslesen */
		try (BufferedReader reader = new BufferedReader(
				new FileReader(fileName))) {
			reader.lines()
					.forEach(line -> personListe.add(Util.toPerson(line)));
		}

		return personListe;
	}

	private void readProperties() {

		try {
			Properties props = new Properties();
			InputStream is = PersisterImpl.class
					.getResourceAsStream("persister.properties");

			if (is != null) {
				props.load(is);
				fileName = props.getProperty("file_name");
			}
		} catch (IOException e) {
			System.out.println("Properties konnten nicht geladen werden:\n");
			e.printStackTrace();
		}

	}
}
