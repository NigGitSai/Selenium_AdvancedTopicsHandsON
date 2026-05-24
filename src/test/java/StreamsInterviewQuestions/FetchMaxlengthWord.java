package StreamsInterviewQuestions;

import java.util.Comparator;
import java.util.stream.Stream;

public class FetchMaxlengthWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Java Programming";
		
		String result = Stream.of(s.split(" "))
		.max(Comparator.comparing(String::length))
		.orElse("");
		
		System.out.println("Max Length word is :"+result);
	}

}
