package partitioning;

public class MengeS {
	
	public Anfrage a;
	public int label;
	public MengeS next;
	public int index;
	
	public MengeS(int index, Anfrage a, MengeS next, int label) {
		this.index = index;
		this.a = a;
		this.next = next;
		this.label = label;
	}
	
	public String toString() {
		return "" + label + ": \t" + a.s + "\t " + a.f;
	}
}
