package a_4;

public class Uhrzeit {
	private int h;
	private int m;
	private int s;
	
	public Uhrzeit(int h, int m, int s) {
		if(h < 24 && h >= 0) {
			this.h = h;
		} else {
			this.h = 0;
		}
		if(m >= 0 && m < 60) {
			this.m = m;
		} else {
			this.m = 0;
		}
		if(s >= 0 && s < 60) {
			this.s = s;
		} else {
			this.s = 0;
		}
	}
	
	public String to_string() {
		return String.format("%02d:%02d:%02d",h,m,s);
	}
	
	public boolean ist_spater_oder_gleich(Uhrzeit z) {
		int ges_sek = getSek(z);
		int ver_sek = getSek(this);
		return ver_sek >= ges_sek;
	}
	
	public boolean ist_frueher_oder_gleich(Uhrzeit z) {
		int ges_sek = getSek(z);
		int ver_sek = getSek(this);
		return ver_sek <= ges_sek;
	}

	public boolean ist_gleich(Uhrzeit z) {
		int ges_sek = getSek(z);
		int ver_sek = getSek(this);
		return ver_sek == ges_sek;
	}
	
	public int abstand_sek(Uhrzeit z) {
		int ges_sek = getSek(z);
		int ver_sek = getSek(this);
		if(ver_sek > ges_sek) {
			return ver_sek - ges_sek;
		} else {
			return ges_sek - ver_sek;
		}
		
	}
	
	public int getSek(Uhrzeit uhr) {
		return uhr.h * 3600 + uhr.m * 60 + uhr.s;
	}
}
