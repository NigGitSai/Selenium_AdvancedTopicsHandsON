package StreamsInterviewQuestions;

import java.util.stream.IntStream;

public class FindFactorialUsingStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=5;
		Integer factorial =  IntStream.rangeClosed(1, n).reduce(1,(a,b)->a*b);
		System.out.println("Factorial of n range 5 is "+factorial);
	}

}
