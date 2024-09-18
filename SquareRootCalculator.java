package CodingPracticeInterviewQuestions;

public class SquareRootCalculator {
    public static double calculateSquareRoot(double N, double L) {
        // Initial guess for the square root
        double x0 = N / 2.0;

        double x = x0; // Initialize the current approximation

        do {
            x0 = x; // Store the previous approximation
            x = 0.5 * (x0 + N / x0); // Compute the next approximation
        } while (Math.abs(x - x0) >= L); // Continue until the difference is within tolerance

        return x;
    }

    public static void main(String[] args) {
        double N = 25.0; // The number for which you want to find the square root
        double L = 1e-6; // Tolerance level

        double squareRoot = calculateSquareRoot(N, L);
        System.out.println("Square root of " + N + " is approximately " + squareRoot);
    }
}