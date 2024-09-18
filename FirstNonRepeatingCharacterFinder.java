package CodingPracticeInterviewQuestions;

import java.util.HashMap;

public class FirstNonRepeatingCharacterFinder {
    public static char findFirstNonRepeatingCharacter(String s) {
        HashMap<Character, Integer> charCount = new HashMap<>();

        // Count the occurrences of each character in the string
        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // Find the first non-repeating character
        for (char c : s.toCharArray()) {
            if (charCount.get(c) == 1) {
                return Character.toLowerCase(c);
            }
        }

        // If no non-repeating character is found, return 0
        return '0';
    }

    public static void main(String[] args) {
        String input = "abaccddeeff";

        char firstNonRepeating = findFirstNonRepeatingCharacter(input);

        if (firstNonRepeating == '0') {
            System.out.println("All characters are repeating.");
        } else {
            System.out.println("The first non-repeating character is: " + firstNonRepeating);
        }
    }
}