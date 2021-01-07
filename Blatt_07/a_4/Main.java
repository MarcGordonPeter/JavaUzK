package a_4;

public class Main {
	
	public static void main(String[]args) {
		for(int i=0;i<20;i++) {
			System.out.println(fibonacciIterativ(i));
		}
	}
	
	static int fibonacciIterativ(int n) {
		if(n==0 || n==1) {
			return 1;
		} else {
			n++;
			int a1=1 ,an= 1;
			int a2;
			while(n>2) {
				a2 = a1;
				a1 = an;
				an =  a2 + a1;
				n--;
			}
			return an;
		}
	}
}
