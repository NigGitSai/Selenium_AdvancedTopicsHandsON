package InterviewPrograms.Arrays;

import java.util.Arrays;

public class WaveArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {3, 6, 5, 10, 7, 20};
		
		for(int i=1; i<arr.length;i+=2) {
			
			if(arr[i] > arr[i-1]) {
				int tmp = arr[i];
				arr[i] = arr[i-1];
				arr[i-1]= tmp;
			}
			
			if(i+1 < arr.length && arr[i]>arr[i+1]) {
				int tmp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = tmp;
			}
		}
		System.out.println("Result is "+Arrays.toString(arr));
	}

}
