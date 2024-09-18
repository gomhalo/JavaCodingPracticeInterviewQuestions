package CodingPracticeInterviewQuestions;

public class Fibonachi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		//0,1,1,2,3,5,8,13,21,34,55,89
		System.out.println(fibonnachi(0,0,1,7));
		
	}
	
	
	
	public static int fibonnachi(int i,int a, int b,int n){
		
		
		  
		if(i==n) {
			return a;
		}
		return fibonnachi(i+1,b,a+b,n);

	}	

}
