package RestAssured;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.Test;

import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;

public class JaywayJSONPathComplexJSONEvaluation {
	
	@Test
	public void verifyParamINComplexJSON() throws IOException
	{
		File bookStoreJSON = new File("./src/test/resources/BookStore.json");
		
		 DocumentContext context =  JsonPath.parse(bookStoreJSON);

		 //What is the price of the bicycle?
		double price =  context.read("$.store.bicycle.price");
		
		System.out.println("Bicycle price :"+price);
		
		//List all the book titles in the store.
		
		List<String> titles =    context.read("$.store.book[*].title");
		
		System.out.println("Book titles are :");
		
		for(String title:titles)
		{
			System.out.println(title);
		}
		
		//What is the category of the book titled "Sapiens"?
		
		List<String> category = context.read("$.store.book[?(@.title=='Sapiens')].category");
		
		System.out.println("Category of book Sapiens is :"+category);
		
		//Retrieve the author names of all fiction books.
		
		List<String> authors = context.read("$.store.book[?(@.category=='fiction')].author");
		
		System.out.println("Fiction book authors :");
		for(String temp: authors)
		{
			System.out.println(temp);
		}
		
		//Get the maximum price of any book in the store.
		
		ArrayList<Object> maxPrice =context.read("$.store.book[*].price");
		
		 double dbMaxPrice = (double)   Collections.max(maxPrice,null);
		 
		 System.out.println("Max price  is "+dbMaxPrice);
		 
		 //Find all books where the price is greater than 10.
		 
		 titles = context.read("$.store.book[?(@.price>10)].title");
		 System.out.println(titles);
		 
		 //Retrieve the ratings for the book authored by Harper Lee.
		 
		 List<Object> ratingOfHarperLee = context.read("$.store.book[?(@.author=='Harper Lee')].rating");
		 
		 System.out.println("Rating of books by Harper Lee :"+ratingOfHarperLee);
		 
		 //Retrieve the type and wheel size of the bicycle.
		 
		HashMap<String,Object> typeWheelSize =  context.read("$.store.bicycle.specs['type','wheelSize']");
		
		System.out.println("Type and wheel Size :"+typeWheelSize);
	}

}
