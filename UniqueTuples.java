package CodingPracticeInterviewQuestions;

import java.util.HashSet;
import java.util.Set;

public class UniqueTuples {
    public static void main(String[] args) {
        String inputString = "abcdefgh";
        int tupleSize = 3; // Change this to the desired tuple size

        Set<String> uniqueTuples = extractUniqueTuples(inputString, tupleSize);

        System.out.println("Unique tuples of size " + tupleSize + ":");
        for (String tuple : uniqueTuples) {
            System.out.println(tuple);
        }
    }

    public static Set<String> extractUniqueTuples(String inputString, int tupleSize) {
        Set<String> uniqueTuples = new HashSet<>();

        int n = inputString.length();

        if (tupleSize > n) {
            return uniqueTuples;
        }

        for (int i = 0; i <= n - tupleSize; i++) {
            String tuple = inputString.substring(i, i + tupleSize);
            uniqueTuples.add(tuple);
        }

        return uniqueTuples;
    }
}