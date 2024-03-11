package filora.week6;

import java.util.Arrays;

public class FindMaximum {
   /* Write a method that can find the maximum number from an int Array
    Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 99 */

   public static void main(String[] args) {
      // Test array
      int[] numbers = {5, 6, 9, 15};

      // Demonstrate both methods
      System.out.println("Maximum value using maxValue: " + maxValue(numbers));
      System.out.println("Maximum value using maxValue2: " + maxValue2(numbers));
   }

   // Finds maximum value by iterating through the array
   public static int maxValue(int[] num) {
      int max = Integer.MIN_VALUE;
      for (int each : num) {
         if (each > max) {
            max = each;
         }
      }
      return max;
   }

   // Finds maximum value by sorting the array first
   public static int maxValue2(int[] num) {
      Arrays.sort(num);
      return num[num.length - 1];
   }
}