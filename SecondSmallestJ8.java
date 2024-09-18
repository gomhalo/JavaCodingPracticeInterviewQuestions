package CodingPracticeInterviewQuestions;

import java.util.Arrays;


public class SecondSmallestJ8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array= {2,5,7,3,2,6,1,1};
		System.out.println(findSecondSmallest(array));

	}
	
	public static int findSecondSmallest(int[] array){
		
		
		int secondSmallestNumber = Arrays.stream(array).distinct().sorted().skip(1).findFirst().orElseThrow(()->new IllegalArgumentException("Array Doesn't have smallest second element "));
		
		return secondSmallestNumber;
		
		
	}

}
