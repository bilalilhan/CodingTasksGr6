package filora.week9;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveSomeValues {
    //Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
    public static void main(String[] args) {
       // Using a different set of numbers and a different threshold
       ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(-10, 50, 120, 200, -300, 0, 85, 100));
       System.out.println(removeIfGreater(numbers, 50)); // Changing threshold to 50
    }

   public static List<Integer> removeIfGreater(List<Integer> numbers, int threshold) {
      numbers.removeIf(n -> n > threshold);
      return numbers;
   }
}