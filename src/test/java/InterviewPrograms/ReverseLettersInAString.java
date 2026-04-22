package InterviewPrograms;

import java.util.Arrays;

public class ReverseLettersInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String given = "1ab2";
		String given = "A1$p2ll#e";
		System.out.println("Reversed Letters string :");
		System.out.println(reverseLetters(given));

	}

	public static String reverseLetters(String input) {
		if(input.isBlank() || input.isEmpty() || input.equals(null)) {
			System.out.println("Invalid string input "+input);
			return null;
		}
		char[] givenCharArr = input.toCharArray();
		int left=0;
		int right = givenCharArr.length-1;
		while(left<right) {
			if(!Character.isLetter(givenCharArr[left])){
				left++;
			}
			else if(!Character.isLetter(givenCharArr[right])) {
				right--;
			}
			else {
				char tmp = givenCharArr[left];
				givenCharArr[left] = givenCharArr[right];
				givenCharArr[right] = tmp;
				left++;
				right--;
			}
		}
		return Arrays.toString(givenCharArr);
	}
}
