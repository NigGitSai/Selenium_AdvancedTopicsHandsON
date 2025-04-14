package StreamAPI_Intro_ProblemStatement;

import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;

public class AllMatch {

	@Test
	public void ifItHasVowels()
	{
		List<String> words =  Arrays.asList("Car","Ear","Apple");

		boolean flag = words.stream().allMatch(AllMatch::containsVowels);
		System.out.println("has vowels "+flag);
	}

	@Test
	public void ifGivenWordsArePallindrome()
	{
		List<String> words =  Arrays.asList("madam","radar","Car");

		boolean palindromeTrueFalse =	words.stream().allMatch(AllMatch::isPallindrome);
		System.out.println("Is it pallindrome "+palindromeTrueFalse);

	}

	public static boolean containsVowels(String word)
	{
		return word.toLowerCase().chars().anyMatch(ch->"aeiou".indexOf(ch)!=-1);
	}

	public static boolean isPallindrome(String word)
	{
		StringBuilder builder = new StringBuilder(word);

		return word.equals(builder.reverse().toString());
	}



}
