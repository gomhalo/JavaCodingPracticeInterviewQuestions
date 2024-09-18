
package CodingPracticeInterviewQuestions;

import java.util.HashSet;
import java.util.Set;


// Remove characters from a String
public class RemoveLetters {

    public static void main(String[] args) {
        String input = "Alive is, awesome";
        String remove = "alwsr";
        
        
        String result = removeSpecifiedLetters(input, remove);
        System.out.println("The Final String Output is: " + result);
    }

    public static String removeSpecifiedLetters(String input, String remove) {
        // Convert the 'remove' string to a set of characters for quick lookup
        Set<Character> charsToRemove = new HashSet<>();
        for (char c : remove.toCharArray()) {
            charsToRemove.add(Character.toLowerCase(c));
            charsToRemove.add(Character.toUpperCase(c)); // Adding both cases
        }

        // Use StringBuilder to build the result string
        StringBuilder result = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (!charsToRemove.contains(c)) {
                result.append(c);
            }
        }

        return result.toString();
    }
}