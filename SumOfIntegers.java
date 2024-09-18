package CodingPracticeInterviewQuestions;

public class SumOfIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(height(10));

	}
	
	static int height(int n){
		int h = 0;
		
		if(n%2==0)
			h= n+1;
		else
			h= n*2;
		
		return h;
	
		
		
	}

}
