package StreamAPI_Intro_ProblemStatement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import ComparableInterfaceUnderstanding.Mobile;

public class SortUsingJava8Understanding_MainRunner {
	
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
		// TODO Auto-generated method stub
		
		
		Dish dish1 = new Dish("Chicken 65", 150,false, "Starter");
		
		Dish dish2 = new Dish("Gobi 65", 120,true, "Starter");
		Dish dish3 = new Dish("Chicken Briyani", 180,false, "Main Course");
		Dish dish4 = new Dish("Chicken Gravy", 170,false, "Main Course");
		Dish dish5 = new Dish("Paneer Butter Masala", 140,true, "Main Course");
		Dish dish6 = new Dish("Paneer fried rice", 130,true, "Main Course");

		menu = Arrays.asList(dish1,dish2,dish3,dish4,dish5,dish6);
		
		System.out.println("Before Sorting");
		display(menu);
		
		usingJava7Comaparable();
		
		usingJava8StreamsAPI();
	}
	
	public static void usingJava7Comaparable()
	{
		List<Dish> nonVegDishes = new ArrayList<Dish>();
		
		//collecting the non veg dishes
		for(Dish dish:menu)
		{
			if(!dish.isVegetarian()) {
				nonVegDishes.add(dish);
			}
		}
		
		//sorting it from price low to high
		
		Collections.sort(nonVegDishes, new Comparator<Dish>() {

			@Override
			public int compare(Dish o1, Dish o2) {
				// TODO Auto-generated method stub
				return Integer.compare(o1.getPrice(), o2.getPrice());
			}
			
			
		});
		
		System.out.println("After sorting using Java 7");
		
		display(nonVegDishes);
		
		System.out.println("===============================");
		
	}
	
	public static void usingJava8StreamsAPI()
	{
		List<String> usingStreams = menu.stream()
		.filter(dish->dish.isVegetarian()==false)
		.sorted(Comparator.comparing(Dish::getPrice))
		.map(dish->dish.getDishName())
		.collect(Collectors.toList());
		
		System.out.println(usingStreams);
		
	}

}
