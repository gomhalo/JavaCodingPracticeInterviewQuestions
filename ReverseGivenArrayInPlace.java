package CodingPracticeInterviewQuestions;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ReverseGivenArrayInPlace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array1= {1,2,3,4,5,6};
		
		System.out.println(Arrays.toString(reverse(array1)));

	}
	
	public static int[] reverse(int[] array) {
		
		 IntStream.range(0, array.length/2).forEach(i->
		{
			int temp=array[i];
			array[i]=array[array.length-i-1];
			array[array.length-i-1]=temp;
			
		});
		return array;
		
	}

}
