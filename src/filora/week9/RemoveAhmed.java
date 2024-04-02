package filora.week9;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveAhmed {
    /*Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....
    Write a java operation to remove all the names named Ahmed
    */

   public static void main(String[] args) {
      List<String> names = new ArrayList<>(
        Arrays.asList("Ahmed", "John", "Eric", "Ahmed", "Sam", "Jane", "Ahmed", "James"));
      System.out.println(removeName(names, "Ahmed"));
   }

   public static List<String> removeName(List<String> names, String name) {
      names.removeIf(p -> p.equals(name));
      return names;
   }
}