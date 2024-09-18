package CodingPracticeInterviewQuestions;

import java.util.Arrays;

public class CheckALetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "SAM";
		String s2 = "JOHN";
		String s3 = "SMJOHN";
		System.out.println(checkLetter(s1,s2,s3));

	}

	public static String checkLetter(String s1,String s2,String s3){
		
		String s4 = s1+s2;
		char[] ch4=s4.toCharArray();
		char[] ch3 = s3.toCharArray();
		Arrays.sort(ch3);
		Arrays.sort(ch4);
		
		if(ch4.length!=ch3.length)
			return "NO";
			
		for(int i=0;i<s3.length();i++) {
			if(ch4[i]!=ch3[i]) {
				return "NO";
			}
		}
			
		return "YES";		
		
	}
}
