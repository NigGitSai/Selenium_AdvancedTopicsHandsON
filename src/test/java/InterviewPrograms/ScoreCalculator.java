package InterviewPrograms;

import java.util.LinkedHashMap;

public class ScoreCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			String erica="HMH";
			String bob = "MMH";
			scoreCal(erica,bob);
	}
	
	public static void scoreCal(String erica,String bob) {
		
		LinkedHashMap<Character,Integer> scoreMap = new LinkedHashMap<>();
		scoreMap.put('E', 1);
		scoreMap.put('M', 3);
		scoreMap.put('H', 5);
		String allowedChar = "EMH";
		if(erica.length()<3 || bob.length()<3) {
			System.out.println("The given input strings for Erica and Bob not having the 3 day values");
			return;
		}
		if(erica.isEmpty() || erica.isBlank() || erica.equals(null) || bob.isBlank() || bob.isEmpty() || bob.equals(null)) {
			System.out.println("Invalid inputs passed for Erica / Bob");
			return;
		}
		int totalForErica = 0, totalForBob = 0;
		for(int i=0;i<3;i++) {
			totalForErica = totalForErica+ scoreMap.get(erica.charAt(i));
			totalForBob = totalForBob+scoreMap.get(bob.charAt(i));
		}
		if(totalForErica > totalForBob) {
			System.out.println("Erica is the Winner");
		}else if(totalForErica < totalForBob) {
			System.out.println("Bob is the Winner");
		}else {
			System.out.println("Tie");
		}
	}

}
