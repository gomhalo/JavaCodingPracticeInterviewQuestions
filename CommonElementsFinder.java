package CodingPracticeInterviewQuestions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CommonElementsFinder {
    public static List<Integer> findCommonElements(List<Integer> list1, List<Integer> list2) {
        // Convert list1 to a HashSet for faster lookup
        Set<Integer> set1 = new HashSet<>(list1);

        // Initialize a list to store common elements
        List<Integer> commonElements = new ArrayList<>();

        // Iterate through list2 and add common elements to the list
        for (Integer num : list2) {
            if (set1.contains(num)) {
                commonElements.add(num);
            }
        }

        return commonElements;
    }

    public static void main(String[] args) {
//        List<Integer> list1 = List.of(1, 2, 3, 4, 5);
//        List<Integer> list2 = List.of(3, 4, 5, 6, 7);
    	
    	
//    	List<Integer> list1 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        List<Integer> list2 = List.of(5, 6, 7, 8, 9, 10, 11, 12, 13, 14);
    	
//    	List<Integer> list1 = List.of(-1, -2, -3, -4, -5);
//        List<Integer> list2 = List.of(-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5);
    	
    	List<Integer> list1 = List.of(1, 3, 5, 7, 9);
        List<Integer> list2 = List.of(2, 4, 6, 8, 10);

        List<Integer> commonElements = findCommonElements(list1, list2);

        System.out.println("Common elements: " + commonElements);
    }
}