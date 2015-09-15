package Aufgabe1;

public class TestLinkedListLeer {

	public static void main(String[] args) {
		System.out.println("Start von TestLinkedListLeer");
		
		LinkedList ll = new LinkedList();
		
		ll.showList();

		ll.removeFirst();
		ll.removeLast();
		ll.reverseList();
		
		ll.showList();
		
		System.out.println("Ende von TestLinkedListLeer");
	}

}
