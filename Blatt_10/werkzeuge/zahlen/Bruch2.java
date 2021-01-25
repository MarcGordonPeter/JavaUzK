package werkzeuge.zahlen;

public class Bruch2 extends Bruch {
	
	public Bruch2() {
		super();
	}
	
	public Bruch2(int z, int n) {
		super(z,n);
	}
	
	public void print() {
		System.out.println(zaehler + " / " + nenner);
	}
	
	public boolean kleiner_als(int f) {
		double b = (double)zaehler/(double)nenner; //zaehler/nenner = int
		if (b < (double)f) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean kleiner_als(Bruch f) {
		if(((double)zaehler/(double)nenner) < ((double)f.zaehler/(double)f.nenner)) {
			return true;
		} else {
			return false;
		}
	}
}
