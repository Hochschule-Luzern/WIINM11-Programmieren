import ch.softwareexperts.utils.*;



public class Intro_mit_Input{

	/**
	 * Dieses 08-15-Intro Programm zeigt
	 * a) die einfache Verwendung von 
	 *    "Daten" (Variablen) vom Typ int und String
	 * b) den Start durch die main(...)-Methode
	 * c) zwei überschriebene Methoden mit den Namen
	 *    sout(int) und sout(String)
	 */
	public static void main(String[] args) {
		int alter;
		int geburtsjahr = 1991;
		String name = "Silvana";

		Intro_mit_Input.sout("Hallo");
		Intro_mit_Input.sout("Ich studierte an der HSLU WI");

		sout(geburtsjahr);

		alter = 2013 - geburtsjahr;
		sout(alter);
		sout("Ich heisse " + name + " und bin heute: " + alter + " Jahre alt!!");
		
		System.out.print("Gib doch deinen Namen ein: ");
		name = IO_AL.getString();
		System.out.println("Ok - ich verstehe: Du heisst " + name);
		
		System.out.println("--------------------Ende des Programms------------------");
		
	}


	public static void sout (String str){
		System.out.println(str);
	}



	public static void sout (int i){
		System.out.println(i);
	}
}
