package CodingPracticeInterviewQuestions;

import java.util.Scanner;

public class UtopianTree {

    // Function to calculate the height of the tree after n cycles
    public static int calculateHeight(int n) {
        int height = 1; // initial height of the tree

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                // Summer cycle: increase height by 1
                height += 1;
            } else {
                // Spring cycle: double the height
                height *= 2;
            }
        }

        return height;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of test cases: ");
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            System.out.print("Enter the number of cycles: ");
            int n = scanner.nextInt();
            int result = calculateHeight(n);
            System.out.println("The height of the Utopian Tree after " + n + " cycles is: " + result);
        }

        scanner.close();
    }
}