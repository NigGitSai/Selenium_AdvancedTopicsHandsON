package StringPrograms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindMissingAlphabets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String given = "cake";
		given = given.toLowerCase();
		
		String[] givenArray = given.split("");
		String[] alphabetsArray = "abcdefghijklmnopqrstuvwxyz".split("");
		
		Set<String> set1 = new HashSet<String>(Arrays.asList(givenArray));
		
		Set<String> set2 = new HashSet<String>(Arrays.asList(alphabetsArray));
		set2.removeAll(set1);
		System.out.println(set2);
		if(set2.isEmpty())
		{
			System.out.println("The given is a Pangram");
		}
	}

}
