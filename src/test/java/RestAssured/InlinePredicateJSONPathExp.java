package RestAssured;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.testng.annotations.Test;

import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;

public class InlinePredicateJSONPathExp {
	
	
	@Test
	public void usingInlinePredicateAndLogicalOp() throws IOException
	{
		File file = new File("./src/test/resources/BookStore.json");
		
		DocumentContext context = JsonPath.parse(file);
		
		//Find all books that are in the "fiction" category and have a rating greater than 4.8.
		List<Object> bookTitle = context.read("$.store.book[?(@.category=='fiction' && @.rating > 4.8)].title");
		
		System.out.println("Find all books that are in the \"fiction\" category and have a rating greater than 4.8 :"+bookTitle);
		
		//Find the titles of books priced less than $10 and with a rating higher than 4.7.
		
		bookTitle = context.read("$.store.book[?(@.price<10 && @.rating>4.7)].title");
		
		System.out.println("Find the titles of books priced less than $10 and with a rating higher than 4.7"+bookTitle);
		
		
		//Find the titles and prices of books that are either in the "non-fiction" category or have a rating of 4.9.
	
		List<Object> bookTitleNPrice = context.read("$.store.book[?(@.category=='non-fiction' || @.rating==4.9)].['title', 'price']");
		
		
		System.out.println("Find the titles and prices of books that are either in the \"non-fiction\" category or have a rating of 4.9 ."+bookTitleNPrice);
	
		List<Object> price = context.read("$.store.book[?(@.category=='non-fiction' || @.rating==4.9)].price");
	
		System.out.println("Price :"+price);
		
		//Get the authors of non-fiction books that have a price greater than $11 and a rating equal to or higher than 4.6.
		
		List<Object> author = context.read("$.store.book[?(@.category=='non-fiction' && @.price>11 && @.rating>=4.6)].author");
	
		System.out.println("Authors :"+author);
	}

}
