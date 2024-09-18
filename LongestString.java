package CodingPracticeInterviewQuestions;

import java.util.Arrays;

public class LongestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] strings= {"abcdgser","banana","apple","avocado","sandwitches"};
		
		int length=Arrays.stream(strings).mapToInt(String::length).max().orElse(0);
		
		System.out.println("LongestLength is :"+ length);
		
		
		// Finding the longest string in the array
        String longestString = Arrays.stream(strings)
                                     .reduce((a, b) -> a.length() >= b.length() ? a : b)
                                     .orElse(null);

        System.out.println("The longest string in the array is: " + longestString);
	}

}
