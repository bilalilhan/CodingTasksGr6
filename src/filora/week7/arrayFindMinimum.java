package filora.week7;


public class arrayFindMinimum {
    // Write a method that can find the minimum  number from an int Array
    //Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 6

   public static class Main {

      public static void main(String[] args) {
         // Array of numbers with a different set
         int[] arr = {-5, 34, 0, 22, -11, 58, 3};

         // Print smallest number
         min(arr);
      }

      // Finds and prints the smallest number in the given array
      public static void min(int[] num) {
         int min = num[0]; // Start with the first number

         // Look through all numbers
         for (int each : num) {
            // If found smaller, remember it
            if (each < min) {
               min = each;
            }
         }

         // Print the smallest number
         System.out.println(min);
      }
   }}