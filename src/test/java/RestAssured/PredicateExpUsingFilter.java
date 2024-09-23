package RestAssured;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import com.jayway.jsonpath.Criteria;
import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.Filter;
import com.jayway.jsonpath.JsonPath;

import static com.jayway.jsonpath.Criteria.*;

public class PredicateExpUsingFilter {

	@Test
	public void predicateExpUsingFilterCriteria() throws IOException
	{
		File bookStoreJSON = new File("./src/test/resources/BookStore.json");
		
		//What is the category of the book titled "Sapiens"?
		
		Filter bookFilter = Filter.filter(
				
				Criteria
				.where("title")
				.is("Sapiens")
				);
		
		DocumentContext context = JsonPath.parse(bookStoreJSON);
		
		List<String> category = context.read("$.store.book[?].category",bookFilter);
		System.out.println("Category is :"+category);
		
		//Find all books that are in the "fiction" category and have a rating greater than 4.8.
		
		Filter secondCriteria = Filter.filter(
				Criteria
				.where("category")
				.is("fiction")
				.and("rating")
				.gt(4.8)
				);
		
		List<Map<String,Object>> books = context.read("$.store.book[?]",secondCriteria);
		
		System.out.println("Books in fiction category and rating greater than 4.8 :"+books);
		
		//Find the titles and prices of books that are either in the "non-fiction" category or have a rating of 4.9.
		
		Filter withOrQuery = Filter.filter(
				Criteria
				.where("category")
				.is("non-fiction"))
				
				.or(Criteria.where("rating").is(4.9));
		
		books =	context.read("$.store.book[?].['title','price']",withOrQuery);
		
		System.out.println("Books title and price in non-fiction category and having rating of 4.9 :"+books);
		
		//Finding books not in fiction category
		
	  Filter withNotOp = 	Filter.filter(
				Criteria
				.where("category")
				.ne("fiction")
				
				);
		
				
	    books = context.read("$.store.book[?]",withNotOp);
	    
	    System.out.println("Books not in fiction category :"+books);
				
		
	}
}
