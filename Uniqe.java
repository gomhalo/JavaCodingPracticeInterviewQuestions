package CodingPracticeInterviewQuestions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class Uniqe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array= {1, 2, 1, 3, 2, 4, 5, 5, 3};
		
		System.out.print(solution(array));
		System.out.println('\n');
		System.out.print(solution2(array));
		System.out.println("----------Let's use java 8 for Unique elements");

	}
	
	public static int solution(int[] intArray) {
		
		 Map<Integer, Integer> countMap = new HashMap<>();
		 int temp=0;
	        
	        for (int num : intArray) {
	            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
	        }
	        
	        System.out.print("Unique values: ");
	        for (int num : intArray) {
	            if (countMap.get(num) == 1) {
	            	temp=num;
	                return temp;
	            }
	        }
	        
	        return temp;
		
	}
	
	public static List<Integer> solution2(int[] intArray) {
	 List<Integer> uniqueElements = Arrays.stream(intArray)
             .boxed()  // Convert to Integer objects
             .collect(Collectors.toMap(i -> i, i -> 1, Integer::sum))
             .entrySet()
             .stream()
             .filter(entry -> entry.getValue() == 1)
             .map(Map.Entry::getKey)
             .collect(Collectors.toList());

     System.out.println("Unique elements: " + uniqueElements);
	return uniqueElements;
	}

}



