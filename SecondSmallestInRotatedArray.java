package CodingPracticeInterviewQuestions;

public class SecondSmallestInRotatedArray {
    public static int findSecondSmallest(int[] arr) {
        int n = arr.length;
        if (n < 2) {
            return -1; // Not enough elements in the array.
        }

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        int pivot = findPivot(arr, 0, n - 1);

        if (pivot == -1) {
            smallest = arr[0];
            secondSmallest = arr[1];
        } else {
            smallest = arr[(pivot + 1) % n];
            secondSmallest = arr[(pivot + 2) % n];
        }

        return secondSmallest;
    }

    public static int findPivot(int[] arr, int low, int high) {
        if (high < low) {
            return -1; // Array is not rotated.
        }
        if (high == low) {
            return low;
        }

        int mid = low + (high - low) / 2;
        
        // Find the pivot without using built-in functions.
        while (low < high) {
            mid = low + (high - low) / 2;
            if (arr[mid] > arr[high]) {
                low = mid + 1;
            } else if (arr[mid] < arr[high]) {
                high = mid;
            } else {
                high--;
            }
        }

        return low;
    }

    public static void main(String[] args) {
        int[] arr = {5, 6, 1, 2, 3, 4};
        int result = findSecondSmallest(arr);
        System.out.println("The second smallest element is: " + result);
    }
}