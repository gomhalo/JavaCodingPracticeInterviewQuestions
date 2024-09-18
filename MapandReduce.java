package CodingPracticeInterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MapandReduce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numbers= Arrays.asList(3,7,8,1,5,9);
		
//		int sum1=numbers.stream().mapToInt(Integer::intValue).sum();
		int sum1=numbers.stream().mapToInt(i -> i).sum();
		int sum2=numbers.stream().reduce(0, (a,b)->a+b);
		Optional<Integer> sum3 = numbers.stream().reduce(Integer::sum);
		
		int mult1= numbers.stream().reduce(1,(a,b)->a*b);
		int maxValue = numbers.stream().reduce(0,(a,b)->a>b?a:b);
		
		Optional<Integer> max1 = numbers.stream().reduce(Integer::max);
		
		System.out.println("sum1:"+ sum1);
		System.out.println("sum2:" + sum2);
		System.out.println("sum3:" + sum3.get());
		System.out.println("mult1:" + mult1);
		System.out.println("maxValue:" + maxValue);
		System.out.println("max1:" + max1.get());

	}

}
