package CodingPracticeInterviewQuestions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class PyramidBuilder {
    public static String decode(String messageFile) {
        Map<Integer, String> pyramidLevels = new HashMap<>();
        
        try (BufferedReader reader = new BufferedReader(new FileReader(messageFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.trim().split("\\s+");
                int number = Integer.parseInt(parts[0]);
                String word = parts[1];
                pyramidLevels.put(number, word);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Construct the decoded message
        StringBuilder decodedMessage = new StringBuilder();
        int lineNumber = 1;
        int counter = 0;
        while (pyramidLevels.containsKey(lineNumber)) {
            decodedMessage.append(pyramidLevels.get(lineNumber)).append(" ");
            counter++;
            lineNumber = lineNumber + counter + 1; // Next line number follows a pattern based on the current line number
        }
        return decodedMessage.toString().trim();
    }

    public static void main(String[] args) {
    	String fileName = "pyramid.txt";
        File file = new File(fileName);
        String filePath = file.getAbsolutePath();
        String decodedMessage = decode(filePath);
        System.out.println(decodedMessage);
    }
}