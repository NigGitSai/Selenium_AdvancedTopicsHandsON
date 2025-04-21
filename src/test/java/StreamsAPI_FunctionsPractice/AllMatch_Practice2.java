package StreamsAPI_FunctionsPractice;

import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;

public class AllMatch_Practice2 {
	
	@Test
	public void checkIfAllEmployeessHaveSalaryAbove30000()
	{
		List<Employee> employees = Arrays.asList(
			    new Employee("John", 40000),
			    new Employee("Alice", 50000),
			    new Employee("Bob", 35000)
			);
		
		boolean blFlag = employees.stream().allMatch(e->e.getSalary()>30000);
		System.out.println("Is all Employees salary greater than 30000 "+blFlag);
	}
	
	@Test
	public void checkIfAllWordsHaveLengthGT5()
	{
		List<String> words = Arrays.asList("streaming", "lambda", "function");
		// Use allMatch to check if all have length > 5
		boolean blFlag = words.stream().allMatch(word->word.length()>5);
		System.out.println("Words length greater than 5 "+blFlag);
	}
	
	@Test
	public void checkIfAllStudentsHavePassed()
	{
		List<Students> students = Arrays.asList(
			    new Students("Sara", 78),
			    new Students("Paul", 85),
			    new Students("David", 90)
			);
		
		boolean blFlag =	students.stream().allMatch(stu->stu.getMarks()>40);
		System.out.println("Have all students passed : "+blFlag);
	}

}
