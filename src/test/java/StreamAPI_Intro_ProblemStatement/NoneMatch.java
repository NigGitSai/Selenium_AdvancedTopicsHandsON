package StreamAPI_Intro_ProblemStatement;

import java.util.Arrays;
import java.util.List;

public class NoneMatch {

	public static void main(String[] args) {
		
		List<String> activity = Arrays.asList("Run","sit","sit","Run");
		
		boolean flag = activity.stream().noneMatch(string->string.equals("Stand"));
		System.out.println("check if there is no Stand activity "+flag);
		
		
		 flag = activity.stream().noneMatch(string->string.equals("Run"));

		System.out.println("check if there is no Run activity "+flag);
		
		
	}

}
