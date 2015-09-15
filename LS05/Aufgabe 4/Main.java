public class Main{

// Das Scanner-Objekt erzeugen
private static java.util.Scanner sc = new java.util.Scanner(System.in);
private static int intZahl;
private static double dblZahl;
private static String zeichenkette;

public static void main (String[] args) {
	
	InOut.setZahl();
	InOut.setDouble();
	InOut.setZeichen();
	InOut.getEingaben();
}
	
public static void setZahl () {
	
	// Eingabe einer ganzen Zahl fordern
	System.out.print("Bitte eine ganze Zahl eingeben: ");
	// Die ganze int-Zahl einlesen
	intZahl = sc.nextInt();
}

public static void setDouble () {
	
	// Eingabe einer double-Zahl fordern
	System.out.print("Bitte eine Fliesskommazahl eingeben: ");
	// Die ganze double-Zahl einlesen
	dblZahl = sc.nextDouble();

}
	
public static void setZeichen () {
	
	// Eingabe einer Zeichenkette (String) fordern
	System.out.print("Bitte eine Zeichenkette eingeben: ");
	// Die eingegebene Zeichenkette einlesen
	zeichenkette = sc.next() ;
	
}

public static void getEingaben () {
	
	// Alle eingegebenen Daten ausgeben
	System.out.println("int-Zahl: " + intZahl);
	System.out.println("double-Zahl: " + dblZahl);
	System.out.println("Zeichenkette: " + zeichenkette);
}	
}