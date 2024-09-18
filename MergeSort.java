package CodingPracticeInterviewQuestions;

import java.util.Arrays;

public class MergeSort {

    // Merge Sort function
    public static void mergeSort(int[] array) {
        if (array.length < 2) {
            return;  // Base case: If the array has 1 or 0 elements, it's already sorted
        }

        // Split the array into two halves
        int mid = array.length / 2;
        int[] left = Arrays.copyOfRange(array, 0, mid);
        int[] right = Arrays.copyOfRange(array, mid, array.length);

        // Recursively sort both halves
        mergeSort(left);
        mergeSort(right);

        // Merge the sorted halves
        merge(array, left, right);
    }

    // Merge function to combine two sorted arrays
    public static void merge(int[] array, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        // Compare elements from both halves and place them in the correct order
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                array[k++] = left[i++];
            } else {
                array[k++] = right[j++];
            }
        }

        // Copy remaining elements from the left half, if any
        while (i < left.length) {
            array[k++] = left[i++];
        }

        // Copy remaining elements from the right half, if any
        while (j < right.length) {
            array[k++] = right[j++];
        }
    }

    // Main method to test merge sort
    public static void main(String[] args) {
        int[] array = {38, 27, 43, 3, 9, 82, 10};
        
        System.out.println("Original Array:");
        System.out.println(Arrays.toString(array));

        // Sorting the array using merge sort
        mergeSort(array);
        
        System.out.println("Sorted Array:");
        System.out.println(Arrays.toString(array));
    }
}