package StringPrograms;

public class ConvertToUpperNdLowerCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String upperCaseText ="TULIP GARDEN";
		char[] upperCaseLetters = upperCaseText.toCharArray();
		for(int i=0;i<upperCaseLetters.length;i++)
		{
			if(upperCaseLetters[i]>=65 && upperCaseLetters[i]<=90 )
			{
				upperCaseLetters[i] = (char) (upperCaseLetters[i]+32);
			}
			
		}
		for(int i=0;i<upperCaseLetters.length;i++)
		{
			System.out.print(upperCaseLetters[i]);
		}
		System.out.println("");
		String lowerCaseText = "paneer butter masala";
		char[] lowerCaseLetters =   lowerCaseText.toCharArray();
		
		for(int i=0;i<lowerCaseLetters.length;i++)
		{
			if(lowerCaseLetters[i]>=97 && lowerCaseLetters[i]<=122)
			{
				lowerCaseLetters[i] =(char) (lowerCaseLetters[i]-32);
			}
		}
		for(int i=0;i<lowerCaseLetters.length;i++)
		{
			System.out.print(lowerCaseLetters[i]);
		}
	}

}
