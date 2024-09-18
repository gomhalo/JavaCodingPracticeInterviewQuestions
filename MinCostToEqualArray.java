package CodingPracticeInterviewQuestions;

public class MinCostToEqualArray {

    public static int minCostToMakeEqual(int[] arr,int num) {
        int n = arr.length;
        int totalCost = 0;

        // We will iterate through the array and make adjustments to prefixes
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[i - 1]) {
                int diff = arr[i] - arr[i - 1];
                // Apply the operation to the prefix of length i
                for (int j = 0; j < i; j++) {
                    arr[j] += diff;
                }
                // Accumulate the cost
                totalCost += Math.abs(diff);
            }
        }

        return totalCost;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 1, 5};
        System.out.println(minCostToMakeEqual(arr1,3)); // Output: 6

        int[] arr2 = {1, 4, 2, 1};
        System.out.println(minCostToMakeEqual(arr2,5)); // Output: 4
        
        int[] arr3 = {1, 2, 3, 1,2};
        System.out.println(minCostToMakeEqual(arr3,4)); // Output: 5
    }
}