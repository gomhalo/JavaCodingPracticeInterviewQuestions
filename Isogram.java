package CodingPracticeInterviewQuestions;

import java.util.HashMap;
import java.util.Map;

public class Isogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="aamnuel";
		System.out.println(isIsogram(str));
		
	}
	
	public static boolean isIsogram(String str) {
		
		Map<Character,Integer> map= new HashMap<>();
		
		for(int i=0;i<str.length();i++){
			
			if(map.containsKey(str.charAt(i))) {
				
				return false;
			}
			else 
				map.put(str.charAt(i), map.getOrDefault(str.charAt(i),0)+1);
		}
		
		
		return true;
		
		
	}

}
