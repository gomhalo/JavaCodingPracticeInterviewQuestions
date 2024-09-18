package CodingPracticeInterviewQuestions;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FrequencyFinder {
    public static void findFrequency(String st) {
        char[] ch = st.toCharArray();
        Map<Character, Long> frequencyMap = IntStream.range(0, ch.length)
                .mapToObj(i -> ch[i])
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        frequencyMap.forEach((key, value) -> System.out.println(key + ": " + value));
    }
    
    
    
    public static void findFrequency2(String st) {
        Map<Character, Long> frequencyMap = st.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        
        frequencyMap.forEach((key, value) -> System.out.println(key + ": " + value));
    }

    public static void main(String[] args) {
        String inputString = "example";
        findFrequency(inputString);
        System.out.println("<-------Using findFrequency2-------------->");
        findFrequency2(inputString);
    }
}