package InterviewPrograms.Arrays;

import java.util.Arrays;

public class RotateArrayToLeftByOnePosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,3,4,5};
		
		int temp = arr[0];
		int n = arr.length-1;
		
		for(int i=1;i<=n;i++) {
			arr[i-1] = arr[i];
		}
		arr[n]= temp;
System.out.println("Arrays rotated to left by one position "+Arrays.toString(arr));
	}
	

}
