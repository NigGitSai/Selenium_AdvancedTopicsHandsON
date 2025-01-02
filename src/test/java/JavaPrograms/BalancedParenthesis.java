package JavaPrograms;

import java.util.LinkedHashMap;

public class BalancedParenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String given ="{[[])}";
		if(given.length()%2!=0)
		{
			System.out.println("Cannot verify balanced paranthesis");
		}
		
		else
		{
			System.out.println("The string has balanced paranthesis : "+checkBalancedParenthesis(given));
		}
		
		
	
	}

	public static boolean checkBalancedParenthesis(String text)
	{
		LinkedHashMap<Character,Integer> ascIIMap = new LinkedHashMap<Character,Integer>();
		ascIIMap.put('{', (int)'{');
		ascIIMap.put('}', (int)'}');
		ascIIMap.put('(', (int)'(');
		ascIIMap.put(')', (int)')');
		ascIIMap.put('[', (int)'[');
		ascIIMap.put(']', (int)']');
		
		int count = 0;
		int length = text.length();
		for(int i=0;i<length/2;i++)
		{
			int charToComparedPos = length-(i+1);
			System.out.println("char to compared position is "+charToComparedPos+" i value is "+i);
			
			System.out.println("text.charAt(i) "+text.charAt(i));
			
			System.out.println("text.charAt(charToComparedPos) "+text.charAt(charToComparedPos));
			
			if(ascIIMap.get(text.charAt(i))==40)
					{
						if(ascIIMap.get(text.charAt(i))==ascIIMap.get(text.charAt(charToComparedPos))-1)
						{
							count++;
						}
					}
			else if(ascIIMap.get(text.charAt(i))==ascIIMap.get(text.charAt(charToComparedPos))-2)
			{
				count++;
			}
			
			
		}
		if(count==(text.length())/2)
		{
			return true;
		}
	
		return false;
	}
	
}
