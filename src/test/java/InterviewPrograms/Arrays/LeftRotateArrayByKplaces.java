package InterviewPrograms.Arrays;

import java.util.Arrays;

public class LeftRotateArrayByKplaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6,7};
		
		//{5,6,7,1,2,3,4}
		
		int d=3;
		int n= arr.length-1;
		d=d%n;
		reverse(arr,0,d-1);
		reverse(arr,d,n);
		reverse(arr,0,n);
		System.out.println("Reversed Array :"+Arrays.toString(arr));

	}
	
	private static int[] reverse(int[] arr,int start,int end) {
		
		int left=start;
		int right = end;
		
		while(left<=right) {
			int tmp = arr[left];
			arr[left] = arr[right];
			arr[right] = tmp;
			left++;
			right--;
		}
		return arr;
		
		
	}
	
	

}
