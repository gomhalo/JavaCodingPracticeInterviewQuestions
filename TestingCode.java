package CodingPracticeInterviewQuestions;

import java.util.List;

public class TestingCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//List<Person> person = List.of();
		
//		person.stream().filter(person->(jave.time.Year.now()).gerValue-person.getAge())<1990)
//		.collect(Collectors)
				

		System.out.println(fibonnachi(0,0,1,5));
	}



public static int fibonnachi(int i,int a, int b,int n){
	
	
  
	if(i==n) {
		return a;
	}
	return fibonnachi(i+1,b,a+b,n);

}	
	
}
