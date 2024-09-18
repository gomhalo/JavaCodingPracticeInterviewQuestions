package CodingPracticeInterviewQuestions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicateIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
List<Integer> list = Arrays.asList(1,3,4,7,9,3,5,1,3);
		
		System.out.println(returnDuplicateElements(list));

	}
	
	
	public static List<Integer> returnDuplicateElements(List<Integer> list){
		
		
		
//		return list.stream().collect(Collectors.groupingBy(e->e,Collectors.counting()))
//		.entrySet().stream()
//		.filter(e->e.getValue()>1)
//		.map(Map.Entry::getKey)
//		.collect(Collectors.toList());
		
		Set<Integer> seen= new HashSet<>();
		
	
		return list.stream()
				.filter(n->!seen.add(n))
				.distinct()
				.collect(Collectors.toList());
		
		
		
	
	}

}
