package a_2;

public class Anfrage {
	
	public int s;
	public int f;
	
	public Anfrage(int s, int f) {
		this.s = s;
		this.f = f;
	}
	
	public boolean ist_kompatibel_mit(Anfrage a) {
		return true;
	}
	
	public static Anfrage[] schedule(Anfrage[]a) {
		return a;
	}

}
