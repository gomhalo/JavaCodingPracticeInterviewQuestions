package CodingPracticeInterviewQuestions;

import java.util.Arrays;

//Shift all zeros to the right

public class ShiftZerTozRight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,0,1,1,1,0,1,0,0,1};
		
		int[] arr1= sort(arr);
		
		Arrays.stream(arr).boxed().forEach(System.out::println);

	}
	
	public static int[] sort(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i]<=arr[j]) {
					int temp= arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;	
		
	}
}
