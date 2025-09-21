package RecordDTO;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class RecordDTOWStreamsExample {
	public static void main(String[] args) {
		record User(String name, String role) {}

        List<User> users = List.of(
            new User("Alice", "Admin"),
            new User("Bob", "Tester"),
            new User("Charlie", "Tester"),
            new User("David", "Developer"),
            new User("Eve", "Admin")
        );

        Map<String, List<User>> groupedByRole =
                users.stream()
                     .collect(Collectors.groupingBy(User::role));
        
        groupedByRole.entrySet().stream().forEach(entry->System.out.println("Key "+entry.getKey()+" "+"value "+entry.getValue()));
        
        

}
}

