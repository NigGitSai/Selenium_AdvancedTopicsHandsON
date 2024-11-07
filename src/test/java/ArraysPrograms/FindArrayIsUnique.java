package ArraysPrograms;

import java.util.HashSet;

import org.testng.annotations.Test;

public class FindArrayIsUnique {

	
	@Test
	public void usingForLoop()
	{
		int[] given = {3, 1, 4, 2, 3};
		
		boolean result = checkForDuplicate(given);
		System.out.println("Using For Loop - The array contains duplicate elements :"+result);
	}
	
	@Test
	public void usingHashSet()
	{
		int[] given = {3, 1, 4, 2, 3};
		HashSet<Integer> set1 = new HashSet<Integer>();
		boolean result = false;
		for(int ele : given)
		{
			if (!set1.add(ele)) {
	            result = true;
	            break;
	        }
		}
	System.out.println("Using Hasset : The given array has duplicates "+result);
	}
	
	public static boolean checkForDuplicate(int[] intarr)
	{
		for(int i=0;i<intarr.length;i++)
		{
			for(int j=i+1; j< intarr.length;j++)
			{
				if(intarr[i]==intarr[j])
				{
					return true;
				}
			}
		}
		return false;
	}
}
