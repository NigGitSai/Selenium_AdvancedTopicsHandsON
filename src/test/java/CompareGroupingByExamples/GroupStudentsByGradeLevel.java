package CompareGroupingByExamples;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupStudentsByGradeLevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		record Student(String name, String gradeLevel, int marks) {}

		List<Student> students = Arrays.asList(
			    new Student("Alice", "Grade 10", 85),
			    new Student("Bob", "Grade 11", 92),
			    new Student("Charlie", "Grade 10", 78),
			    new Student("David", "Grade 12", 88),
			    new Student("Eve", "Grade 11", 75),
			    new Student("Frank", "Grade 12", 95),
			    new Student("Grace", "Grade 10", 82)
			);

		 Map<String,List<Integer>> studentGradeLevelMarks = students.stream().collect(Collectors.groupingBy(Student::gradeLevel,Collectors.mapping(Student::marks, Collectors.toList())));
		 
		 System.out.println(" Student Grade Level Marks ");
		 System.out.println(studentGradeLevelMarks);
	}

}
