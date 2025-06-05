package Day0013;

import java.util.HashMap;

public class P2_freq_ {
    public static void main(String[] args) {
        String str="programming";
        HashMap<Character, Integer> freqMap = new HashMap<>();
        for (char ch : str.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }
         System.out.println(freqMap);
         
         
    }
   
    
}
