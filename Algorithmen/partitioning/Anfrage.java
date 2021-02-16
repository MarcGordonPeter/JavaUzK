package partitioning;

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
}

