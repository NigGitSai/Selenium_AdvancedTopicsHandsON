package StringPrograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindFirstNonRepeatingChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String givenText = "icecream";
		//String givenText = "noon";
		Set<Character> repeatedChar = new HashSet<Character>();
		List<Character> nonRepeatedChar = new ArrayList<Character>();
		for(int i=0; i<givenText.length();i++)
		{
		char ch = givenText.charAt(i);
		
		if(repeatedChar.contains(ch))
		{
			continue;
		}
		if(nonRepeatedChar.contains(ch))
		{
			nonRepeatedChar.remove((Character)ch);
			repeatedChar.add(ch);
		}
		else
		{
			nonRepeatedChar.add(ch);
		}
		
		
		
}
			
	
	if(!(nonRepeatedChar.isEmpty()))
	{
		System.out.println("The Fist non repeated charachter is : "+nonRepeatedChar.get(0));
	}
	else
	{
		System.out.println("There is no non repeated character");
	}
	}

}
