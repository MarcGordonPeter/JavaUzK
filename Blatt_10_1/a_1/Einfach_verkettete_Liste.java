package a_1;

public class Einfach_verkettete_Liste {
	Knoten kopf;
	
	public Einfach_verkettete_Liste(int w) {
		kopf = new Knoten(w, null);
	}
	
	public Einfach_verkettete_Liste(int[] arr) {
		kopf = new Knoten(arr[arr.length-1], null);
		for(int i=arr.length - 2; i > -1; i--) {
			kopf = new Knoten(arr[i], kopf);
		}
	}

	public void print() {
		for( Knoten k = kopf; k != null; k = k.next) {
			System.out.println(k.wert + " ");
		}
		
		System.out.println("\n");
	}
	
	public Knoten fuege_ein_nach(Knoten k, int w) {
		return (k.next = new Knoten(w, k.next));
	}
}
