package Aufgabe1;

public class TestLinkedListEinElement {

	public static void main(String[] args) {
		System.out.println("Start von TestLinkedListEinElement");

		
		LinkedList ll = new LinkedList();
		ll.insertFirst("nur ein Element");
		
		ll.showList();

		ll.removeFirst();
		ll.insertFirst("noch ein Element");
		ll.removeLast();                       // Wau... da hat remvoeLast noch einen Fehler!!!!
											   // korrigieren Sie ihn (Debugger zum Fehlersuchen einsetzen!)	
		ll.reverseList();
		
		ll.showList();
		
		System.out.println("Ende von TestLinkedListEinElement");
	}

}
