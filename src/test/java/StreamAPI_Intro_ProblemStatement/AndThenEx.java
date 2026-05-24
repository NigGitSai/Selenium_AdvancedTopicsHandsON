package StreamAPI_Intro_ProblemStatement;

import java.util.function.Function;

public class AndThenEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Function<Integer,Integer> multiplyBy2 = n->n*3;
		Function<Integer,Integer> add10 = n->n-6;
		
		Function<Integer,Integer> result  = multiplyBy2.andThen(add10);
		System.out.println(result.apply(4));
		
	}

}
