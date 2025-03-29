package StreamAPI_Intro_ProblemStatement;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter_Understanding {
	

	static List<Dish> menu = null;
	

	public static void display(List<Dish> dishList)
	{
	System.out.printf("|%-20s|%-20s|%-20s|%-20s|%n","Dish Name","Price","Is Vegetarian","type");

	
		for(Dish dish:dishList)
		{
		System.out.printf("|%-20s|%-20s|%-20s|%-20s|%n",dish.getDishName(),dish.getPrice(),dish.isVegetarian(),dish.getType());
		}
	}

	
	public static void main(String[] args) {
		
		

		Dish dish1 = new Dish("Chicken 65", 150,false, "Starter");
		
		Dish dish2 = new Dish("Gobi 65", 120,true, "Starter");
		Dish dish3 = new Dish("Chicken Briyani", 180,false, "Main Course");
		Dish dish4 = new Dish("Chicken Gravy", 170,false, "Main Course");
		Dish dish5 = new Dish("Paneer Butter Masala", 140,true, "Main Course");
		Dish dish6 = new Dish("Paneer fried rice", 130,true, "Main Course");

		menu = Arrays.asList(dish1,dish2,dish3,dish4,dish5,dish6);
		
		System.out.println("Before Sorting");
		display(menu);
		
		filterVegItemsUsingFilter();
		
		usingFilterUsingMethodReference();
		
	}

	public static void filterVegItemsUsingFilter()
	{
		List<Dish> vegItems = menu.stream()
		.filter(dish->dish.isVegetarian())
		.collect(Collectors.toList());
		
		System.out.println("Filtered Veg items");
		
		display(vegItems);
	}
	
	public static void usingFilterUsingMethodReference()
	{
		List<Dish> vegItems = menu.stream()
		.filter(Dish::isVegetarian)
		.collect(Collectors.toList());
		
		
		
		System.out.println("Filtered Veg items using method reference");
		
		vegItems.forEach(dish ->System.out.println(dish.getDishName()));
	}
	
}
