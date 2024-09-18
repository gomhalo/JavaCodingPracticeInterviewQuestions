package CodingPracticeInterviewQuestions;


public class LongestUniformSubstring2 {
    public static int[] findLongestUniformSubstring(String inputString) {
        if (inputString == null || inputString.isEmpty()) {
            return new int[]{0, 0}; // Return [0, 0] for an empty input.
        }

        int longestStartIndex = 0;
        int currentStartIndex = 0;
        int longestLength = 1;
        int currentLength = 1;

        for (int i = 1; i < inputString.length(); i++) {
            char currentChar = inputString.charAt(i);
            char previousChar = inputString.charAt(i - 1);

            if (currentChar == previousChar) {
                currentLength++;
            } else {
                if (currentLength > longestLength) {
                    longestLength = currentLength;
                    longestStartIndex = currentStartIndex;
                }
                currentStartIndex = i;
                currentLength = 1;
            }
        }

        if (currentLength > longestLength) {
            longestStartIndex = currentStartIndex;
            longestLength = currentLength;
        }

        return new int[]{longestStartIndex, longestLength};
    }

    public static void main(String[] args) {
        String input = "aaabbbbccccd";
        int[] result = findLongestUniformSubstring(input);
        int startIndex = result[0];
        int length = result[1];
        System.out.println("Start Index: " + startIndex); // Output: Start Index: 7
        System.out.println("Length: " + length);           // Output: Length: 4
    }
}