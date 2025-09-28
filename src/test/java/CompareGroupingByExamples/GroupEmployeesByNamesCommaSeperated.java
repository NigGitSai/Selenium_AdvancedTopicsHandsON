package CompareGroupingByExamples;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;

public class GroupEmployeesByNamesCommaSeperated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		record Employee(String name, String department, int age, double salary) {}
		List<Employee> employees = Arrays.asList(
			    new Employee("Alice", "HR", 25, 3000),
			    new Employee("Bob", "IT", 28, 5000),
			    new Employee("Charlie", "HR", 30, 4000),
			    new Employee("David", "Finance", 40, 7000),
			    new Employee("Eve", "IT", 35, 6000),
			    new Employee("Frank", "Finance", 29, 6500),
			    new Employee("Grace", "HR", 26, 3500));
			    
			Map<String,String>   employeeMap = employees.stream().collect(Collectors.groupingBy(Employee::department,Collectors.mapping(Employee::name, Collectors.joining(","))));
			
			System.out.println(employeeMap);
	}

}
