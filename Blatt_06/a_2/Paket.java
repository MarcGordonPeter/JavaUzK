package a_2;

public class Paket {
	int breite, hoehe, laenge;
	int gewicht;
	boolean klein;
	boolean leicht;
	boolean mini;
	
	Paket(int a, int b, int c, int g) {
		
	}
	
	void print() {
		System.out.println(breite + "x" + hoehe + "x" + laenge + "mm, Gewicht: " + gewicht + "g, klein=" + klein + ", mini=" + mini);
	}
 
	boolean ist_klein() {
		return false;
	}
	boolean ist_leicht() {
		return false;
	}
	boolean ist_mini() {
		return false;
	}
}
