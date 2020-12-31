package a_2;

public class Produkt {
	private static int zaehler = 0;
	private int artnr;
	
	Produkt() {
		artnr = zaehler++;
	}
	
	void info() {
		System.out.println("Artikel mit " + "Artikelnummer " + artnr);
	}	
}
