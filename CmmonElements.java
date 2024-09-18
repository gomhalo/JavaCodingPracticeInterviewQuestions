package CodingPracticeInterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CmmonElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array1= {2,3,5,6,9,4,7};
		int[] array2= {1,3,5,7,10,20};	
		
		List<Integer> list=fetchCommonElements(array1,array2);
		
		System.out.println(list);
		
		for(Integer num:list) {
			
			System.out.println(num);
		}
		
	}
	
	public static List<Integer> fetchCommonElements(int[] array1,int[] array2) {
		
		List<Integer> list= Arrays.stream(array1)
				.filter(number->Arrays.stream(array2).anyMatch(arr2Number->arr2Number==number))
				.boxed()
				.collect(Collectors.toList());
		
		return list;
		
	}

}
