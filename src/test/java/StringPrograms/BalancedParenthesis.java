package StringPrograms;

import java.util.Stack;

public class BalancedParenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String given= "{[()]}";
		//String given= "()[]{}";
		String given= "(]";

		System.out.println(isBalenced(given));

	}

	private static boolean isBalenced(String given) {

		if(given.isEmpty() || given.isBlank() || given.equals(null) || given.length()==1) {
			System.out.println("Not a valid input");
			return false;
		}
		String openingBrackets = "{[(";

		char[] inputArr = given.toCharArray();

		Stack<Character> stack = new Stack<Character>();

		for(char ch:inputArr) {

			if(ch == '{' || ch == '[' || ch == '(') {
				stack.push(ch);
			}
			else {
				if(stack.isEmpty()) {
					return false;
				}
				else {
					char topChar = stack.pop();

					if((ch==')' && topChar !='(') ||
							(ch ==']' && topChar != '[') ||
							(ch=='{' && topChar != '}')){
						return false;
					}
				}
			}
		}

		return stack.isEmpty();
	}

}
