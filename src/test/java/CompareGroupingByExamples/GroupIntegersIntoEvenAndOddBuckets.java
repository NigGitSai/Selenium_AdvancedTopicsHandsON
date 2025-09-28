package CompareGroupingByExamples;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupIntegersIntoEvenAndOddBuckets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> numberList = Arrays.asList(1,2,3,4,5,6);
		Map<Object, List<Integer>> evenNumberMap = numberList.stream().collect(
				Collectors.groupingBy(num->num%2==0));
		System.out.println("Even Number Map");

		System.out.println(evenNumberMap);


		Map<Object, List<Integer>> oddNumberMap = numberList.stream().collect(
				Collectors.groupingBy(num->num%2!=0));

		System.out.println("Odd Number Map");
		System.out.println(oddNumberMap);

		Map<String,List<Integer>> evenOddNumberMap = numberList.stream().collect(Collectors.groupingBy(num->num%2==0 ? "Even":"Odd"));
		System.out.println("Even odd number map");
		System.out.println(evenOddNumberMap);

	}

}
