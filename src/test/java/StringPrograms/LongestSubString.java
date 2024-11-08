package StringPrograms;

import java.util.ArrayList;

public class LongestSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	String input = "abcabcbb";
		String input = "bbbb";
		String lonSubString = "";
		ArrayList<String> subStrLst = new ArrayList<String>();

		if(longSubString(input)==null)
		{

			for(int i =0; i< input.length();i++)
			{
				lonSubString = String.valueOf(input.charAt(i));
				innerLoop:
				for(int j =i+1; j < input.length();j++)
				{
					
					if(!(lonSubString.contains(String.valueOf(input.charAt(j)))))
					{
						lonSubString=lonSubString+input.charAt(j);
						System.out.println("i value "+i+"j value"+j);
					}
					else
					{
						break innerLoop;
					}
				}
				subStrLst.add(lonSubString);
			}
			int maxLength =2;
			System.out.println(subStrLst);
			for(String ele : subStrLst)
			{
				if(ele.length()>maxLength)
				{
					lonSubString=ele;
				}
			}
			System.out.println("The longest Substring is "+lonSubString);
		}
		else
		{
			System.out.println("The longest Substring is "+longSubString(input));
		}
	}

	public static String longSubString(String given)
	{
		char[] charArrIp = given.toCharArray();
		int count = 0;
		for(int i=0; i<charArrIp.length;i++)
		{
			if(given.charAt(0)==charArrIp[i])
			{
				count=count+1;
			}
		}
		if(count==given.length())
		{
			return given;
		}
		return null;
	}

}
