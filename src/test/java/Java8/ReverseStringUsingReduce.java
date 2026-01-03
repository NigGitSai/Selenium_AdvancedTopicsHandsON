package Java8;

import java.util.stream.Stream;

public class ReverseStringUsingReduce {

	public static void main(String[] args) {
		
		String given="happy work";
		String reversed = Stream.of(given.split(""))
		.reduce("",(a,b)->b+a);
		System.out.println(reversed);
	}
}
