package CodingPracticeInterviewQuestions;

public class DotProductCalculator {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {6, 7, 8, 9, 10};

        // Check if the arrays are of the same length
        if (array1.length != array2.length) {
            System.out.println("Arrays must have the same length for dot product calculation.");
        } else {
            int dotProduct = calculateDotProduct(array1, array2);
            System.out.println("The dot product of the two arrays is: " + dotProduct);
        }
    }

    public static int calculateDotProduct(int[] array1, int[] array2) {
        int dotProduct = 0;
        for (int i = 0; i < array1.length; i++) {
            dotProduct += array1[i] * array2[i];
        }
        return dotProduct;
    }
}