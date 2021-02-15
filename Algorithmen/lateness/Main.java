package lateness;

import java.util.Arrays;

public class Main {
	
	public static void main(String[]args) {
		Anfrage[] A_array = {
				new Anfrage(4,9),new Anfrage(3,6),new Anfrage(4,8),new Anfrage(1,3),new Anfrage(4,6)
		};
		indexList A = new indexList(A_array);

		Termin[] t = minimizeLateness(A, 0);
		for(int i=0 ; i< t.length;i++) {
			System.out.println("" + t[i].a.d +" "+ t[i].a.f);
		}
	}
	
	public static Termin[] minimizeLateness(indexList A, int b) {
		Termin[] S_temp = new Termin[A.length];
		int s = b;
		int i = 0;
		while (A.getAt(0) != null) {
			Element minF = A.minF();
			S_temp[i++] = new Termin(minF.a, s);
			A.removeAt(minF.index);
			s += minF.a.d;
		}
		return S_temp;
	}
	                                   
}


