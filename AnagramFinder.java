package CodingPracticeInterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class AnagramFinder {
    public static Set<Set<String>> findAnagrams(List<String> words) {
        Map<String, Set<String>> anagramGroups = new HashMap<>();

        for (String word : words) {
            // Sort the characters in the word
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String sortedWord = new String(charArray);

            // Add the word to the anagram group
            if (!anagramGroups.containsKey(sortedWord)) {
                anagramGroups.put(sortedWord, new HashSet<>());
            }
            anagramGroups.get(sortedWord).add(word);
        }

        Set<Set<String>> result = new HashSet<>();
        for (Set<String> group : anagramGroups.values()) {
            if (group.size() > 1) {
                result.add(group);
            }
        }

        return result;
    }
    
  //Anagram Finder Return as a List  
public static List<List<String>> findAnagramsAsList(List<String> list) {
		
		List<List<String>> newList = new ArrayList<>();
		Map<String,List<String>> map = new HashMap<>();
		
		for(String word : list) {
			char[] ch = word.toCharArray();
			Arrays.sort(ch);
			String st = new String(ch);
			if(map.containsKey(st)) {
				map.get(st).add(word);
			}
			
			else {
				List<String> list1 = new ArrayList<>();
				list1.add(word);
				map.put(st,list1);
			}
			
			
			
		}
		
		for(Entry<String,List< String>> entry: map.entrySet()) {
			
			if(entry.getValue().size()>1) {
				newList.add(entry.getValue());
			}
		}
		
		return newList;
		
		
		
	}
    
    //Anagram Finder Using Java 8
    
    public static Set<Set<String>> findAnagramsUsingJava8(List<String> words) {
        // Group words by their sorted character sequences
        Map<String, Set<String>> anagramGroups = words.stream()
            .collect(Collectors.groupingBy(
                word -> {
                    char[] charArray = word.toCharArray();
                    Arrays.sort(charArray);
                    return new String(charArray);
                },
                Collectors.toSet()
            ));

        // Collect only groups with more than one word
        return anagramGroups.values().stream()
            .filter(group -> group.size() > 1)
            .collect(Collectors.toSet());
    }

    public static void main(String[] args) {
        List<String> words = Arrays.asList("listen", "silent", "hello", "world", "act", "cat", "god", "dog");

        Set<Set<String>> anagramSets = findAnagrams(words);
        
        System.out.println(anagramSets);

        for (Set<String> anagramSet : anagramSets) {
            System.out.println(anagramSet);
        }
        
        System.out.println("--------------------Return as List--------------------"); 
        
        System.out.println(findAnagramsAsList(words));
        
        
        System.out.println("--------------------Using Java8--------------------");
        
Set<Set<String>> anagramSetsUsingJava8 = findAnagramsUsingJava8(words);
        
        System.out.println(anagramSetsUsingJava8);

        for (Set<String> anagramSet : anagramSetsUsingJava8) {
            System.out.println(anagramSet);
        }
        
        System.out.println("--------------------Using Java8 Streams--------------------");
        
        anagramSetsUsingJava8.forEach(System.out::println);
    }
}