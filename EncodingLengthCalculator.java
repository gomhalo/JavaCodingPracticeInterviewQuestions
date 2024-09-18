package CodingPracticeInterviewQuestions;

public class EncodingLengthCalculator {
    public static int calculateEncodedLength(String input) {
        int encodedLength = input.length(); // Initialize with the original length

        // Iterate through the string and look for repeating substrings
        for (int i = 1; i <= input.length() / 2; i++) {
            String prefix = input.substring(0, i);
            int count = 1;
            int j = i;

            while (j + i <= input.length()) {
                String substr = input.substring(j, j + i);
                if (substr.equals(prefix)) {
                    count++;
                    j += i;
                } else {
                    break;
                }
            }

            if (count > 1) {
                int prefixLength = prefix.length();
                int countLength = (int)Math.log10(count) + 1; // Length of the count part
                encodedLength = Math.min(encodedLength, prefixLength + countLength + 1);
            }
        }

        return encodedLength;
    }

    public static void main(String[] args) {
//        String input = "abababab";
    	
    	 String input = "ABABCABABCE";
        int encodedLength = calculateEncodedLength(input);

        System.out.println("Length of the encoded string for '" + input + "' is: " + encodedLength);
    }
}




