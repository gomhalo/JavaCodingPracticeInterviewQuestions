package CodingPracticeInterviewQuestions;

import java.util.Stack;

public class PatternChecker {

public static void main(String[] args) {
		
		String string = "[{()}]";
		String string2 = "[{(}}]";
		
		System.out.println(checkPattern(string));
		System.out.println(checkPattern(string2));
	
		
		
	}
	
	public static boolean checkPattern(String st) {
		
		
		Stack<Character> stack=new Stack<>();
		for(char c:st.toCharArray()) {
			
			if(c=='{' || c=='[' || c=='(') {
				
				stack.push(c);
			}
			else //if(c=='}' || c==']' || c==')') {
				{	
				if(stack.isEmpty()) {
					return false;
				}
			char top=stack.pop();
			
			if(!isMatch(top, c)) {
				return false;
			}
			
			}
			
		}
		
		return stack.isEmpty();
	}
	
	private static boolean isMatch(char open, char close) {
		return (open=='{' && close=='}') || 
				(open=='[' && close==']') ||
				(open=='(' && close==')') ;
	}

}
