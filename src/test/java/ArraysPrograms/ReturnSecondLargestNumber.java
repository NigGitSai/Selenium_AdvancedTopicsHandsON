package ArraysPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;

import org.testng.annotations.Test;

public class ReturnSecondLargestNumber {
	
	@Test
	public void method1()
	{
		int[] given = {5, 1, 9, 2, 8};
		
		int temp=0;
		for(int i=0;i<given.length;i++)
		{
			for(int j=i+1;j<given.length;j++)
			{
				if(given[i]>given[j])
				{
					temp=given[i];
					given[i]=given[j];
					given[j]=temp;
				}
			}
		}
		System.out.println("After Sorting");
		for(int n=0;n<given.length;n++)
		{
			System.out.print(given[n]+" ");
		}
		System.out.println("");
		System.out.println("Second smallest element in the given array is "+given[1]);
	}
	
	@Test
	public void method2()
	{
		int[] given = {5, 1, 9, 2, 8};
		
		Arrays.sort(given);
		System.out.println("From Method 2 : Second smallest element in the given array is  "+given[1]);
	}
	
	@Test
	public void method3()
	{
		int[] given = {5, 1, 9, 2, 8};
		
		ArrayList<Integer> newArr = new ArrayList<Integer>();
		for(int n=0;n<given.length;n++)
		{
			newArr.add(given[n]);
		}
		 Collections.sort(newArr);
		 System.out.println("From Method 3 : Second smallest element in the given array is  "+newArr.get(1));
	}

	
}
