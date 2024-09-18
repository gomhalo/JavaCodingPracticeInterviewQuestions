package CodingPracticeInterviewQuestions;

public class PangramChecker {
    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog";

        boolean isPangram = isPangram(input);

        if (isPangram) {
            System.out.println("The input string is a Pangram.");
        } else {
            System.out.println("The input string is not a Pangram.");
        }
    }

    public static boolean isPangram(String input) {
        // Create an array to store whether each letter of the alphabet is present
        boolean[] alphabetPresent = new boolean[26];

        // Convert the input string to lowercase to handle both upper and lower case letters
        input = input.toLowerCase();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if ('a' <= ch && ch <= 'z') {
                // If the character is a lowercase letter, mark it as present
                alphabetPresent[ch - 'a'] = true;
            }
        }

        // Check if all letters of the alphabet are present
        for (boolean present : alphabetPresent) {
            if (!present) {
                return false; // If any letter is missing, it's not a Pangram
            }
        }

        return true; // All letters are present, it's a Pangram
    }
}