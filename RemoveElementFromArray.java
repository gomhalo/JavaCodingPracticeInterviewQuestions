package CodingPracticeInterviewQuestions;

import java.util.Arrays;
import java.util.stream.IntStream;

public class RemoveElementFromArray {

	public static void main(String[] args) {
	int[] originalArray = {1,2,3,4,5,6};
	
	int valueToRemove = 3;
//	int[] removedArray = removeNum(originalArray,valueToRemove);
//	
//	Arrays.stream(removedArray).forEach(a->System.out.println(a));
	
	
	int[] newArray = IntStream.of(originalArray)
            .filter(value -> value != valueToRemove)
            .toArray();
	
	Arrays.stream(newArray).forEach(a->System.out.println(a));
	
	}
//	public static int[] removeNum(int[] array,int num) {
//		
//		int[] temp = new int[array.length-1];
//		int index=0;
//		for(int i=0;i<array.length;i++ ) {
//			
//			if(array[i]!=num) {
//				temp[index]=array[i];
//				index++;
//			}
//			
//		}
//			
//			return temp;	
//	}
	
	
}
