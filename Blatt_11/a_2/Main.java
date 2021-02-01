package a_2;

public class Main {
	
	public static void print(Anfrage[] A, String name) {
		System.out.println(name);
		for(int i=0; i<A.length; i++) {
			System.out.printf("(%2d,%2d)", A[i].s, A[i].f);
			if(i+1 < A.length) {
				System.out.printf(", ");
			}
			
			if((i+1) % 5 == 0) {
				System.out.println("\n");
			}
		}
		System.out.println("\n");
	}
	
	public static void main(String[]args) {
		Anfrage[] A = {
				new Anfrage( 1, 5), new Anfrage( 2, 3), new Anfrage( 3, 4), 
				new Anfrage( 4, 6), new Anfrage( 6, 9), new Anfrage( 8, 10), 
				new Anfrage( 9, 11), new Anfrage(15, 19), new Anfrage(18, 22), 
				new Anfrage(17, 23), new Anfrage(11, 19), new Anfrage(11, 15), 
				new Anfrage(17, 19), new Anfrage( 5, 12), new Anfrage( 7, 15), 
				new Anfrage(20, 22), new Anfrage( 3, 5), new Anfrage(14, 16), 
				new Anfrage(12, 18), new Anfrage(17, 23), new Anfrage( 8, 14), 
				new Anfrage( 4, 9), new Anfrage(16, 18), new Anfrage( 7, 14),
				}, S;
		
				print(A, "Eingegangene Anfragen (A):");
				S = Anfrage.schedule(A);
				print(S, "Angenommene Anfragen (S):");
	}
}
