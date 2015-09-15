/** Gebrauchsanleitung
 *
 *  Lesern Sie das Programm...
 *  Kompilieren Sie das Programm und erklären Sie die Fehler...
 *  Kommentieren Sie die fehlerhaften Zeilen aus....speichern/wieder compilieren
  */

public class VarialblenInitialTesting {
 
  int instanz_i1;
  static int klassen_i1;
	
  public static void main(String[] args) {
     int lokal_i1=1;
     
     //System.out.println(instanz_i1);    // Ausgabe von nicht initialisierter Instanzvariablen
     System.out.println(klassen_i1);      // Ausgabe von nicht initialisierter Klassenvariable
     System.out.println(lokal_i1);      // Ausgabe von nicht initialisierter lokalen Variablen

     VarialblenInitialTesting obj1 = new VarialblenInitialTesting();  // erstellen eines Objekts
     								      // Referenzvariable: obj1											
    
     System.out.println(obj1.instanz_i1);  // // Ausgabe von nicht initialisierter Attribut eines Objekts
     System.out.println("Ende");
  }
}
