package CodingPracticeInterviewQuestions;

public class HackerRankInString {

    public static void main(String[] args) {
    	
    	
    	String st = "haacckkerrannkk";
    	String st1 = "haacckkerran";
    	String st2 = "hccaakkerrannkk";
    	
    	
    	System.out.println(containsHackerRank(st));
    	System.out.println(containsHackerRank(st1));
    	System.out.println(containsHackerRank(st2));

    }

    public static boolean containsHackerRank(String s) {
        String target = "hackerrank";
        int targetIndex = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == target.charAt(targetIndex)) {
                targetIndex++;
            }
            if (targetIndex == target.length()) {
                return true; // All characters of "hackerrank" found
            }
        }
        
        return false; // Could not find all characters in order
    }
}