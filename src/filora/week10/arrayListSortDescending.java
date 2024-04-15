package filora.week10;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class arrayListSortDescending {
   // This class demonstrates sorting ArrayLists in descending order without using the sort method.

   public static void main(String[] args) {
      ArrayList<Integer> numericalList = new ArrayList<>(Arrays.asList(10, 25, -5, 0, 100, 32));
      ArrayList<String> nameList = new ArrayList<>(Arrays.asList("Bob", "Alice", "Zara", "Morgan"));

      sortDescendingNumbers(numericalList);
      sortDescendingNames(nameList);

      System.out.println("Descending sorted numbers: " + numericalList);
      System.out.println("Descending sorted names: " + nameList);
   }

   public static void sortDescendingNumbers(List<Integer> list) {
      for (int i = 0; i < list.size(); i++) {
         for (int j = i + 1; j < list.size(); j++) {
            if (list.get(i) < list.get(j)) {
               Integer temp = list.get(i);
               list.set(i, list.get(j));
               list.set(j, temp);
            }
         }
      }
   }

   public static void sortDescendingNames(List<String> list) {
      for (int i = 0; i < list.size(); i++) {
         for (int j = i + 1; j < list.size(); j++) {
            if (list.get(i).compareTo(list.get(j)) < 0) {
               String temp = list.get(i);
               list.set(i, list.get(j));
               list.set(j, temp);
            }
         }
      }
   }
}

