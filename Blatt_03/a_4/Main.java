package a_4;

public class Main {
	
	public static void main(String[]args) {
		
		int[] arr= {5,6,7,10,13,24,233};
		int[] arr2 = {233,24,13,10,7,6,5};
		int sum = 0;
		int[]min = {0, arr2[0]};
		int[]max = {0, arr[0]};
		
		for(int i=0;i<arr.length;i++) {
			sum += arr[i];
			System.out.print(arr[i]);
		}
		
		for(int i=0;i<arr2.length;i++) {
			if(min[1]>arr2[i]) {
				min[0] = i;
				min[1] = arr2[i];
			}
		}
		
		for(int i=0;i<arr.length-1;i++) {
			
			if(arr[i] == arr[i+1]) {
				System.out.println("\nIst nicht paarweise verschieden!");
				break;
			} else if (i == arr.length-2) {
				System.out.println("\nIst paarweise verschieden!");
			}
			
		}
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<0) {
				arr[i] *= -1;
			}
			sum += arr[i];
		}
		
		for(int i=0;i<arr.length;i++) {
			if(max[1]<arr[i]) {
				max[0] = i;
				max[1] = arr[i];
			}
		}
		
		System.out.println("\n" + sum);
		
		System.out.println("Min value: " + min[1] + ", index: " + min[0]);
		
		System.out.println("Max value: " + max[1] + ", index: " + max[0]);
		
	}

}
