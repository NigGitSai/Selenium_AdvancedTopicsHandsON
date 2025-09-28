package CompareGroupingByExamples;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupEmployeesByAge {

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
			    new Employee("Grace", "HR", 26, 3500)
			);

		Map<String,List<Integer>> employeeAgeMap = employees.stream().collect(Collectors.groupingBy(Employee::department,Collectors.mapping(Employee::age, Collectors.toList())));


		System.out.println("Employee grouped by Age");
		System.out.println(employeeAgeMap);
		
	}

}
