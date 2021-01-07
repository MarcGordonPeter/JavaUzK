package a_4;

public class Main {
	
	public static void main(String[]args) {
		int n = 10; //max: 46
		
		System.out.println("Iterativ bis " + n + ":");
		for(int i=0;i<=n;i++) {
			System.out.println("a" + i + ": " + fibonacciIterativ(i));
		}
		
		System.out.println("Rekursiv bis " + n + ":");
		for(int i=0;i<=n;i++) {
			System.out.println("a" + i + ": " + fibonacciRekursiv(1,1,i));
		}
	}
	
	static int fibonacciIterativ(int n) {
		if(n==0 || n==1) {
			return 1;
		} else {
			n++;
			int a1 = 1, a2 ,an = 1;
			while(n>2) {
				a2 = a1;
				a1 = an;
				an =  a2 + a1;
				n--;
			}
			return an;
		}
	}
	
	static int fibonacciRekursiv(int a1, int a2, int n) {
		if(n==0 || n==1) {
			return 1;
		} else {
			int an = a1 + a2;
			n--;
			if (n < 2) {
				return an;
			}
			return fibonacciRekursiv(an,a1,n);
		}
	}
}
