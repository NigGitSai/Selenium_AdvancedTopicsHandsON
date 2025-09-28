package CompareGroupingByExamples;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupBooksByGeneresCollectTitles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		record Book(String title, String genre, String author, int year) {}

		List<Book> books = Arrays.asList(
				new Book("The Hobbit", "Fantasy", "J.R.R. Tolkien", 1937),
				new Book("Harry Potter and the Sorcerer's Stone", "Fantasy", "J.K. Rowling", 1997),
				new Book("A Game of Thrones", "Fantasy", "George R.R. Martin", 1996),
				new Book("The Da Vinci Code", "Thriller", "Dan Brown", 2003),
				new Book("Angels and Demons", "Thriller", "Dan Brown", 2000),
				new Book("To Kill a Mockingbird", "Classic", "Harper Lee", 1960),
				new Book("Pride and Prejudice", "Classic", "Jane Austen", 1813),
				new Book("1984", "Dystopian", "George Orwell", 1949),
				new Book("Brave New World", "Dystopian", "Aldous Huxley", 1932)
				);
		Map<String,List<String>> booksByGenereMap =	books.stream().collect(Collectors.groupingBy(Book::genre,Collectors.mapping(Book::title, Collectors.toList())));
		
		System.out.println(booksByGenereMap);
	}

}
