package StreamsInterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class DifferentWaysToCreateStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> animalsList = Arrays.asList("Cat","Dog","Elephant");
		//1) From List to Stream
		Stream<String> animalsStream = animalsList.stream();
		
		String[] numbers = {"1","1","24","21","65"};
		//2) From Arrays to Stream
		Stream<String> numStream = Arrays.stream(numbers);
		
		//3) using Stream of
		
		Stream<Integer> streamNum2 = Stream.of(1,2,4,6,9,1);
		
		//using Stream generate
		
		Stream<Double> randomNumStream = Stream.generate(Math::random).limit(5);
		
	}
}
