package CodingPracticeInterviewQuestions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RemoveDuplicates {
	
	public static void main(String[] args) {
		
		String s = "Amanuelelaade";
		
		System.out.println(removeDuplicates(s));
		
		
	}
	
	public static String removeDuplicates(String str) {
		
		StringBuffer stb= new StringBuffer();
		Set<Character> set= new HashSet<>();
		
		for(int i=0;i<str.length();i++) {
			
			if(!set.contains(str.charAt(i))) {
				
				set.add(str.charAt(i));
				stb.append(str.charAt(i));
				
			}	
			
				
		}
		
		return new String(stb);
		
	}

}
