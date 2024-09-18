package CodingPracticeInterviewQuestions;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class SecondMostRepeatedWord {
    public static String findSecondMostRepeatedWord(String paragraph, String[] exclusionList) {
        // Split the paragraph into words and store them in an array
        String[] words = paragraph.split("\\s+");

        // Create a HashMap to store word frequencies
        Map<String, Integer> wordFrequency = new HashMap<>();

        // Populate the word frequency map
        for (String word : words) {
            // Convert to lowercase and remove punctuation
            word = word.replaceAll("[^a-zA-Z]", "").toLowerCase();

            // Skip excluded words
            if (isExcluded(word, exclusionList)) {
                continue;
            }

            wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
        }

        // Find the second most repeated word
        String mostRepeatedWord = "";
        int mostFrequency = 0;
        String secondMostRepeatedWord = "";
        int secondMostFrequency = 0;

        for (Entry<String, Integer> entry : wordFrequency.entrySet()) {
            int frequency = entry.getValue();
            if (frequency > mostFrequency) {
                secondMostFrequency = mostFrequency;
                secondMostRepeatedWord = mostRepeatedWord;

                mostFrequency = frequency;
                mostRepeatedWord = entry.getKey();
            } else if (frequency > secondMostFrequency) {
                secondMostFrequency = frequency;
                secondMostRepeatedWord = entry.getKey();
            }
        }

        return secondMostRepeatedWord;
    }

    private static boolean isExcluded(String word, String[] exclusionList) {
        for (String excludedWord : exclusionList) {
            if (word.equals(excludedWord)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String paragraph = "This is a sample paragraph. This paragraph contains sample words.";
        String[] exclusionList = {"is", "a", "this"};

        String secondMostRepeated = findSecondMostRepeatedWord(paragraph, exclusionList);
        System.out.println("Second Most Repeated Word: " + secondMostRepeated);
    }
}