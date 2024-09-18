package CodingPracticeInterviewQuestions;


public class LongestSubsequenceInStringArray {
    public static void main(String[] args) {
        String input = "abppplee";
        String[] stringArray = {"able", "ale", "apple", "bale", "kangaroo"};

        String longestSubsequence = findLongestSubsequence(stringArray, input);
        System.out.println("The longest subsequence in the array is: " + longestSubsequence);
    }

    public static boolean isSubsequence(String word, String str) {
        int i = 0;
        int j = 0;

        while (i < word.length() && j < str.length()) {
            if (word.charAt(i) == str.charAt(j)) {
                i++;
            }
            j++;
        }

        return i == word.length();
    }

    public static String findLongestSubsequence(String[] stringArray, String str) {
        String longestSubsequence = "";
        int maxLength = 0;

        for (String word : stringArray) {
            if (isSubsequence(word, str) && word.length() > maxLength) {
                longestSubsequence = word;
                maxLength = word.length();
            }
        }

        return longestSubsequence;
    }
}