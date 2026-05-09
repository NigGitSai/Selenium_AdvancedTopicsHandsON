package InterviewPrograms;

import java.util.Arrays;

public class ReverseAnArrayExcludingFirstLastIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] input = {"Sandhya","is","attending","the","interview"};
		
		/***
		 * o/p
		 * [Sandhya, the, attending, is, interview]
		 */
		
		int left = 1;
		int right = input.length-2;
		String tmp;
		while(left< right) {
			 tmp = input[left];
			input[left] = input[right];
			input[right] = tmp;
			left++;
			right--;
		}
		System.out.println(Arrays.toString(input));

	}

}
