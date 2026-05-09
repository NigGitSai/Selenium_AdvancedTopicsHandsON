package StringPrograms;

import java.util.ArrayList;

public class RotateWordsUsingStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String given = "abcd";
		StringBuilder rotation = new StringBuilder(given);
		ArrayList<String> words = new ArrayList<>();
		
		for(int i=0;i<given.length();i++) {
				char firstChar = rotation.charAt(0);
				
				rotation.deleteCharAt(0);
				
				rotation.append(firstChar);
				
				words.add(rotation.toString());
		}
		System.out.println(words);

	}

}
