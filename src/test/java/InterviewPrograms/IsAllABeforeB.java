package InterviewPrograms;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class IsAllABeforeB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String input = "aaabbb";
		String input = "ababab";
		
		System.out.println("result is :"+findIfAllABeforeB(input));
	}
	
	private static boolean findIfAllABeforeB(String input) {
		
		char[] givenArr = input.toLowerCase().toCharArray();
		if(input.isEmpty() || input.isBlank() || input.equals(null)) {
			System.out.println("Invalid string input");
			return false;
		
		}
		
		int bPos = -1;
		for(int i=0;i<givenArr.length;i++) {
			if(givenArr[i]=='b') {
				bPos = i;
				break;
			}
		}
		
		if(bPos ==  -1) {
			System.out.println("There is no letter b in the given input");
			return false;
		}
		for(int j=bPos+1;j<givenArr.length;j++) {
			if(givenArr[j]=='a') {
				return false;
			}
		}
		
		return true;
	}

}
