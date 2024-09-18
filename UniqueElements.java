package CodingPracticeInterviewQuestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UniqueElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> num1 = List.of(1,3,5,8,5,2,10);
		List<Integer> num2 = List.of(6,3,5,8,6,2,3);
System.out.println(findUniqueElements(num1,num2));
	}
	
	public static List<Integer> findUniqueElements(List<Integer> num1,List<Integer> num2){
		
		Map<Integer,Integer> map1 = new HashMap<>();
		Map<Integer,Integer> map2 = new HashMap<>();
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		
		
		for(int num: num1) {
			if(!map1.containsKey(num)) {
				map1.put(num, map1.getOrDefault(num, 0)+1);
				
			}
			
			else {
				map1.put(num,map1.get(num)+1);
			}
				
		}
		
		for(int num: num2) {
			if(!map2.containsKey(num)) {
				map2.put(num, map2.getOrDefault(num, 0)+1);
				
			}
			
			else {
				map2.put(num,map2.get(num)+1);
			}
				
		}
		
		for(Map.Entry<Integer, Integer> entry:map1.entrySet()) {
			if(entry.getValue()==1) {
				list1.add(entry.getKey());
			}
		}
		
		for(Map.Entry<Integer, Integer> entry:map2.entrySet()) {
			if(entry.getValue()==1) {
				list2.add(entry.getKey());
			}
		}
		return list2;
		
		
	}

}
