package Aufgabe5;
import java.util.*;


public class UseHashMap {

	public static void main(String[] args) {

		HashMap<String, String> h = new HashMap<String, String>();

		//Some Aliases 
		String s1 = h.put("john", "john.losinger@sb.de");
		System.out.println("�nderung beim Einf�gen von s1: " + s1);
		String s2 = h.put("ogi", "adolf.ogi@trivadis.com");
		System.out.println("�nderung beim Einf�gen von s2: " + s2);
		String s3 = h.put("pascal", "pascal@mathis.ch");
		System.out.println("�nderung beim Einf�gen von s3: " + s3);
		String s4 = h.put("pascal", "pascu@hotmail.ch");
		System.out.println("�nderung beim Einf�gen von s4: " + s4);
		String s5 = h.put("globalboy", "pascu@hotmail.ch");
		System.out.println("�nderung beim Einf�gen von s5: " + s5);
 		
		//Output
		System.out.println("");
		
		// �ber die Menge aller Entry's (Paare) der HashMap laufen und  
		// Schl�ssel und Wert ausgeben:
		Iterator<Map.Entry<String, String>> it1 = h.entrySet().iterator();
		while (it1.hasNext()) {
			Map.Entry<String,String> entry = (Map.Entry<String,String>) it1.next();
			System.out.println((String) entry.getKey() + "-->" + (String) entry.getValue());
		}
		
		System.out.println("");
		
		// �ber die Menge aller Schl�ssel der HashMap laufen und  
		// Schl�ssel und Wert ausgeben:		
		Iterator<String> it2 = h.keySet().iterator();
		while (it2.hasNext()) {
		  String key = (String)it2.next();
		  System.out.println(
		    key + "  --> " + (String)h.get(key)
		  );
		}

		System.out.println("");
		
		// to do: Iterator erzeugen, welcher �ber ein Value-Set von h l�uft
		//        zu jedem gefunden "Value" sollen mit der statischen Methode 
		//        possibleKeys(....) alle m�glichen Schl�ssel zur�ckgegeben
		//        werden.
		// ab hier: ihr Code
		Iterator<String> it3 = h.values().iterator();
		while(it3.hasNext()){
			String val = it3.next();
			System.out.println(
					val + " --> " + possibleKeys(h,val)
			);
		}
	}
	
	// to do: erstellen einer statischen Methode
	// welche einen String mit den m�glichen Schl�sseln zur�ckgibt
    public static String possibleKeys(HashMap<String, String> h, String val){
      
    	String keys ="";
    	
    	// ab hier: ihr Code
    	Iterator<Map.Entry<String, String>> it = h.entrySet().iterator();
    	while(it.hasNext()){
    		Map.Entry<String, String> e = it.next();
    		if(e.getValue().equals(val)){
    			keys += e.getKey() + " ";
    		}
    	}
    	
	  return keys;  // ...zu �ndern!
	}
}