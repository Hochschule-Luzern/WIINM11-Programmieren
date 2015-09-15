public class Intro{

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

		Intro.sout("Hallo");
		Intro.sout("Ich studierte an der HSLU WI");

		sout(geburtsjahr);

		alter = 2013 - geburtsjahr;
		sout(alter);
		sout("Ich heisse " + name + " und bin heute: " + alter + " Jahre alt!!");
	}


	public static void sout (String str){
		System.out.println(str);
	}



	public static void sout (int i){
		System.out.println(i);
	}
}
