
//Title:       IO_Allgemein Lösung
//Version:     1.19
//Copyright:   Copyright (c) 2009
//Author:      Erwin Mathis
//Company:     Mathis & Partner AG
//Description: IO_Allgemein- Lösung zum Einbinden in anderen Java-Files

//package utilPack;

import java.lang.*;
import java.io.*;

/**IO_Allgemein zeigt wie man mit einigen "Grundmethoden"
 * die Grundlegenden Datentypen in Java von der Console einlesen
 * kann.
 * Jede Methode wirft selber eine IOException die der Programmierer
 * in seinem Programm, wo die get-Methoden verwendet werden selber 
 * abfangen soll. 
 * Die IOException's könnten auch in den Methoden in dieser Klasse
 * abgefangen werden, dann würde aber immer nur die gleiche 'Standard-
 * Fehlermeldung' im Programm angezeigt, was für einfache IO-Versuche
 * wohl eine Vereinfachung wäre für die meisten Programme aber 
 * nicht zu empfehlen ist.
 * 
 * @author  Erwin Mathis
 * @version $Revision: 1.19 $ $Date: 2009/07/03 14:11:57 $
 * @since   JAVA_A Version 2.1
 */
public class IO_Allgemein { 

	/**liest einen String (ohne LF und CR) von der Konsole */
	public static String getString() throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr, 1);
		String line = br.readLine();
		return line;	
	}

	/**liest einen einzelnen Charakter von der Konsole.
	 * Wenn mehr Buchstaben eingegeben werden, wird nur der erste 
	 * Buchstabe zurückgegeben */
	public static char getChar() throws IOException {
		String line = getString();
		if (line.length() == 0)
			return ' '; //bei "Enter-Taste" ok!
		else
			return line.charAt(0);
	}

	/**liest eine Int-Zahl (Ganzzahl) von der Konsole.
	 * Wenn keine Int-Zahl eingegeben wird, wird abhängig
	 * von der Art des Fehlers ein Fehler ausgegeben.
	 */
	public static int getInt() throws IOException {
		String line = getString();
		return Integer.parseInt(line);
	}

	/**liest eine Double-Zahl von der Konsole.
	 * Wenn keine Double-Zahl eingegeben wird, wird abhängig
	 * von der Art des Fehlers ein Fehler ausgegeben, wenn
	 * kein impliziter Cast möglich ist.
	 */
	public static double getDouble() throws IOException {
		String line = getString();
		Double aDub = Double.valueOf(line);
		return aDub.doubleValue();
	}

	/**liest eine Foat-Zahl von der Konsole.
	 * Wenn keine Float-Zahl eingegeben wird, wird abhängig
	 * von der Art des Fehlers ein Fehler ausgegeben, wenn
	 * kein impliziter Cast möglich ist.
	 */
	public static float getFloat() throws IOException {
		String line = getString();
		Float aFlo = Float.valueOf(line);
		return aFlo.floatValue();
	}

	/**für professionellen Einsatz sollte diese Methode auskommentiert 
	 * werden. Zeigt den Einsatz der in dieser Klasse definierten
	 * statischen Methoden. 
	 */
	public static void main(String[] args) {
		String Eingabe_String;
		char Eingabe_Char;
		int Eingabe_Int;
		double Eingabe_Double;
		float Eingabe_Float;

		try {
			while (true) // Abbruch mit 'quit'!!
				{
				System.out.print("Stringeingabe: ");
				Eingabe_String = getString();
				if (Eingabe_String.equals("quit"))
					break;
				System.out.print("Charaktereingabe: ");
				Eingabe_Char = getChar();
				System.out.print("Int Eingabe: ");
				Eingabe_Int = getInt();
				System.out.print("Double Eingabe: ");
				Eingabe_Double = getDouble();
				System.out.print("Float Eingabe: ");
				Eingabe_Float = getFloat();
			}
		} catch (Exception e) {
			System.out.println("Fehler: " + e.getMessage());
			System.out.println("Exception from " + e.getClass().toString());
		}

		System.out.println("Programm ist fertig!");

	}

}