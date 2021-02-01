package a_2;

public class Anfrage {
	
	public int s;
	public int f;
	
	public Anfrage(int s, int f) {
		this.s = s;
		this.f = f;
	}
	
	public boolean ist_kompatibel_mit(Anfrage a) {
		if(this.s > a.s) {
			return a.f > this.s ? false : true;
		} else {
			return this.f > a.s ? false : true;
		}
	}
	
	public static Anfrage[] schedule(Anfrage[]a) {
		boolean alleNull = false;
		int b = 0;
		Anfrage[] zwischen = new Anfrage[a.length];
		while(!alleNull) { 
			int fMin = 0;
			while(a[fMin] == null) { 	//Start fMin != 0 finden, keins gefunden -> alle null
				if(fMin == a.length -1) {
					alleNull = true;
					break;
				}
				fMin++;
			}				
			
			for(int i=0; i<a.length;i++) { 	//fMin finden
				if(a[i] != null) {
					if(a[fMin].f > a[i].f) {
						fMin = i;
					}
				}				
			}
								
			zwischen[b] = a[fMin]; //fMin in zwischenArray speichern
			Anfrage c = a[fMin];
				
			for(int j=0; j<a.length;j++) { //Alle nicht kompatiblen Elemente entfernen					
				if(a[j] != null) {
					if(!c.ist_kompatibel_mit(a[j])) {
						a[j] = null;
					}
				}				
			}
			b++;			
		}
		
		int count = 0;
		
		for(int i = 0; i<zwischen.length;i++) { //Anzahl an nicht-Null Elementen ermitteln
			if (zwischen[i] != null) {
				count++;
			}
		}

		Anfrage[] S = new Anfrage[count]; // Finales Array auf die Anzahl nicht-null Elemente initialisieren
		int d=0;
		
		for(int i = 0; i<zwischen.length;i++) { // Nicht-null Elemente zum finalen Array einfügen
			if (zwischen[i] != null) {
				S[d] = zwischen[i];
				d++;
			}
		}
		return S;
	}

}
