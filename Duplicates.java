package CodingPracticeInterviewQuestions;


import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String input = "123@abc4567def#890";

	        // Find continuous sequences of numbers
	        findContinuousSequences(input);		
			
	}
	
	private static void findContinuousSequences(String input) {
        Pattern pattern = Pattern.compile("\\d+"); // Regular expression to match sequences of digits
        Matcher matcher = pattern.matcher(input);

        System.out.println("Continuous sequences of numbers:");

        while (matcher.find()) {
            String sequence = matcher.group();
            System.out.println(sequence);
        }
    }

}
