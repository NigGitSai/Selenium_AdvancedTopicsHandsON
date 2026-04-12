package InterviewPrograms.Arrays;

import java.util.Arrays;

public class MoveZerosToEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,0,2,3,2,0,0,4,5,1};
		
		int j=-1;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == 0) {
				j=i;
				break;
			}
		}
		
		for(int i=j+1;i<arr.length;i++) {
				if(arr[i] != 0) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
					j++;
				}
		}
		
		System.out.println("Result : "+Arrays.toString(arr));
		
	}

}
