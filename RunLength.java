package CodingPracticeInterviewQuestions;

//Run Length Encoding
public class RunLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String st = "AABBBCDDDAAABCCC";
		
		System.out.println(runLength(st));// A2B3C1D3A3B1C3

	}
	
	public static String runLength(String st) {
		
		StringBuffer sb = new StringBuffer();
		
		for(int i=0;i<st.length();i++) {
			int count = 1;
			
		while(i< st.length()-1 && st.charAt(i)==st.charAt(i+1)) {
			
			count++;
			i++;
		}
		
		sb.append(st.charAt(i));
		sb.append(count);
		}
		
		return sb.toString();
	}

}