package a_1;

public class Main {
	public static void main(String[]args) {
		int[]a = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		Array b = new Array(a), c;
		
		b.print("b");
		
		c = b.erzeuge_kopie();
		c.print("c");
		
		b.nulle_vielfache_von(3);
		b.print("b (nachEntfernung)");
		c.print("c (nachEntfernung)");
		
		System.out.println("Summe von b: " + b.summe());
		System.out.println("Summe von c: " + c.summe());
	}
}
