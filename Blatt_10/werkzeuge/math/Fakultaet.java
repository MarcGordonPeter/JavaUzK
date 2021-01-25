package werkzeuge.math;

public class Fakultaet {
	public static int berechne(int n) {
		if (n==1 || n==0){
	        return 1;
	    }
	    return (berechne(n-1)*n);
	}
}
