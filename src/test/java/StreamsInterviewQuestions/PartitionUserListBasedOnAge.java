package StreamsInterviewQuestions;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionUserListBasedOnAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		record User(String name, String role,int age) {}

        List<User> users = List.of(
            new User("Alice", "Admin",18),
            new User("Bob", "Tester",33),
            new User("Charlie", "Tester",45),
            new User("David", "Developer",50),
            new User("Eve", "Admin",18)
        );
        
       Map<Boolean,List<User>> userMapBasedOnAge =  users.stream().collect(Collectors.partitioningBy(mem->mem.age()>18));
       System.out.println(userMapBasedOnAge);
	}
	
	

}
