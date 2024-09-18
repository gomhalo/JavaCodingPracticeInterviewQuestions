package CodingPracticeInterviewQuestions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class OddEvenNumbers {

	public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        
        Map<String, List<Integer>> oddAndEvenMap=   IntStream.range(0,list.size())
        .boxed()
        .collect(Collectors.groupingBy(
                i -> i % 2 == 0 ? "even" : "odd", 
                Collectors.mapping(list::get, Collectors.toList())
        ));

        System.out.println("Odd and Even Numbers:");
        System.out.println("Odd: " + oddAndEvenMap.get("odd"));
        System.out.println("Even: " + oddAndEvenMap.get("even"));
    }

}
