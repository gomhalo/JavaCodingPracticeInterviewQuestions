package CodingPracticeInterviewQuestions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class UniqueInBothList {

	public static List<Integer> findUniqueElements(List<Integer> list1, List<Integer> list2) {
        // Convert list1 and list2 to sets for faster lookup
        Set<Integer> set1 = new HashSet<>(list1);
        Set<Integer> set2 = new HashSet<>(list2);

        // Find elements unique to list1
        Set<Integer> uniqueTo1 = new HashSet<>(set1);
        uniqueTo1.removeAll(set2);

        // Find elements unique to list2
        Set<Integer> uniqueTo2 = new HashSet<>(set2);
        uniqueTo2.removeAll(set1);

        // Combine the unique elements from both lists into a single list
        List<Integer> uniqueElements = new ArrayList<>(uniqueTo1);
        uniqueElements.addAll(uniqueTo2);

        return uniqueElements;
    }

    public static void main(String[] args) {
        List<Integer> list1 = List.of(1, 2, 3, 4, 5);
        List<Integer> list2 = List.of(3, 4, 5, 6, 7);

        List<Integer> uniqueElements = findUniqueElements(list1, list2);
        System.out.println(findUniqueElements(list1,list2));

        System.out.println("Elements unique to list1: " + uniqueElements.subList(0, list1.size()-3));
        System.out.println("Elements unique to list2: " + uniqueElements.subList(list2.size()-3,list2.size()-1));
    }
}
