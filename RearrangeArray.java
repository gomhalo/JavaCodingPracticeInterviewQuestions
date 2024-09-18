package CodingPracticeInterviewQuestions;

public class RearrangeArray {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};

        rearrangeArray(arr);

        System.out.println("Rearranged array with odd integers first: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void rearrangeArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            // Move left pointer to the right until an even number is found.
            while (arr[left] % 2 != 0 && left < right) {
                left++;
            }

            // Move right pointer to the left until an odd number is found.
            while (arr[right] % 2 == 0 && left < right) {
                right--;
            }

            if (left < right) {
                // Swap the elements at the left and right pointers.
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }
    }
}