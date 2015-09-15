package Aufgabe1;

public class Node {
	
	private Object info;
	private Node next;
	
	public Node(Object x) {
		info = x;
	}

	public Object getInfo() {
		return info;
	}

	public void setInfo(Object info) {
		this.info = info;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
}