package StringPrograms;

public class ReplaceVowelsWithX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String given = "Name";
		
		String vowels = "aeiouAEIOU";
		StringBuilder sb = new StringBuilder();
		
		for(char ch:given.toCharArray()) {
			
			if(vowels.indexOf(ch)==-1) {
				sb.append(ch);
			}
			else {
				sb.append('x');
			}
		}
		System.out.println("Result String :"+sb.toString());
	}

}
