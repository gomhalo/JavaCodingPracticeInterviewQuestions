package CodingPracticeInterviewQuestions;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};

        bubbleSort(arr);

        System.out.println("Sorted array in ascending order: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped = true;

        while (swapped) {
        	// If no two elements were swapped in the inner loop, the array is already sorted.
            swapped = false;

            for (int i = 0; i < n - 1; i++) {
         
                if (arr[i] > arr[i + 1]) {
                    // Swap arr[i] and arr[i + 1]
                	swapped=true;
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
           
        }
    }
}