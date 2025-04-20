package StreamsAPI_FunctionsPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.testng.annotations.Test;

public class FilterFunc_MediumPractice {
	
	@Test
	public void filterEmployeesSalaryGT50000()
	{
		Employee emp1 = new Employee("john", 60000);
		Employee emp2 = new Employee("Metilda", 40000);
		
		Employee emp3 = new Employee("tifony", 90000);
		
		List<Employee> empList =   Arrays.asList(emp1,emp2,emp3);
		
		List<String> empFinalList =   empList.stream().filter(emp ->emp.getSalary()>=50000).map(emp->emp.getName()).collect(Collectors.toList());
		
		System.out.println("Employees having salary greater than 50000 : "+empFinalList);
	}
	
	@Test
	public void filterPalindromWords()
	{
		List<String> words = Arrays.asList("madam", "apple", "noon", "hello");
		
		List<String> palindromeWords =  words.stream().filter(FilterFunc_MediumPractice::isPalindrome).collect(Collectors.toList());
		System.out.println("List of palindrome words :"+palindromeWords);
	}
	
	
	public static boolean isPalindrome(String word)
	{
		
		StringBuilder strBuilder = new StringBuilder(word);
		
		return word.equals(strBuilder.reverse().toString());
	}

	@Test
	public void filterStudentsWhoPassed()
	{
		Students student1 = new Students("Ajay", 60);
		Students student2 = new Students("megna", 90);
		Students student3 = new Students("Hari", 30);
		Students student4 = new Students("tanya", 40);
		
		List<Students> studentList =    Arrays.asList(student1,student2,student3,student4);
		
		List<String> studentWhoPassed =    studentList.stream().filter(student->student.getMarks()>40).map(student->student.getName()).collect(Collectors.toList());
	
		System.out.println("Students who passed are :"+studentWhoPassed);
	}
}
