package a_2;

public class Hardcover extends Buch {
	public final double einbanddicke;
	
	public Hardcover(int isbn, double einbanddicke) {
		super(isbn);
		this.einbanddicke = einbanddicke;
	}
	
	public void info() {
		super.info();
		System.out.println("\tTyp: Hardcover");
	}
	
	public void test() {}
}
