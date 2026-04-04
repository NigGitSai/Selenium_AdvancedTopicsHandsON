package InterviewPrograms;

import org.testng.annotations.Test;

public class ReverseWordsInaString {

	@Test
	public void reverseWordsMethod1() {
		String given = "Selenium is an automation testing tool";
		String[] words = given.trim().split(" ");
		String reversedWord = "";
		for(String s : words) {
			for(int i=s.length()-1;i>=0;i--) {
				reversedWord = reversedWord+s.charAt(i);
			}
			reversedWord = reversedWord+" ";
		}
		System.out.println("Reversed sentence "+reversedWord.strip());
	}
	
	@Test
	public void usingStringBuilder() {
		String given = "Selenium is an automation testing tool";
		String[] words = given.trim().split(" ");
		StringBuilder result = new StringBuilder();
		for(String s : words) {
			StringBuilder temp = new StringBuilder(s);
			result.append(temp.reverse()).append(" ");	
		}
		System.out.println("Reversed sentence using string builder "+result.toString().trim());
	}
}
