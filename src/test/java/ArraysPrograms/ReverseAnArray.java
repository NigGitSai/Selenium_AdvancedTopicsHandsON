package ArraysPrograms;

import java.util.Arrays;
import java.util.Collections;

import org.testng.annotations.Test;

public class ReverseAnArray {
	
	@Test(enabled = false)
	public void usingTemp()
	{
		int[] a = {23,11,43,12,5,-2,0,24};
		
		int[] b = new int[a.length];
		
		int j = a.length;
		for(int i=0;i<a.length;i++)
		{
			b[j-1]=a[i];
			j=j-1;
		}
		
		System.out.println("Reversed Array");
		for(int k=0;k<b.length;k++)
		{
			System.out.print(b[k]+" ");
		}
	}
	
	@Test(enabled = false)
	public void usingCollectionsReverse()
	{
		int[] a = {23,11,43,12,5,-2,0,24};
		Collections.reverse(Arrays.asList(a));
		
		System.out.println("Reversed Array");
		System.out.println(Arrays.asList(a));
		
		
	}

	
	@Test(enabled = true)
	public void usingStringBuilder()
	{
		int[] a = {23,11,43,12,5,-2,0,24};
		StringBuilder sb = new StringBuilder();
		
		for(int k=a.length;k>0;k--)
		{
			sb.append(a[k-1]).append(" ");
		}
		
		String[] reversedArray = sb.toString().split(" ");
		
		System.out.println(Arrays.toString(reversedArray));
	}
}
