package CodingPracticeInterviewQuestions;

import java.util.ArrayList;
import java.util.List;

public class MovingAverage {
    public static List<Double> movingAverage(List<Integer> nums, int K) {
        List<Double> smoothedArray = new ArrayList<>();
        double windowSum = 0;
        int windowSize = Math.min(K, nums.size());

        // Calculate initial sum of first window
        for (int i = 0; i < windowSize; i++) {
            windowSum += nums.get(i);
        }

        // Calculate moving average for each window
        smoothedArray.add(windowSum / windowSize);
        for (int i = windowSize; i < nums.size(); i++) {
            windowSum += nums.get(i) - nums.get(i - windowSize);
            smoothedArray.add(windowSum / windowSize);
        }

        return smoothedArray;
    }

    public static void main(String[] args) {
//        List<Integer> nums = List.of(3, 5, 7, 2, 8, 10, 11, 65, 72, 81, 99, 100, 150);
    	List<Integer> nums = List.of(1, 1, 1, 1,2,1,1);
        int K = 3;
        List<Double> smoothedArray = movingAverage(nums, K);
        System.out.println(smoothedArray);
    }
}