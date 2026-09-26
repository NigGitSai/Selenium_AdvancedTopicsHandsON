package InterviewPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumCharReplacement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> inputList = Arrays.asList("ab","aaa","aab","abb","abab","abaaaba");
		
		List<Integer> opList = new ArrayList<>();
		for(String ip : inputList) {
			int count =0;
			int index = 1;
			while(index<ip.length()) {
				if(ip.charAt(index) == ip.charAt(index-1)) {
					count = count+1;
					index= index+2;
				}
				else {
					index = index+1;
				}
			}
			opList.add(count);
			
		}
		
		System.out.println(opList);

	}

}
