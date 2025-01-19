package StringPrograms;

import java.util.LinkedHashMap;

import org.testng.annotations.Test;

public class SwapPairOfChar {
	
	@Test
	public void swapPairOfChar()
	{
		String given = "GeeksForGeeks";
		
		char[] charArr  = given.toCharArray();
		char temp ;
		for(int i=0;i<given.length()-1;i+=2)
		{
			temp= charArr[0];
			charArr[i]=charArr[i+1];
			charArr[i+1]=temp;
		}
		String result="";
		for(Character ch:charArr)
		{
			result =result+ch;
		}
		System.out.println("The result string is "+result);
		
		String a = "Geeks for geeks";
		
		String b = a.substring(0, 10)+"G"+a.substring(11);
		System.out.println("B is "+b);
	}

}
