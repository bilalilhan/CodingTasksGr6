package filora.week10;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.*;
public class sortMapbyValues {
//Write a method that can sort the Map by values

      public static void main(String[] args) {
         // Initialize the map with diverse values
         Map<String, Integer> map = new LinkedHashMap<>();
         map.put("k0", 15);
         map.put("k5", -5);
         map.put("k2", 22);
         map.put("k1", 1);
         map.put("k3", 3);
         map.put("k6", 0);
         map.put("k4", -20);
         map.put("k7", 100);

         // Display the original map content
         System.out.println("Original map content:");
         map.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));

         // Sort the map by values and print the sorted map
         Map<String, Integer> sortedMap = sortByValue(map);
         System.out.println("\nSorted map by values:");
         sortedMap.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));
      }
      public static Map<String, Integer> sortByValue(Map<String, Integer> unsortedMap) {
         // Convert Map to List of Map.Entry objects
         List<Map.Entry<String, Integer>> entries = new ArrayList<>(unsortedMap.entrySet());

         // Sort the List by comparing the Map.Entry values
         entries.sort(Map.Entry.comparingByValue());

         // Create a new LinkedHashMap to maintain the order of elements
         Map<String, Integer> sortedMap = new LinkedHashMap<>();
         for (Map.Entry<String, Integer> entry : entries) {
            sortedMap.put(entry.getKey(), entry.getValue());
         }
         return sortedMap;
      }
   }