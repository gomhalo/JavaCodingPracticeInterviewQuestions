package CodingPracticeInterviewQuestions;

import java.util.ArrayList;
import java.util.List;

public class RunLengthEncoding {
    public static List<String> runLengthEncode(String input) {
        List<String> encodedList = new ArrayList<>();
        
        int length = input.length();
        int count = 1;
        
        for (int i = 0; i < length; i++) {
            // Check if the current character is the same as the next character
            if (i < length - 1 && input.charAt(i) == input.charAt(i + 1)) {
                count++;
            } else {
                // When the next character is different, add the character and its count to the list
                encodedList.add(input.charAt(i) + Integer.toString(count));
                count = 1; // Reset the count for the next character
            }
        }
        
        return encodedList;
    }

    public static void main(String[] args) {
        String input = "AAABBBCCCDAA";
        List<String> encodedString = runLengthEncode(input);
        
        for (String entry : encodedString) {
            System.out.print(entry);
        }
    }
}