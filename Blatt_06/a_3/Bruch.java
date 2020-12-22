package a_3;

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
		if (nenner < 0) {
			zaehler = -zaehler;
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
	
	void kuerze() {
		if (zaehler < nenner) {
			int a = nenner,b = zaehler;
			if(nenner < 0) {
				a = nenner * -1;
			}
			if(zaehler < 0) {
				b = zaehler * -1;
			}
			System.out.println(ggT(a,b));
		} else {
			int a = zaehler,b = nenner;
			if(nenner < 0) {
				b = nenner * -1;
			}
			if(zaehler < 0) {
				a = zaehler * -1;
			}
			System.out.println("Moin " + ggT(a,b));
		}
	}
	
	/*
	static int ggT(int a, int b) {
		int rest = a % b;
		while(rest!=0) {
			a=b;
			b=rest;
			rest = a % b;
		}
		return b;
	}
	*/
	
	static int ggT(int a, int b) {
		int rest = a % b;
		if (rest != 0) {
			ggT(b, rest);
		}
		System.out.println(b);
		return b;
	}
	
}
