package InterviewPrograms.Arrays;

import java.util.Arrays;

public class RightRotateByKplaces {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7};
		
		//{5,6,7,1,2,3,4}
		
		int d=3;
		int n= arr.length-1;
		d=d%n;// TODO Auto-generated method stub
		
		//Reverse the whole array
		reverse(arr,0,n); // {7,6,5,4,3,2,1}
		reverse(arr,0,d-1); // {5,6,7,4,3,2,1}
		reverse(arr,d,n); // {5,6,7,1,2,3,4}
		
		System.out.println("Right rotated array :"+Arrays.toString(arr));
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
