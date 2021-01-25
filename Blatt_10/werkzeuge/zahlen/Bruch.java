package werkzeuge.zahlen;

public class Bruch {
	int zaehler;
	int nenner;
	
	public Bruch() {
		zaehler = 0;
		nenner = 1;
	}
	
	public Bruch(int z, int n) {
		zaehler = z;
		nenner= n;
		standardisiere();
	}
	
	public void print() {
		System.out.println(zaehler + "/" + nenner);
	}
	
	public boolean gueltig() {
		if (nenner == 0) {
			return false;
		} else {
			return true;
		}
	}

	public void standardisiere() {
		if (nenner < 0) {
			zaehler = -zaehler;
			nenner = -nenner;
		}
	}
	
	public void multipliziere(int f) {
		zaehler *= f;
	}
	
	public void multipliziere(Bruch f) {
		zaehler *= f.zaehler;
		nenner *= f.nenner;
	}
	
	public boolean groesser_als(int f) {
		double b = (double)zaehler/(double)nenner; //zaehler/nenner = int
		if (b > (double)f) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean groesser_als(Bruch f) {
		if(((double)zaehler/(double)nenner) > ((double)f.zaehler/(double)f.nenner)) {
			return true;
		} else {
			return false;
		}
	}
}
