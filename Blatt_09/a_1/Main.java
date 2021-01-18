package a_1;

public class Main {
	static int[] a = {1,2,3,4};
	
	public static void main(String[] args) {
		try {
			for(int i=0;i<a.length +1 ;i++) {
				int z= a[i];
			}
		} catch (IndexOutOfBoundsException e) {
			System.out.println("catch \"IndexOutOfBoundsException\"");
		} catch(Exception e) {
			System.out.println("catch \"Exception\"");
		} finally {
			System.out.println("finally");
		}
	}

}
