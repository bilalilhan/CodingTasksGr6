package filora.week11;


import java.util.*;

public class mapMinValue {
//Write a method that can return the minimum value from a map (DO NOT use sort method)

   public static void main(String[] args) {
      Map<String, Integer> scores = new HashMap<>();
      scores.put("Alice", 88);
      scores.put("Bob", 95);
      scores.put("Charlie", 82);
      scores.put("Diana", 95);

      int minValue = Collections.min(scores.values());
      System.out.println("The minimum score is: " + minValue);
   }
}
