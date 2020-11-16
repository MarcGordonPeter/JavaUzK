package a_5;
import java.util.Random;

public class Main {

	public static void main(String[]args) {
		int var1 = rand();
		int var2 = rand();
		int var3 = rand();
		
		int[]array = new int[3];
		
		array[0] = var1;
		array[1] = var2;
		array[2] = var3;
		
		int min = var1,max = var1;
		
		for(int i=0;i<array.length;i++) {
			if(min > array[i]) {
				min = array[i];
			}
			if(max < array[i]) {
				max = array[i];
			}
		}
		System.out.println(min);
		System.out.println(max);
	}
	
	public static int rand() {
		Random r = new Random();
		return r.nextInt();
	}
}
