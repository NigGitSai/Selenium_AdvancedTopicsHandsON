package CollectorsGrouping_Streams_Examples;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class UsingRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		record Person(String name,String dept) {}
		List<Person> people = List.of(
			    new Person("Alice","QA"),
			    new Person("Bob","QA"),
			    new Person("Charlie","Dev")
			);
		
		Map<String,List<String>> personMap = people.stream().collect(Collectors.groupingBy(Person::dept,Collectors.mapping(Person::name, Collectors.toList())));
		
		
		System.out.println(personMap);
	}

}
