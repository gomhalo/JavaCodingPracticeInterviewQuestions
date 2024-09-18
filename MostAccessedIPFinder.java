package CodingPracticeInterviewQuestions;

import java.util.*;

public class MostAccessedIPFinder {
    public static String findMostAccessedIP(String[] stringArray) {
        Map<String, Integer> ipCount = new HashMap<>();
        int maxCount = 0;

        // Count the occurrences of each IP address
        for (String entry : stringArray) {
            String[] parts = entry.split(" ");
            if (parts.length >= 2) {
                String ip = parts[0];
                int count = ipCount.getOrDefault(ip, 0) + 1;
                ipCount.put(ip, count);
                maxCount = Math.max(maxCount, count);
            }
        }

        // Find the IP address(es) with the maximum access count
        List<String> mostAccessedIPs = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : ipCount.entrySet()) {
            if (entry.getValue() == maxCount) {
                mostAccessedIPs.add(entry.getKey());
            }
        }

        // Convert the list of IP addresses to a string
        return String.join(", ", mostAccessedIPs);
    }

    public static void main(String[] args) {
        String[] stringArray = {
            "192.168.1.1 example.com",
            "10.0.0.1 openai.com",
            "192.168.1.1 www.google.com",
            "8.8.8.8 www.apple.com"
        };

        String mostAccessedIPs = findMostAccessedIP(stringArray);

        if (!mostAccessedIPs.isEmpty()) {
            System.out.println("Most accessed IP address(es): " + mostAccessedIPs);
        } else {
            System.out.println("No IP addresses found in the string array.");
        }
    }
}

