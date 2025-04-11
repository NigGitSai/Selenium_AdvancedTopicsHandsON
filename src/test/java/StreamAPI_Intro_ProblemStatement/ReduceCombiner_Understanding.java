package StreamAPI_Intro_ProblemStatement;

import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;

public class ReduceCombiner_Understanding {
	
	@Test
	public void combinerEx()
	{
		Person person1 = new Person("john",29);
		
		Person person2 = new Person("Daria",31);
		
		List<Person> lstPerson = Arrays.asList(person1,person2);
		
		int ageTotal = lstPerson.stream().reduce(0,(total,person)->total+person.getAge(),Integer::sum);
	
		System.out.println("Total age "+ageTotal);
	}

}
