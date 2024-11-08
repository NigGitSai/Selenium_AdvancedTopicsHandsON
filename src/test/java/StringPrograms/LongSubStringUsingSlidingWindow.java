package StringPrograms;

import java.util.HashSet;

public class LongSubStringUsingSlidingWindow {
	
	public static void main(String[] args) {
        String input = "abcabcbb";
        System.out.println("The longest substring without repeating characters is: " + findLongestSubstring(input));
    }
	public static String findLongestSubstring(String input) {
        int left = 0, right = 0;
        int maxLength = 0;
        int startIndex = 0;
        HashSet<Character> seenChars = new HashSet<>();

        while (right < input.length()) {
            char currentChar = input.charAt(right);
            
            // If character is already in set, remove from the left side until it's unique
            while (seenChars.contains(currentChar)) {
                seenChars.remove(input.charAt(left));
                left++;
            }

            seenChars.add(currentChar);
            
            // Update maximum length and starting index of the substring
            if (right - left + 1 > maxLength) {
                maxLength = right - left + 1;
                startIndex = left;
            }

            right++;
        }
        
        // Return the longest substring using the calculated start index and length
        return input.substring(startIndex, startIndex + maxLength);
    }

}
