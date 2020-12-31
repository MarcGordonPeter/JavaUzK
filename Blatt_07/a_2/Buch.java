package a_2;

public class Buch extends Produkt {
	private int isbn;
	
	Buch(int isbn) {
		this.isbn = isbn;
	}
	
	void info() {
		super.info();
		System.out.println("\tBuch mit ISBN " + isbn);
	}
}
