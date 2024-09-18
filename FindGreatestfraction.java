package CodingPracticeInterviewQuestions;

public class FindGreatestfraction {

	public static void main(String[] args) {
		int[] arr1= {3,9};
		int[] arr2 = {2,7};
		
		addFraction(arr1,arr2);
	}

	static int gcd(int num,int den) {
		
		if(num==0) 
			return den;
			return(gcd(den%num,num));
		
	}
	
	static void addFraction(int arr1[],int arr2[]) {
		
		int num=0;
		int den=0;
		
		if(arr1[1]==arr2[1]) {
			num=arr1[0]+arr2[0];
			den = arr1[1];
		}
	
	
	else {
		num= arr1[0]*arr2[1]+arr1[1]*arr2[0];
		den = arr1[1]*arr2[1];
	
	}
		
		int temp = gcd(num,den);
		int n1=num/temp;
	}
}
