package StreamAPI_Intro_ProblemStatement;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConvertEmployeeClassToMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> empList = Arrays.asList(new Employee("John",50000),new Employee("David",70000));

		
		
		Map<String,Double> empMap = empList.stream().collect(Collectors.toMap(Employee::getName,Employee::getSalary,(oldValue,newValue)->newValue));
		
		System.out.println(empMap);
	}

}
