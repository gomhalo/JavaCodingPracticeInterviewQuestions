package CodingPracticeInterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CodingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = Arrays.asList(1,5,6,7,8,10,6,5,8);
		
		Map<Integer,Long> map= list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		map.entrySet().stream().forEach(e->System.out.println("key:"+e.getKey()+ ":"+"Count:"+ e.getValue()));
		
	

	}	

}
