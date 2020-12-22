package a_2;

import java.util.Arrays;

public class Paket {
	int breite, hoehe, laenge;
	int gewicht;
	boolean klein;
	boolean leicht;
	boolean mini;
	
	Paket(int a, int b, int c, int g) {
		int[]masse = {a,b,c};
		
		for(int j=0;j<masse.length;j++) {
			for(int i=1;i<masse.length;i++) {
				if(masse[i] > masse[i-1]) {
					int x = masse[i];
					masse[i] = masse[i-1];
					masse[i-1] = x;
				}
			}
		}
		System.out.println(Arrays.toString(masse));
		
		breite = masse[0];
		hoehe = masse[1];
		laenge = masse[2];
		gewicht = g;
	}
	
	void print() {
		System.out.println(breite + "x" + hoehe + "x" + laenge + "mm, Gewicht: " + gewicht + "g, klein=" + klein + ", mini=" + mini);
	}
 
	boolean ist_klein() {
		if(breite<=600 && hoehe<=300 && laenge<=150) {
			return true;
		} else {
			return false;
		}
	}
	boolean ist_leicht() {
		if(gewicht <= 2000) {
			return true;
		} else {
			return false;
		}
	}
	
	boolean ist_mini() {
		return ist_leicht() && ist_klein();
	}
}
