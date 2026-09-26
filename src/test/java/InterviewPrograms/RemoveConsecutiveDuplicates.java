package InterviewPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveConsecutiveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> inputList =
				Arrays.asList("aabbcc", "aaa", "abbba", "abab", "aaabbbccc", "abcd");
		List<String> opList  = new ArrayList<>();

		for(String given : inputList) {
			StringBuilder result = new StringBuilder();
			if(given.isBlank() || given.isEmpty())
			{
				result.append("");
			}
			else {
				for(int i=1;i<given.length();i++) {
					if(given.charAt(i)!=given.charAt(i-1)) {
						result.append(given.charAt(i-1));
					}
				}
				result.append(given.charAt(given.length()-1));

				opList.add(result.toString());
			}
		}
		System.out.println(opList);

	}

}
