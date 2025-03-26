package ComparableInterfaceUnderstanding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MobileRunner {

	static List<Mobile> mobileList = null;
	
	public static void display(List<Mobile> mobileLst)
	{
	System.out.printf("|%-20s|%-20s|%-20s|%-20s|%-20s|%-20s|%n","Brand","Model Name","Mega Pixel","Price","Memory","Color");

	
		for(Mobile mobile:mobileLst)
		{
		System.out.printf("|%-20s|%-20s|%-20s|%-20s|%-20s|%-20s|%n",mobile.getBrand(),mobile.getModelName(),mobile.getMegaPixel(),mobile.getPrice(),mobile.getMemory(),mobile.getColor());
		}
	}
	
	
	public static void main(String[] args) {
		Mobile mobile1 = new Mobile(128, 12.0, 999.99, "Samsung", ModelName.GALAXY_S21, "Black");
		Mobile mobile2 = new Mobile(256, 12.2, 1099.99, "Apple", ModelName.IPHONE_13, "Silver");
		Mobile mobile3 = new Mobile(128, 50.0, 799.99, "Google", ModelName.PIXEL_6, "White");
		Mobile mobile4 = new Mobile(256, 48.0, 729.99, "OnePlus", ModelName.ONEPLUS_9, "Blue");
		Mobile mobile5 = new Mobile(512, 108.0, 899.99, "Xiaomi", ModelName.XIAOMI_MI11, "Green");
		Mobile mobile6 = new Mobile(64, 48.0, 599.99, "Nokia", ModelName.NOKIA_XR20, "Red");
		Mobile mobile7 = new Mobile(256, 64.0, 949.99, "Sony", ModelName.SONY_XPERIA_1, "Purple");
		Mobile mobile8 = new Mobile(128, 64.0, 1099.99, "Asus", ModelName.ASUS_ROG_PHONE_5, "Black");
		Mobile mobile9 = new Mobile(256, 50.0, 699.99, "Realme", ModelName.REALME_GT, "Yellow");
		Mobile mobile10 = new Mobile(128, 64.0, 799.99, "Motorola", ModelName.MOTOROLA_EDGE, "Blue");
		
		
		mobileList = Arrays.asList(mobile1,mobile2,mobile3,mobile4,mobile5,mobile6,mobile7,mobile8,mobile9,mobile10);
	
	   display(mobileList);
	   Collections.sort(mobileList);
	   System.out.println("================================================================================================");
	  System.out.println("");
	   System.out.println("After Sorting");
	   display(mobileList);
	   
	   Collections.sort(mobileList,Collections.reverseOrder());
	   System.out.println("After Sorting in descending order");
	   display(mobileList);
	   
	}
}
