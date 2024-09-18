package CodingPracticeInterviewQuestions;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CommonCharactersFinder {
    public static Set<Character> findCommonCharacters(List<String> list1, List<String> list2) {
        Set<Character> set1 = list1.stream()
                .flatMapToInt(CharSequence::chars)
                .mapToObj(ch -> (char) ch)
                .collect(Collectors.toSet());

        Set<Character> set2 = list2.stream()
                .flatMapToInt(CharSequence::chars)
                .mapToObj(ch -> (char) ch)
                .collect(Collectors.toSet());

        set1.retainAll(set2); // Retain only elements in set1 that are also in set2

        return set1;
    }

    public static void main(String[] args) {
        List<String> list1 = List.of("apple", "banana", "orange");
        List<String> list2 = List.of("banana", "grape", "orange");

        Set<Character> commonCharacters = findCommonCharacters(list1, list2);
        System.out.println("Common characters: " + commonCharacters);
    }
}