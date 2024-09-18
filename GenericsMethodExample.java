package CodingPracticeInterviewQuestions;

public class GenericsMethodExample {
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        String[] strArray = {"Hello", "World"};
        Integer[] intArray = {1, 2, 3};
        
        printArray(strArray); // Works for String array
        printArray(intArray); // Works for Integer array
    }
}
