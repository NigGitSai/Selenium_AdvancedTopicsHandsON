package StreamAPI_Intro_ProblemStatement;

import java.util.List;

public class Packages {

	private String name;
	
	private List<String> items ;
	
	
	public Packages(String name, List<String> items)
	{
		super();
		this.name = name;
		this.items = items;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public List<String> getItems() {
		return items;
	}


	public void setItems(List<String> items) {
		this.items = items;
	}
	
	
	
}
