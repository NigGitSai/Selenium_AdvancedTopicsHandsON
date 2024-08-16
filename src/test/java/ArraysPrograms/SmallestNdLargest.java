package ArraysPrograms;

import java.util.Arrays;

import org.testng.annotations.Test;

public class SmallestNdLargest {

	
	@Test(enabled = false)
	public void usingForLoop()
	{
		int[] a = {23,11,43,12,5,-2,0,24};
		
		System.out.println("Before sorting");
		printElementsInArray(a);
		int temp =0;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("");
		System.out.println("after sorting");
		printElementsInArray(a);
		System.out.println("");
		System.out.println("Smallest element in Array :"+a[0]);
		System.out.println("Largest element in Array :"+a[a.length-1]);
		
	}
	
	@Test
	public void usingInbuiltFunction()
	{
		int[] a = {23,11,43,12,5,-2,0,24};
		
		System.out.println("Before sorting");
		printElementsInArray(a);
		
		Arrays.sort(a);
		
		System.out.println("");
		System.out.println("After Sorting");
		printElementsInArray(a);
		System.out.println("");
		System.out.println("Smallest element in Array :"+a[0]);
		System.out.println("Largest element in Array :"+a[a.length-1]);
	}
	
	public void printElementsInArray(int[] testArray)
	{
		for(int i=0;i<testArray.length;i++)
		{
			System.out.print(testArray[i]+" ");
		}
	}
}
