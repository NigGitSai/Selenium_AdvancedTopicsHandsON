package ArraysPrograms;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import org.testng.annotations.Test;

public class LongestSubstring {
	public static void main(String[] args) {
		String s ="pwwkew";
		 Set<Character> set = new HashSet<>();
		    int left = 0;
		    int maxLength = 0;
		    int start = 0;

		    for (int right = 0; right < s.length(); right++) {

		        while (set.contains(s.charAt(right))) {
		            set.remove(s.charAt(left));
		            left++;
		        }

		        set.add(s.charAt(right));

		        if (right - left + 1 > maxLength) {
		            maxLength = right - left + 1;
		            start = left;
		        }
		    }

		 String result = s.substring(start, start + maxLength);
		 System.out.println("Longest substring "+result);
		}
	
	
	

}
