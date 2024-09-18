package CodingPracticeInterviewQuestions;

public class findSmalletsPositiveInteger {
	
public static void main(String[] args) {
    int[] A = {3, 4, -1, 1};
    int result = findSmallestMissingPositive(A);
    System.out.println("The smallest missing positive integer is: " + result);
}
public static int findSmallestMissingPositive(int[] A) {
	
	
	
    int n = A.length;

    // Step 1: Separate positive and non-positive numbers
    int shift = segregatePositive(A, n);

    // Step 2: Consider only positive numbers
    int[] positiveArray = new int[n - shift];
    int j = 0;
    for (int i = shift; i < n; i++) {
        positiveArray[j] = A[i];
        j++;
    }

    // Step 3: Mark presence of positive numbers
    for (int i = 0; i < positiveArray.length; i++) {
        int num = Math.abs(positiveArray[i]);
        if (num <= positiveArray.length) {
            int index = num - 1;
            if (positiveArray[index] > 0) {
                positiveArray[index] = -positiveArray[index];
            }
        }
    }

    // Step 4: Find the first positive element
    for (int i = 0; i < positiveArray.length; i++) {
        if (positiveArray[i] > 0) {
            return i + 1;
        }
    }

    // If all positive integers from 1 to n are present, return n + 1
    return positiveArray.length + 1;
}

private static int segregatePositive(int[] A, int n) {
    int shift = 0;
    for (int i = 0; i < n; i++) {
        if (A[i] <= 0) {
            int temp = A[i];
            A[i] = A[shift];
            A[shift] = temp;
            shift++;
        }
    }
    return shift;
}
}
