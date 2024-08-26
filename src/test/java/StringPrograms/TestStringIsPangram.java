package StringPrograms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TestStringIsPangram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String given = "The quick brown fox jumps over the lazy dog";
		given = given.toLowerCase().replaceAll(" ", "");
		
		String[] givenArray = given.split("");
		String[] alphabetsArray = "abcdefghijklmnopqrstuvwxyz".split("");
		
		Set<String> set1 = new HashSet<String>(Arrays.asList(givenArray));
		
		Set<String> set2 = new HashSet<String>(Arrays.asList(alphabetsArray));
		set2.removeAll(set1);
		System.out.println(set2);
		if(set2.isEmpty())
		{
			System.out.println("The given text is a Pangram");
		}
		else
		{
			System.out.println("The given text is not a Pangram");
		}
	}

}
