package StringPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

import org.testng.annotations.Test;



public class ArrayContainsTheNumberOrNot {

	@Test
	public void usingArrayIteration()
	{
		// TODO Auto-generated method stub
		int[] given = {1,2,24,3,4,5};
		
		int numberToFind = 3;
		boolean found = false;
		
		for(int num:given)
		{
			if(numberToFind == num)
			{
				found = true;
				break;
			}
		}
		
		if(found== true)
		{
			System.out.println("The number is found in the array");
		}
		else
		{
			System.out.println(" The number is not found in the array");
		}
			
	}
	
	@Test(enabled = true)
	public void usingIntStreams()
	{
		int[] given = {1,2,24,3,4,5};
		int numberToFind = 24;
		
		
		boolean flag = IntStream.of(given).anyMatch(ele->ele==numberToFind);
		
		if(flag== true)
		{
			System.out.println("The number is found in the array");
		}
		else
		{
			System.out.println(" The number is not found in the array");
		}
		
	}
	
	@Test
	public void usingList()
	{
		int[] given = {1,2,24,3,4,5};
		int numberToFind = 51;
		List<Integer> lstArray = new ArrayList<Integer>();
		for(int temp:given)
		{
			lstArray.add(temp);
		}
		if(lstArray.contains(numberToFind))
		{
			System.out.println("The number is found in the array");
		}
		else
		{
			System.out.println(" The number is not found in the array");

		}
	}

}
