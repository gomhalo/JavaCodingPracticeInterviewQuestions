package CodingPracticeInterviewQuestions;

import java.util.Arrays;

public class FractionAdder {
    public static int[] addFractions(int[] fraction1, int[] fraction2) {
        int numerator1 = fraction1[0];
        int denominator1 = fraction1[1];
        int numerator2 = fraction2[0];
        int denominator2 = fraction2[1];

        // Find a common denominator
        int commonDenominator = denominator1 * denominator2;

        // Adjust the numerators to have the same denominator
        int adjustedNumerator1 = numerator1 * denominator2;
        int adjustedNumerator2 = numerator2 * denominator1;

        // Add the adjusted numerators
        int resultNumerator = adjustedNumerator1 + adjustedNumerator2;

        // Find the greatest common divisor (GCD) to simplify the result
        int gcdValue = gcd(resultNumerator, commonDenominator);

        // Divide both the numerator and denominator by the GCD to simplify
        resultNumerator /= gcdValue;
        commonDenominator /= gcdValue;

        // Return the simplified result as an array
        int[] resultFraction = {resultNumerator, commonDenominator};

        return resultFraction;
    }

    // Helper method to calculate the greatest common divisor (GCD)
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        int[] fraction1 = {1, 2};  // 1/2
        int[] fraction2 = {1, 4};  // 1/4

        int[] result = addFractions(fraction1, fraction2);

        System.out.println(Arrays.toString(result));  // Output: [3, 4]  // 3/4
    }
}