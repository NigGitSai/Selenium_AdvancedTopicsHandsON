package InterviewPrograms;

import java.util.Arrays;

public class ReverseVowelsInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String given="1Mang$o";
		System.out.println("Vowels reversed :"+reverseVowels(given));
		
	}

	public static String reverseVowels(String given) {
		if(given.isBlank() || given.isEmpty() || given.equals(null)) {
			System.out.println("Invalid input");
			return "";
		}
		int left = 0;
		int right = given.length()-1;
		char[] givenArr = given.toCharArray();
		String vowels = "aeiouAEIOU";
		while(left < right) {
			if(vowels.indexOf(givenArr[left])==-1) {
				left++;
			}
			else if(vowels.indexOf(givenArr[right])==-1) {
				right--;
			}else {
				char tmp = givenArr[left];
				givenArr[left] = givenArr[right];
				givenArr[right]=tmp;
				left++;
				right--;
			}
		}
		return Arrays.toString(givenArr);
	}
}
