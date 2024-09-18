package CodingPracticeInterviewQuestions;

public class PowerOfTenChecker {
    public static void main(String[] args) {
        int number = 1000; // Change this to the number you want to check

        boolean isPowerOfTen = isPowerOfTen(number);

        if (isPowerOfTen) {
            System.out.println(number + " is a power of 10.");
        } else {
            System.out.println(number + " is not a power of 10.");
        }
    }

    public static boolean isPowerOfTen(int number) {
        // Check if the number is greater than 0
        if (number <= 0) {
            return false;
        }

        // Use logarithms to check if it's a power of 10
        double logBase10 = Math.log10(number);
        // Check if the result is an integer (i.e., no fractional part)
        return logBase10 == (int) logBase10;
    }
}