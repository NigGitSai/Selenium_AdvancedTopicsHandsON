package StreamsInterviewQuestions;

import java.util.stream.Stream;

public class SecondLargestWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Java Programming Language";
		
		String secondLargest = Stream.of(s.split(" "))
		.distinct()
		.sorted((a,b)->Integer.compare(b.length(), a.length()))
		.skip(1)
		.findFirst()
		.orElse("");
		
		System.out.println("Second Largest: "+secondLargest);
	}

}
