package ComparatorInterfaceUnderstanding;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import ComparableInterfaceUnderstanding.Mobile;




public class Understand_ComparatorInterface {
	
	
	
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
		
				Mobile2 mobile1 = new Mobile2(128, 12.0, 999.99, "Samsung", ModelName.GALAXY_S21, "Black");
				Mobile2 mobile2 = new Mobile2(256, 12.2, 1099.99, "Apple", ModelName.IPHONE_13, "Silver");
				Mobile2 mobile3 = new Mobile2(128, 50.0, 799.99, "Google", ModelName.PIXEL_6, "White");
				Mobile2 mobile4 = new Mobile2(256, 48.0, 729.99, "OnePlus", ModelName.ONEPLUS_9, "Blue");
				Mobile2 mobile5 = new Mobile2(512, 108.0, 899.99, "Xiaomi", ModelName.XIAOMI_MI11, "Green");
	
				Mobile2 mobile6 = new Mobile2(64, 48.0, 599.99, "Nokia", ModelName.NOKIA_XR20, "Red");

	
				mobileList = Arrays.asList(mobile1,mobile2,mobile3,mobile4,mobile5,mobile6);
				
				 display(mobileList);
				/* lowToHigh();
				   System.out.println("================================================================================================");
				  System.out.println("");
				   System.out.println("After Sorting Low to High");
				   display(mobileList);*/
				 
				 highToLow();
				 System.out.println("================================================================================================");

				 System.out.println("After Sorting High to Low");
				  System.out.println("");
				   display(mobileList);
				   
	
	}
	
	
	public static void lowToHigh()
	{
		Collections.sort(mobileList, new SorPricetLowToHigh());
	}
	
	public static void highToLow()
	{
		Collections.sort(mobileList, new SortPriceHighToLow());
	}


}
