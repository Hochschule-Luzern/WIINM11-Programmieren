/** In diesem 6.Beispiel soll soll eine 
  * neue Aufgabe gelöst werden!
  * Aufgabenstellung in Aufgabenstellung.txt
  *
  * Dieses File ist ein Lösungsvorschlag... also nicht zuerst anschauen!
  */
  
package ch.hslu.iwi.inm11.hs2013.mae;

import ch.softwareexperts.utils.*;



public class Intro_mit_Input{

	/**
	 * Lösungsvorschlag für die Aufgabe "Beispiel_06_IO"
	 *   
	 */
	public static void main(String[] args) {
		int alter;
		int geburtsjahr;
		String name;

		Intro_mit_Input.sout1("Guten Tag\nSie sind ein(e) StudentIn der Hochschule Luzern Wirtschaft.\n\nWie ist ihr Name:");
		name = IO_AL.getString();
		
                System.out.print("In welchem Jahr sind Sie geboren: ");
                geburtsjahr = IO_AL.getInt();
		alter = 2013 - geburtsjahr;

		sout("Ok - ich habe verstanden: ");
		sout("Sie heissen " + name + " und sind " + alter + " Jahre alt!");
		System.out.println("Ich wünsche Ihnen von Herzen ein gutes Studium an der HSLU!!! ");
		System.out.println("--------------------Ende des Programms------------------");
		
	}


	public static void sout (String str){
		System.out.println(str);
	}

	// damit vor der Eingabe des Names nicht auf eine neue Zeile umgeschaltet wird...;-)...!
	public static void sout1 (String str){
		System.out.print(str);
	}
	
	
	

	public static void sout (int i){
		System.out.println(i);
	}
}
