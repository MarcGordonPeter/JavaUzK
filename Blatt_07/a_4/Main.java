package a_4;

public class Main {
	
	public static void main(String[]args) {
		for(int i=0; i<20; i++) {
			System.out.println(rekursivFibonacci(i));
		}
	}
	
	static int iterativFibonacci(int n) {
		int a1 = 1;
		int a2 = 1;
		
		for(int i=0;i<n;i++) {
			if(i % 2 == 0) {
				a1 = a1 + a2;
			} else {
				a2 = a2 + a1;
			}
		}
		if(n % 2 == 0) {
			return a1;
		} else {
			return a2;
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
	
	static int rekursivFibonacci(int n) {
		return n<2 ? 1 : rekursivFibonacci(n-1)+rekursivFibonacci(n-2); 
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
