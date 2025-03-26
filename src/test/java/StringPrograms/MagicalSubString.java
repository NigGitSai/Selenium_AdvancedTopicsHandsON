package StringPrograms;

public class MagicalSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	public static boolean checkMagicalSubstring(String inputStr)
	{
		
		char firstLetter = inputStr.charAt(0);
	
		
		
		if((inputStr.contains("a") || inputStr.contains("e") || inputStr.contains("i") || inputStr.contains("o")
				|| inputStr.contains("u")) && (String.valueOf(inputStr.charAt(0)).equalsIgnoreCase(String.valueOf(inputStr.charAt(inputStr.length()-1)))))
				
		{
			return true;
		}
		return false;
		
	}
}
