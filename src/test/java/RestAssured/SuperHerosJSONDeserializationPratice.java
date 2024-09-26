package RestAssured;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

import org.testng.annotations.Test;

import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;
import com.jayway.jsonpath.Option;

public class SuperHerosJSONDeserializationPratice {
	
	
	@Test
	public void superHeroes() throws IOException
	{
		File file = new File("./src/test/resources/SuperHeroesJSON.json");
		
		Configuration configure = Configuration.defaultConfiguration();
		configure.addOptions(Option.ALWAYS_RETURN_LIST);
		DocumentContext context = JsonPath.using(configure).parse(file);
		
		//1)Retrieve the name of the superhero with ID 1.
	    List<String> name = 	context.read("$.superheroes[?(@.id==1)].name");
	 
	     System.out.println("Super hero name :"+name);
	     
	     //Get the list of powers for Spider-Man.
	    List<String> powers = context.read("$.superheroes[?(@.name=='Spider-Man')].powers");
	    
	    System.out.println("Spider Man powers:"+powers);
	    
	    //3) Find the title of the movie directed by Patty Jenkins.
	   List<String> moviesByPattyJenkins = context.read("$.superheroes[*].movies[?(@.director=='Patty Jenkins')].title");
	     System.out.println("Movies by Patty Jenkins :"+moviesByPattyJenkins);
	     
	     //Retrieve the box office revenue for "The Dark Knight".
	    List<Object> boxOffice = context.read("$.superheroes[*].movies[?(@.title=='The Dark Knight')].boxOffice");
	     System.out.println("Box  Offfice Revenue :"+boxOffice);
	     
	     //	5) Get the real name of Batman.
	    List<String> batmanRealName =  context.read("$.superheroes[?(@.name=='Batman')].realName");
	    
	    System.out.println("Batman Real Name :"+batmanRealName);
	    
	    //List all the allies of Wonder Woman.
	    
	   List<String> allies =  context.read("$.superheroes[?(@.name=='Wonder Woman')].allies");
	   System.out.println("allies :"+allies);
	   
	   //	7) Find the release year of "Iron Man 3".

	  List<Object> releaseYear =  context.read("$.superheroes[*].movies[?(@.title=='Iron Man 3')].releaseYear");
		
	  System.out.println("Iron Man 3 release year :"+releaseYear);
	  
	  //Retrieve the universe to which Superman belongs.
	  
	 List<String> universe =  context.read("$.superheroes[?(@.name=='Superman')].universe");
	 
	 System.out.println("Universe :"+universe);
	 
	 //Get the rating for the movie with the highest box office revenue.
	 
	List<Object> boxOfficeRevenues =  context.read("$.superheroes[*].movies[*].boxOffice");
	
	System.out.println("Box Office Revenue :"+boxOfficeRevenues);
	
	
	   Integer maxBoxOfficeRevenue = (Integer)Collections.max(boxOfficeRevenues,null);
	   System.out.println("Maximum box office :"+maxBoxOfficeRevenue);
	   
	   List<String> ratingMaxBO = context.read("$.superheroes[*].movies[?(@.boxOffice=='"+maxBoxOfficeRevenue+"')].rating");

	   System.out.println("Rating of max Box office  is :"+ratingMaxBO);
	}

}
