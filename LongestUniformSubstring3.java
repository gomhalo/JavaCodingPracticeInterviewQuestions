package CodingPracticeInterviewQuestions;

import java.util.HashMap;
import java.util.Map;

public class LongestUniformSubstring3 {
    public static int[] findLongestUniformSubstring(String inputString) {
        if (inputString == null || inputString.isEmpty()) {
            return new int[]{0, 0}; // Return [0, 0] for an empty input.
        }

       int count = 1;
       int longestStartIndex = 0;
       int longestLength = 0;
      int templongestStartIndex =0;
      int tempLongestLength=0;
       
       int j=0;
       
    	   while(j<inputString.length()-1) {
    		   
    		   count = 1;
    		   
    	   if(inputString.charAt(j)==inputString.charAt(j+1)) {
    		   count++;
    		   tempLongestLength = count;
    	   
    	   }
    	   
    	   else 
    		   
    		   templongestStartIndex = count+1-j;
    	   
    	   if(tempLongestLength>longestLength){
    		   longestStartIndex=templongestStartIndex;
    		   longestLength=tempLongestLength;
    	   }
    	  
    	   j++;
    	 
    	   }
        return new int[]{longestStartIndex, longestLength};
    }

    public static void main(String[] args) {
        String input = "aaabbbbcccccccd";
        int[] result = findLongestUniformSubstring(input);
        int startIndex = result[0];
        int length = result[1];
        System.out.println("Start Index: " + startIndex); // Output: Start Index: 7
        System.out.println("Length: " + length);           // Output: Length: 4
    }
}