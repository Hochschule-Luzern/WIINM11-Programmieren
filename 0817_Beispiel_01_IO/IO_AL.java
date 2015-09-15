//package ch.softwareexperts.utils;
import java.lang.*;
import java.io.*;




/**IO_AL heisst: IO_Allgemein_Light und beruht auf der Klasse IO_Allgemein.
 * Sie macht alle Exception-Handlings der Methoden.
 * <b>Vorteil:</B> Damit ist möglich pro Methode noch ein individueller 
 * "Error"-Text zu vergeben!
 * Der Vorteil liegt darin, dass im Hauptprogramm
 * nicht mehr um jeden IO_Allgemein-Methodenaufruf
 * ein try/catch-Block gemacht werden muss.
 * <p>
 * Da die Klassen in IO_Allgemein.java alle 'static' sind
 * kann nicht über Vererbung über die super-Referenz
 * auf Sie zugegriffen werden. Das heisst der Aufruf
 * der Methoden in IO_Allgemein muss explizit über 
 * 'Klassenname.Methode()' geschehen!
 * 
 * Das Exception-Handling könnte noch wesentlich 
 * vereinfacht werden, indem man es direkt in der Methode
 * getString() der Klasse IO_Allgemein.java machen würde.
 * Der Nachteil: Die Exception-Messages wären alle gleich,
 * egal ob beim Einlesen eines Strings oder eines Floats
 * ein Fehler aufgetaucht ist.
 * 
 * 
 * @author  Erwin Mathis
 * @version $Revision: 1.19 $ $Date: 2009/07/03 14:11:57 $
 * @since   JAVA_A Version 2.1
 */
public class IO_AL  {

	/**liest einen String (ohne LF und CR) von der Konsole.
	 * Macht das Exception-Handling lokal. Die Standard-Exception
	 * Message heisst: "Exception on string input!"
	 * Intern wird die IO_Allgemein.getString() - Methode
	 * aufgerufen
	 */
	public static String getString() {
		String local = "error";
		try{
			local = IO_Allgemein.getString();
		}
		catch(IOException e1)
		      
		{
			System.out.println("Exception on string input!" + e1.getMessage());
		}			
		return local;
	}
	/**liest eine Int-Zahl (Ganzzahl) von der Konsole.
	 * Macht das Exception-Handling lokal. Die Standard-Exception
	 * Message heisst: "Exception on string input!"
	 * Intern wird die IO_Allgemein.getInt() - Methode
	 * aufgerufen.
	 */

    public static int getInt() {
		int local = 0;
		try{
			local = IO_Allgemein.getInt();
		}
		catch(IOException e1)		      
		{
			System.out.println("Exception on int input!" + e1.getMessage());
		}	
		catch(NumberFormatException e2)
		{ 
			System.out.println("no valid int-number!" + e2.getMessage());
		}	
		return local;
    }	

	/**liest einen einzelnen Charakter von der Konsole.
	 * Wenn mehr Buchstaben eingegeben werden, wird nur der erste 
	 * Buchstabe zurückgegeben 
	 * Macht das Exception-Handling lokal. Die Standard-Exception
	 * Message heisst: "Exception on string input!"
	 * Intern wird die IO_Allgemein.getChar() - Methode
	 * aufgerufen.
	 */
	public static char getChar()  {
		char local = 0;
		try{
			local = IO_Allgemein.getChar();
		}
		catch(IOException e1)		      
		{
			System.out.println("Exception on char input!" + e1.getMessage());
		}			
		return local;		
	}



	/**liest eine Double-Zahl von der Konsole.
	 * Wenn keine Double-Zahl eingegeben wird, wird abhängig
	 * von der Art des Fehlers ein Fehler ausgegeben, wenn
	 * kein impliziter Cast möglich ist.
	 * Macht das Exception-Handling lokal. Die Standard-Exception
	 * Message heisst: "Exception on string input!"
	 * Intern wird die IO_Allgemein.getDouble() - Methode
	 * aufgerufen.
	 */
	public static double getDouble() {
		double local = 0;
		try{
			local = IO_Allgemein.getDouble();
		}
		catch(IOException e1)		      
		{
			System.out.println("Exception on double input!" + e1.getMessage());
		}
		catch(NumberFormatException e2)
		{ 
			System.out.println("no valid double-number!" + e2.getMessage());
		}					
		return local;		
	}

	/**liest eine Foat-Zahl von der Konsole.
	 * Wenn keine Float-Zahl eingegeben wird, wird abhängig
	 * von der Art des Fehlers ein Fehler ausgegeben, wenn
	 * kein impliziter Cast möglich ist.
	 * Macht das Exception-Handling lokal. Die Standard-Exception
	 * Message heisst: "Exception on string input!"
	 * Intern wird die IO_Allgemein.getFloat() - Methode
	 * aufgerufen
	 */
	public static float getFloat()  {
		float local = 0;
		try{
			local = IO_Allgemein.getFloat();
		}
		catch(IOException e1)		      
		{
			System.out.println("Exception on float input!" + e1.getMessage());
		}
		catch(NumberFormatException e2)
		{ 
			System.out.println("no valid float-number!" + e2.getMessage());
		}					
		return local;		
	}






}