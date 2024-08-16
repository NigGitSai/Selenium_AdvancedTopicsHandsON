package ArraysPrograms;

import java.util.Arrays;

import org.testng.annotations.Test;

public class FindTheMissingNumber {

	@Test(enabled=false)
	public void findMissingNumber()
	{
		//approach sort the elements of the given array
		//add all elements in the array and keep in one variable
		//Fetch the first and last element of the given array
		//create another array of length given array +1
		//Run a for loop from the first element till the last element
		//Store the elements in the new Array 
		//add all the elements in second array and    keep in another variable
		// the missing number is the difference
		int[] a = {11,15,12,13,10};
		Arrays.sort(a);
		int sum1=0,sum2=0;
		for(int i=0;i<a.length;i++)
		{
			sum1 = sum1+a[i];
		}
		
		int[] b = new int[a.length+1];
		int startElem = a[0];
		int endElem = a[a.length-1];
		int k=0;
		for(int i=startElem;i<=endElem;i++)
		{
			b[k]=i;
			k=k+1;
		}
		
		for(int j=0;j<b.length;j++)
		{
			
			
			sum2 = sum2+b[j];
		}
		int missingNO = sum2-sum1;
		System.out.println("Missing number is "+missingNO);
	}
	
	
	}
