package StreamAPI_Intro_ProblemStatement;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReplaceSpaceWUnderscore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = " java stream api ";
		String result = Stream.of(a.trim().split(" ")).map(String::toUpperCase).collect(Collectors.joining("_"));
		
		System.out.println(result);
		
	}

}
