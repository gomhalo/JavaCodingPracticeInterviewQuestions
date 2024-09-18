package CodingPracticeInterviewQuestions;

public class PrimeFactors {
    public static void main(String[] args) {
        int n = 56; // Change this to the number for which you want to find prime factors
        findPrimeFactors(n);
    }

    public static void findPrimeFactors(int n) {
        System.out.print("Prime factors of " + n + " are: ");

        // Print the number of 2s that divide n
        while (n % 2 == 0) {
            System.out.print("2 ");
            n /= 2;
        }

        // n must now be odd, so a skip of 2 (i) is used
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            // While i divides n, print i and divide n
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }

        // If n is still greater than 1, it is a prime factor itself
        if (n > 1) {
            System.out.print(n);
        }
    }
}