package StringPrograms;

public class ExtractNOFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String testNum ="happy123";
		System.out.println("Only Charachters :"+testNum.replaceAll("[0-9]", ""));
		System.out.println("Only numbers :"+testNum.replaceAll("[^0-9]", ""));
	}

}
