package StreamsInterviewQuestions;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SecondLargestWordNormalWay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Java Programming Language";
		
		String[] words = s.split(" ");
		String largest = words[0];
		String secondLargest = "";
		
		for(int i=0;i<words.length;i++) {
			
			if(words[i].length()>largest.length()) {
				secondLargest = largest;
				largest = words[i];
			}
			else if(words[i].length() < largest.length() && words[i].length()>secondLargest.length()) {
				secondLargest = words[i];
			}
		}
		
		System.out.println("Second Largest word :"+secondLargest);
	}

}
