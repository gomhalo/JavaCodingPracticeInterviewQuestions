package CodingPracticeInterviewQuestions;

public class MonotonicArray {

    public static boolean isMonotonic(int[] nums) {
        boolean increasing = true;
        boolean decreasing = true;
        
        // Traverse through the array
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                decreasing = false;  // If an element is greater than the previous one, it can't be decreasing
            }
            if (nums[i] < nums[i - 1]) {
                increasing = false;  // If an element is smaller than the previous one, it can't be increasing
            }
        }
        
        // The array is monotonic if it is either increasing or decreasing
        return increasing || decreasing;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 3};  // Non-decreasing array
        int[] nums2 = {6, 5, 4, 4};  // Non-increasing array
        int[] nums3 = {1, 3, 2};     // Not monotonic

        System.out.println("Is nums1 monotonic? " + isMonotonic(nums1)); // true
        System.out.println("Is nums2 monotonic? " + isMonotonic(nums2)); // true
        System.out.println("Is nums3 monotonic? " + isMonotonic(nums3)); // false
    }
}