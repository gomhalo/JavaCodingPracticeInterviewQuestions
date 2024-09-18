package CodingPracticeInterviewQuestions;


public class LongestUniformSubstring {
    public static void main(String[] args) {
        String input = "aaabbcccccdddeeeeee";
        String longestUniformSubstring = findLongestUniformSubstring(input);
        System.out.println("Longest Uniform Substring: " + longestUniformSubstring);
    }

    public static String findLongestUniformSubstring(String input) {
        if (input == null || input.length() == 0) {
            return ""; // Return an empty string for an empty or null input
        }

        char currentChar = input.charAt(0);
        char maxChar = currentChar;
        int currentLength = 1;
        int maxLength = 1;

        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == currentChar) {
                currentLength++;
            } else {
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                    maxChar = currentChar;
                }
                currentChar = input.charAt(i);
                currentLength = 1;
            }
        }

        if (currentLength > maxLength) {
            maxChar = currentChar;
        }

        // Build the longest uniform substring with maxChar
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < maxLength; i++) {
            result.append(maxChar);
        }
//        result.append(maxChar);

        return result.toString();
    }
}