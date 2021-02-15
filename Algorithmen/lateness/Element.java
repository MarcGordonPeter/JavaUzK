package lateness;

public class Element {
	
	public int index;
	public Anfrage a;
	public Element next;
	
	public Element(int index, Anfrage a, Element next) {
		this.index = index;
		this.a = a;
		this.next = next;
	}
}
