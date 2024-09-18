package CodingPracticeInterviewQuestions;

public class ReverseStringWithForLoop {
	
    public static String reverseLetters(String input) {
        char[] charArray = input.toCharArray();
        int left = 0;
        int right = charArray.length - 1;

        while (left < right) {
            // Swap characters at the left and right positions
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;

            // Move the indices inward
            left++;
            right--;
        }

        // Convert the character array back to a string
        return new String(charArray);
        
    }

    public static void main(String[] args) {
        String input = "Hello, World!";
        String reversedString = reverseLetters(input);
        System.out.println("Original: " + input);
        System.out.println("Reversed: " + reversedString);
    }
}