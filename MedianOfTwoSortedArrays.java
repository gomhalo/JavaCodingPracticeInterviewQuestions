package CodingPracticeInterviewQuestions;

public class MedianOfTwoSortedArrays {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // Merge the two arrays
        int[] mergedArray = mergeArrays(nums1, nums2);

        // Calculate the median
        int n = mergedArray.length;
        if (n % 2 == 0) {
            return (mergedArray[n / 2 - 1] + mergedArray[n / 2]) / 2.0;
        } else {
            return mergedArray[n / 2];
        }
    }

    private static int[] mergeArrays(int[] nums1, int[] nums2) {
        int[] mergedArray = new int[nums1.length + nums2.length];
        int i = 0, j = 0, k = 0;

        // Merge the two arrays
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                mergedArray[k++] = nums1[i++];
            } else {
                mergedArray[k++] = nums2[j++];
            }
        }

        // If any elements left in nums1
        while (i < nums1.length) {
            mergedArray[k++] = nums1[i++];
        }

        // If any elements left in nums2
        while (j < nums2.length) {
            mergedArray[k++] = nums2[j++];
        }

        return mergedArray;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 3};
        int[] nums2 = {2};

        double median = findMedianSortedArrays(nums1, nums2);
        System.out.println("The median is: " + median);  // Output: The median is: 2.0
    }
}