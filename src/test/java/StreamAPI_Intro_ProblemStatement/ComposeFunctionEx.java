package StreamAPI_Intro_ProblemStatement;

import java.util.function.Function;

public class ComposeFunctionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Function<Integer,Integer> squareNumber = n->n*n;
		Function<Integer,Integer> add10 = n->n+10;
		
		Function<Integer,Integer> result = add10.compose(squareNumber);
		Integer op=result.apply(5);
		System.out.println("Result is:"+op);

	}

}
