package CodingPracticeInterviewQuestions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindSum {
    public static void main(String[] args) {
        // Sample integer array
//        int[] numbers = {2,7,11,15};
//        int target = 9;
    	
    	int[] numbers = {5,2,4,6,5,1};
        int target = 10;
    	
    	
//    	int[] numbers = {5,2,4,30,21,4,3,1};
//        int target = 80;
        
//        int[] sum =sum(numbers,target);
//       
//       for(int number:sum) {
//    	   
//    	   System.out.println(number) ;
//       }
//       System.out.println("<------Solution using HashMap----------->");
       
int[] sum2 =sumSmallestSubArray(numbers,target);
       
       for(int number:sum2) {
    	   
    	   System.out.println(number) ;
       }
        
    }
    
    
    static int [] sum(int[] array,int num) {
    	
    	int startingIndex =0;
    	int endIndex =0;
    	
    	for(int i=0;i<array.length-1;i++) {
    		
    		for(int j=i;j<array.length-1;j++) {
    			
    			if(array[i]+array[j+1]==num) {
    				startingIndex=i;
    				endIndex=j+1;
    				
    			}
    			
    		}
    	}
    	
		return new int[] {startingIndex,endIndex};
    	
    	
    }
    
    
static int [] sumSmallestSubArray(int[] array,int target) {
    	
    	int startingIndex =0;
    	int len =array.length;
    	int currentIndex=0;
    	int sum =0 ;
    	
    	for(int i=0;i<array.length;i++) {
    		sum = sum + array[i] ;
    		
    		while(sum>=target) {
    			if(i-currentIndex<len) {
    				startingIndex=currentIndex;
    				len=i-currentIndex;
    			}
    			sum-=array[currentIndex++];
    			
    			
    		}
    	}
    	
		return new int[] {startingIndex,startingIndex+len};
    	
    	
    }
  
    //Using HashMap
public static int[] findSum(int[] arr, int n) {
		
		Map<Integer,Integer> map = new HashMap<>();
		int temp=0;
		int[] result = new int[2];
		
		for(int i=0; i<arr.length;i++) {
			
			temp = n-arr[i];
			if(map.containsKey(temp)) {
				result[0] = map.get(temp);
				result[1] = i;
				return result;
			}
			
			else {
				map.put(arr[i], i);
			}
		}
		
		return result;
	}
}