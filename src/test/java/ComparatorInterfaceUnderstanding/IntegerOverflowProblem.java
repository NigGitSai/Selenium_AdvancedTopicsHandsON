package ComparatorInterfaceUnderstanding;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class IntegerOverflowProblem {

static List<Mobile2> mobileList = null;
	
	public static void display(List<Mobile2> mobileLst)
	{
	System.out.printf("|%-20s|%-20s|%-20s|%-20s|%-20s|%-20s|%n","Brand","Model Name","Mega Pixel","Price","Memory","Color");

	
		for(Mobile2 mobile:mobileLst)
		{
		System.out.printf("|%-20s|%-20s|%-20s|%-20s|%-20s|%-20s|%n",mobile.getBrand(),mobile.getModelName(),mobile.getMegaPixel(),mobile.getPrice(),mobile.getMemory(),mobile.getColor());
		}
	}
	
	
	
	public static void main(String[] args) {
		
				Mobile2 mobile1 = new Mobile2(128, 12.0, Double.MAX_VALUE, "Samsung", ModelName.GALAXY_S21, "Black");
				Mobile2 mobile2 = new Mobile2(256, 12.2, Double.MIN_VALUE, "Apple", ModelName.IPHONE_13, "Silver");
	
				mobileList = Arrays.asList(mobile1,mobile2);
				 display(mobileList);
					lowToHigh();
					   System.out.println("================================================================================================");
					  System.out.println("");
					   System.out.println("After Sorting Low to High");
					   display(mobileList);
				
	}
	
	public static void lowToHigh()
	{
		Collections.sort(mobileList, new SortLowToHighSolvingIntegerOverflow());
	}
	
}
