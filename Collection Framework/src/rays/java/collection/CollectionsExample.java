package rays.java.collection;

import java.util.*;

public class CollectionsExample {
    public static void main(String[] args) {
        // List example
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Apple");  // Allows duplicates
        System.out.println("ArrayList: " + arrayList);

        // Set example
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Apple");  // Does not allow duplicates
        System.out.println("HashSet: " + hashSet);

        // Queue example
        Queue<String> linkedList = new LinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Cherry");
        System.out.println("LinkedList as Queue: " + linkedList);

        // Map example
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Apple", 1);
        hashMap.put("Banana", 2);
        hashMap.put("Cherry", 3);
        System.out.println("HashMap: " + hashMap);
        
        // Iterating over a Map
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}











