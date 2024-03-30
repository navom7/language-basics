package collections.dfourHashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapExplore {
    public static void main(String[] args) {
        Map<Integer, String> mp = new HashMap<>();
        mp.put(null, "TEST");
        mp.put(0, null);
        mp.put(1, "A");
        mp.put(2, "B");

        mp.forEach((Integer i, String s) -> System.out.println(i + " " + s));

        mp.putIfAbsent(null, "test");
        mp.putIfAbsent(2, "M");
        mp.putIfAbsent(0, "N");
        System.out.println();
        mp.forEach((Integer i, String s) -> System.out.println(i + " " + s));
        System.out.println();


        for(Map.Entry<Integer, String> entry : mp.entrySet()) {
            System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
            System.out.println(entry.toString());
        }

        System.out.println("\n Is Empty:" + mp.isEmpty() + "\n");

        System.out.println("\n Size:" + mp.size() + "\n");
        System.out.println("\n contains Key 3:" + mp.containsKey(3) + "\n");
        System.out.println("\n contains value N:" + mp.containsValue("N") + "\n");
        System.out.println("\n get value of key 1:" + mp.get(1) + "\n");
        System.out.println("\n contains value N:" + mp.containsValue("N") + "\n");

        for(Integer key : mp.keySet()) {
            System.out.print(key + " ");
        }
        System.out.println();


    }
}
