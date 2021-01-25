package werkzeuge.math;

public class Fibonacci {
	public static int berechne(int n) {
		return n<2 ? 1 : berechne(n-1)+berechne(n-2); 
	}
}
