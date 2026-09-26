package InterviewPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class RemoveConsecutiveDuplicatesUsingStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> inputList =
			    Arrays.asList("aabbcc", "aaa", "abbba", "abab", "aaabbbccc", "abcd");
		List<String> opList  = new ArrayList<>();
		
		for(String given:inputList)
		{
			StringBuilder result = new StringBuilder();
		char[] charArr = given.toCharArray();
		Stack<Character> stack1 = new Stack<Character>();
		
		
		for(int i=0;i<charArr.length;i++) {
			if(stack1.isEmpty()) {
			stack1.push(charArr[i]);
			result.append(charArr[i]);
			}
			else if(stack1.peek()!=charArr[i]) {
				stack1.push(charArr[i]);
				result.append(charArr[i]);
			}
		}
		
		opList.add(result.toString());
		
		
		}
		System.out.println(opList);
//		StringBuilder sb = new StringBuilder();
//		
//		int i=1;
//		while(i<given.length()) {
//			if(given.charAt(i)==given.charAt(i-1)) {
//				sb.append(given.charAt(i));
//				i=i+2;
//			} else {
//				sb.append(given.charAt(i-1));
//				//sb.append(given.charAt(i));
//				i=i+1;
//			}
//		}
//		System.out.println(sb.toString());
	}

}
