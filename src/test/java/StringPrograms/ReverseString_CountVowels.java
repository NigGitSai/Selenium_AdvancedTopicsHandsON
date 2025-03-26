package StringPrograms;

public class ReverseString_CountVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.out.println("Reversed string "+reverseString("WaterMelon"));
         
         System.out.println("Return vowels count "+returnVowelsCount("WaterMelon"));
	}

	public static String reverseString(String s)
	{
		StringBuilder builder = new StringBuilder(s);
		
		return builder.reverse().toString();
		
	}
	
	public static int returnVowelsCount(String given)
	{
		String strWOVowels = given.replaceAll("[a,e,i,o,u,A,E,I,O,U]", "");
		int vowelsCount = given.length() - strWOVowels.length();
		
		return vowelsCount;
		
	}
}
