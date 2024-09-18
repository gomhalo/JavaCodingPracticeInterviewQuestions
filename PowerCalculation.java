package CodingPracticeInterviewQuestions;

public class PowerCalculation {
    public static void main(String[] args) {
        double base = 2.0;
        double exponent = -3.0;

        // Calculate the power using a custom method
        double result = calculatePower(base, exponent);

        System.out.println(base + " raised to the power of " + exponent + " is: " + result);
    }

    public static double calculatePower(double base, double exponent) {
        if (exponent == 0) {
            return 1;
        } else {
            double result = 1;
            for (int i = 1; i <= Math.abs(exponent); i++) {
                result *= base;
            }

            if (exponent < 0) {
                return 1 / result;
            }

            return result;
        }
    }
}



