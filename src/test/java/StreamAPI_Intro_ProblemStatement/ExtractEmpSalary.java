package StreamAPI_Intro_ProblemStatement;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ExtractEmpSalary {

	public static void main(String[] args) {
		// TODO Auto-geneated method stub


		List<Employee> empList = Arrays.asList(new Employee("John",50000),new Employee("David",70000));

		List<Double> salaryList = 	empList.stream().map(n->n.getSalary()).toList();
		System.out.println(salaryList);
		
		Map<String,Double> empMap = empList.stream().collect(Collectors.toMap(Employee::getName,Employee::getSalary,(oldValue,newValue)->newValue));
		
		System.out.println(empMap);
	}

}
