package lateness;

import java.util.Arrays;

public class Main {
	
	public static void main(String[]args) {
		Anfrage[] A_array = {
				new Anfrage(3,11),new Anfrage(3,13),new Anfrage(1,14),new Anfrage(1,9),new Anfrage(2,18)
		};
		indexList A = new indexList(A_array);

		Termin[] t = minimizeLateness(A, 8);
		System.out.println("Start:\tFaellig:\tEnde:\tlate:");
		for(int i=0 ; i< t.length;i++) {
			int ende = t[i].s+t[i].a.d;
			int late = (ende < t[i].a.f) ? 0 : ende - t[i].a.f;
			System.out.println("" + t[i].s +"\t "+ t[i].a.f + "\t\t" + ende + "\t" + late );
		}
	}
	
	public static Termin[] minimizeLateness(indexList A, int b) {
		Termin[] S_temp = new Termin[A.length];
		int s = b;
		int i = 0;
		while (A.getAt(0) != null) {
			Element minF = A.minF();
			A.removeAt(minF.index);
			S_temp[i++] = new Termin(minF.a, s);
			s += minF.a.d;
		}
		return S_temp;
	}
	                                   
}


