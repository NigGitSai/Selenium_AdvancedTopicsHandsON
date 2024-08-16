package ArraysPrograms;

import org.testng.annotations.Test;

public class FindPair {

	
	@Test
	public void findPairOfElemEqualsSum()
	{
		int[] a = {23,12,5,-2,11,0,43,24};
		
		int sum = 54;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
				
			{
				if(a[i]+a[j]==sum)
				{
					System.out.println("The pair of elements which equals to "+sum+" is "+a[i]+" and "+a[j]);
					break;
				}
			}
		}
	}
}
