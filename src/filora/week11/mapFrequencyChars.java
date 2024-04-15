package filora.week11;


import java.util.LinkedHashMap;
import java.util.Map;

public class mapFrequencyChars {
//Write a method that prints the frequency of each character from a String
public static void main(String[] args) {
   String test = "wow_so_cool_Frequency";
   frequencyTest(test);
}

   public static void frequencyTest(String str) {
      // Use LinkedHashMap to maintain the order of characters as they appear in the string
      Map<Character, Integer> map = new LinkedHashMap<>();
      for (Character each : str.toCharArray()) {
         // Increment the count for each character in the map
         if (map.containsKey(each)) {
            map.put(each, map.get(each) + 1);
         } else {
            map.put(each, 1);
         }
      }
      // Print the frequency of each character
      System.out.println(map);
   }
}