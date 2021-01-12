package a_3;

public class Main {
	
	public static void main(String[]args) {
		int n = 2;
		System.out.println(rekursivFakultaet(n));
		System.out.println(iterativFakultaet(n));
	}
	
	//Möglichkeit1
	static int fakultaetIterativ(int n) {
		int j = 1;

		for(int i=1; i<=n; i++) {
			j *= i;
		}
		
		return j;
	}
	
	static int fakultaetRekursiv(int n) {
		if(n > 1) {
			return fakultaetRekursiv(n-1)*n;
		}
		return 1;
	}
	
	
	//Möglichkeit2
	static int iterativFakultaet(int n) {
		if(n==0) {
			return 1;
		} else {
			int res = 1;
			for(int i=1;i<n+1;i++) {
				res *= i;
			}
			return res;
		}
	}
	
	static int rekursivFakultaet(int n) {
		if (n==1 || n==0){
	        return 1;
	    }
	    return (rekursivFakultaet(n-1)*n);
	}
}
