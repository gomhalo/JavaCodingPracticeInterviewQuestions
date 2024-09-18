package CodingPracticeInterviewQuestions;

import java.util.Arrays;
import java.util.List;

public class Java8Reduce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String>  list = Arrays.asList("dog","over","good");
		
		list.stream().reduce((x1,x2)->x1.length()==3? x1:x2).ifPresent(System.out::println);
		System.out.println("------------------------------------");
		
		System.out.println(list.stream().reduce(new String(),(x1,x2)->{if(x1.equals("dog"))
			return x1;return x2;}));

	}

}
