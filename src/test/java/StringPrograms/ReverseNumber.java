package StringPrograms;

import org.testng.annotations.Test;

public class ReverseNumber {

	
	@Test
	public void reverseNumberMethod1()
	{
		int a=315;
		System.out.println("The given number is "+a);
		int quotient = 0;
		int reverse = 0;
		while(a>0 )
		{
			reverse = (reverse*10)+a%10;
			a = a/10;
		}
		
		System.out.println("The reverse number is "+reverse);
		
	}
	
	@Test
	public void reverseNumberMethod2()
	{
		int a=315;
		System.out.println("The given number is "+a);
		
		String s = String.valueOf(a);
		StringBuffer sb = new StringBuffer(s);
		s = String.valueOf(sb.reverse());
		int reverse = Integer.parseInt(s);
		System.out.println("The reverse number is "+reverse);
		
	}
}
