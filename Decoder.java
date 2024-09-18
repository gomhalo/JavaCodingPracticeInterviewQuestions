package CodingPracticeInterviewQuestions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Decoder {
    public static String decode(String messageFile) {
        String[] pyramidLevels = new String[100]; // Assuming maximum number of lines in the file
        
        try (BufferedReader reader = new BufferedReader(new FileReader(messageFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.trim().split("\\s+");
                int number = Integer.parseInt(parts[0]);
                String word = parts[1];
                pyramidLevels[number - 1] = word;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Construct the decoded message
        StringBuilder decodedMessage = new StringBuilder();
        for (String word : pyramidLevels) {
            if (word != null) {
                decodedMessage.append(word).append(" ");
            }
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