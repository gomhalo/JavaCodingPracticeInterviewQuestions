package CodingPracticeInterviewQuestions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PyramidDecoder {
    public static String decodeMessage(String filePath) {
        List<String> lines = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Sort lines based on the first number in each line
        Collections.sort(lines, (a, b) -> {
            int numA = Integer.parseInt(a.split(" ")[0]);
            int numB = Integer.parseInt(b.split(" ")[0]);
            return Integer.compare(numA, numB);
        });

        // Extract words corresponding to the numbers at the end of each pyramid line
        StringBuilder decodedMessage = new StringBuilder();
        for (String line : lines) {
            String[] parts = line.split(" ");
            decodedMessage.append(parts[1]);
        }
        return decodedMessage.toString();
    }

    public static void main(String[] args) {
    	String fileName = "pyramid.txt";
        File file = new File(fileName);
        String filePath = file.getAbsolutePath();
        String decodedMessage = decodeMessage(filePath);
        System.out.println("Decoded message: " + decodedMessage);
    }
}