package Assignment6;

import java.util.HashMap;

class isAnagram {
    public boolean isAnagramfn(String s, String t) {
        

        HashMap<Character, Integer> hashs = new HashMap<Character, Integer>(); 
        HashMap<Character, Integer> hasht = new HashMap<Character, Integer>(); 
  
        char[] sString = s.toCharArray(); 
  
        for (char c : sString) { 
            if (hashs.containsKey(c)) { 
                hashs.put(c, hashs.get(c) + 1); 
            } 
            else { 
                hashs.put(c, 1); 
            }
        }
            
        char[] tString = t.toCharArray(); 
  
        for (char c : tString) { 
            if (hasht.containsKey(c)) { 
                hasht.put(c, hasht.get(c) + 1); 
            } 
            else { 
                hasht.put(c, 1); 
            }
        }
            
        return (hashs.equals(hasht));
    }
}