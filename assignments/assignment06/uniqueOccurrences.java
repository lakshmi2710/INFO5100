package Assignment6;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

class uniqueOccurrences {
    public boolean uniqueOccurrencesfn(int[] arr) {
        HashMap<Integer, Integer> hashmap = new HashMap<Integer, Integer>(); 
  
        for (int i=0 ; i < arr.length; i++) { 
            if (hashmap.containsKey(arr[i])) { 
                hashmap.put(arr[i], hashmap.get(arr[i]) + 1); 
            } 
            else { 
                hashmap.put(arr[i], 1); 
            }
            
        } 
        Set<Integer> newVariable = new HashSet<Integer>(hashmap.values());
        
        return (newVariable.size() == hashmap.size());
            
    }
}