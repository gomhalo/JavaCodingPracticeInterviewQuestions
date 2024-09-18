package CodingPracticeInterviewQuestions;

public class CycleDetectionAndSteps {
    public static int findCycleLength(int[] nums) {
        int slow = 0;
        int fast = 0;

        while (true) {
            if (fast >= nums.length || nums[fast] == 0) {
                // If fast pointer reaches the end of the array or encounters a zero, there is no cycle.
                return 0;
            }

            slow = nums[slow];          // Move the slow pointer one step.
            fast = nums[nums[fast]];    // Move the fast pointer two steps.

            if (slow == fast) {
                // The two pointers meet, indicating the start of the cycle.
                int cycleLength = 1;
                fast = nums[fast]; // Move the fast pointer one step to find the end of the cycle.
                while (slow != fast) {
                    fast = nums[fast];
                    cycleLength++;
                }
                return cycleLength;
            }
        }
    }

    public static void main(String[] args) {
//        int[] arrWithCycle = {2, 1, 3, 1, 4, 2};  // There is a cycle (1 -> 3 -> 4 -> 2 -> 1).
    	int[] arrWithCycle = {2, 4, 1, 0, 5, 3};  // There is a cycle (1 -> 3 -> 4 -> 2 -> 1).

        int cycleLength = findCycleLength(arrWithCycle);
        System.out.println("Number of steps to complete the cycle: " + cycleLength);  // Should print 4 (1 -> 3 -> 4 -> 2 -> 1).
    }
}