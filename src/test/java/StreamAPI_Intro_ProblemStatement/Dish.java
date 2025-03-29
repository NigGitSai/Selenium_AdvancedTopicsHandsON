package StreamAPI_Intro_ProblemStatement;

public class Dish {
	
	private String dishName;
	
	private int price;
	
	private boolean isVegetarian;
	
	private String type;
	
	public Dish(String dishName,int price, boolean isVegetarian,String type)
	{
		this.dishName = dishName;
		this.price = price;
		
		this.isVegetarian = isVegetarian;
		
		this.type = type;
		
	}

	public String getDishName() {
		return dishName;
	}

	public int getPrice() {
		return price;
	}

	public boolean isVegetarian() {
		return isVegetarian;
	}

	public String getType() {
		return type;
	}

	
}
