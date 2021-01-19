package a_4;

public class Main {
	public static void main(String[] args) {
		Uhrzeit uhr = new Uhrzeit(14,48,22);
		
		System.out.println(uhr.abstand_sek(new Uhrzeit(12,12,12)));
	}
}
