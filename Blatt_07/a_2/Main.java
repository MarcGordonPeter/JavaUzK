package a_2;

public class Main {
	public static void main(String[]args) {
		Produkt[] p = {	new Buch(938145623), 
						new Softcover(924266821), 
						new Hardcover(232812134, 2), 
						new Softcover(283848228),
						new Produkt(),
						new Hardcover(237277173, 4),
						new Buch(492581833),
						new Hardcover(882491984, 5)};
		
		for(int i=0; i < p.length; i++) {
			p[i].info();
		}
		
		System.out.println("Bücher: ");
		for(int i=0; i < p.length; i++) {
			if(p[i] instanceof Buch) {
				p[i].info();
			}
		}
		
		System.out.println("Softcover: ");
		for(int i=0; i < p.length; i++) {
			if(p[i] instanceof Softcover) {
				p[i].info();
			}
		}
		
		System.out.println("Hardcover: ");
		for(int i=0; i < p.length; i++) {
			if(p[i] instanceof Hardcover) {
				p[i].info();
				Hardcover h = (Hardcover) p[i];
				System.out.println("\tEinbanddicke: " + h.einbanddicke + "mm.");
			}
		}
	}
}
