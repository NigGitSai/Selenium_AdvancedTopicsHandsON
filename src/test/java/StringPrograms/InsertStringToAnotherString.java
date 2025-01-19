package StringPrograms;

public class InsertStringToAnotherString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String originalString  ="GeeksGeeks";
		int index = 4;
		String stringToBeInserted  = "For";
		
		String result = originalString.substring(0, index+1)+stringToBeInserted+originalString.substring(index+1);
		System.out.println("Result string "+result);
	}

}
