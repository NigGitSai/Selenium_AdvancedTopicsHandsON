package InterviewPrograms;

import java.util.Arrays;

public class MoveZerosToEndOptimalSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] given= {1,0,1,0,0,3,12};
		
		int left=0;
		
		for(int right=0;right<given.length;right++) {
			
			if(given[right]!=0) {
				int tmp = given[left];
				given[left] = given[right];
				given[right]=tmp;
				left++;
			}
		}
		
		System.out.println("Result :"+Arrays.toString(given));
		
	}

}
