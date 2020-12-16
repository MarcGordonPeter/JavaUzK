package a_1;

public class Bruch {
	int zaehler;
	int nenner;
	
	Bruch() {
		zaehler = 0;
		nenner = 1;
	}
	
	Bruch(int z, int n) {
		zaehler = z;
		nenner= n;
		standardisiere();
	}
	
	void print() {
		System.out.println(zaehler + "/" + nenner);
	}
	
	boolean gueltig() {
		if (nenner == 0) {
			return false;
		} else {
			return true;
		}
	}

	void standardisiere() {
		if (zaehler < 0 && nenner < 0) {
			zaehler = -zaehler;
			nenner = -nenner;
		} else if (nenner < 0) {
			nenner = -nenner;
		}
	}
	
	void multipliziere(int f) {
		zaehler *= f;
	}
	
	void multipliziere(Bruch f) {
		zaehler *= f.zaehler;
		nenner *= f.nenner;
	}
	
	boolean groesser_als(int f) {
		double b = (double)zaehler/(double)nenner; //zaehler/nenner = int
		if (b > (double)f) {
			return true;
		} else {
			return false;
		}
	}
	
	boolean groesser_als(Bruch f) {
		if(((double)zaehler/(double)nenner) > ((double)f.zaehler/(double)f.nenner)) {
			return true;
		} else {
			return false;
		}
	}
}
