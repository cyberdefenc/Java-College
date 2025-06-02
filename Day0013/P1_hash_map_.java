package Day0013;

import java.util.HashMap;

public class P1_hash_map_ {
    
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("id0",1);
        map.put("id1", 2);
        map.put("id2", 101010);
        System.out.println(map.get("id0"));
        System.out.println(map.keySet());
        System.out.println(map.values()); 
        System.out.println(map.containsKey("id1"));
       
        
    }
}
