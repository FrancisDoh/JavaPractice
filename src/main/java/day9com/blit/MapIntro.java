package day9com.blit;

import java.util.*;

public class MapIntro {
    public static void main(String[] args) {
        /*
            .put("elm"): is used to insert element.
            .keySet(): returns all keys in arr format
            .containsKey(key): to check id the map var contains the specified key
            .containsValue(val): checks if the map var contains the specified value.
         */
        // HASHMAP: accepts null, and doesn't follow insertion order, and also ascending order.
        Map<Integer, String> hMap = new HashMap<Integer, String>();

        hMap.put(1, null);
        hMap.put(3, "hi");
        hMap.put(2, "hello");
        hMap.put(4, "hi");

        System.out.println(hMap);

        // Display all the keys
        for(Integer k : hMap.keySet()){
            System.out.println(k);
        }

        // Display all the values
        for(String v : hMap.values()){
            System.out.println(v);
        }

        // Display keys + values
        hMap.forEach((k, v) -> System.out.println(k + " - " + v)); // ForEach

        // LINKEDHASHSET: accepts null,
        Map<Integer, String> lMap = new LinkedHashMap<Integer, String>();

        lMap.put(1, null);
        lMap.put(3, "hi");
        hMap.put(2, "hello");
        hMap.put(4, "hi");

        System.out.println(hMap);

        // TREEMAP
        Map<Integer, String> tMap = new TreeMap<Integer, String>();

        lMap.put(1, null);
        lMap.put(3, "hi");
        hMap.put(2, "hello");
        hMap.put(4, "hi");

        System.out.println(hMap);
    }
}
