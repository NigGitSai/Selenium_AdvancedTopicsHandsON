package StreamAPI_Intro_ProblemStatement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.testng.annotations.Test;

public class RemoveDuplicatesFromWords {

	@Test
	public void removeDuplicates()
	{
		List<String> words =  Arrays.asList("Caara","Earar","Applep");
		List<String> wordsWoDuplicatesChar = new ArrayList<String>();
		
		LinkedHashSet<Character> setWord = new LinkedHashSet<Character>();
		
		 for(String word :words)
			 
		 {
			String wordWODuplicates = "";
			 char[] chars = word.toCharArray();
			 for(int i=0;i<chars.length;i++)
			 {
				 setWord.add(chars[i]);
				 
				 
			 }
			 for(Character ch:setWord)
			 {
				 wordWODuplicates=wordWODuplicates+ch;
			 }
			 wordsWoDuplicatesChar.add(wordWODuplicates);
			 setWord.clear();
		 }
		 
		 
		 System.out.println(wordsWoDuplicatesChar);
	}
}
