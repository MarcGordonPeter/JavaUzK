package a_2;

public class Softcover extends Buch {
	public Softcover(int isbn) {
		super(isbn);
	}
	
	public void info() {
		super.info();
		System.out.println("\tTyp: Softcover");
	}
}
