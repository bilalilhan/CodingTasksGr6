package filora.week4;

import java.util.Arrays;

public class SameLetters {
    /*Write a return method that check if a string is build out of the same letters as another string.
    Ex:  same("abc",  "cab"); -> true
    same("abc",  "abb"); -> false:*/

   public class StringComparator {

      public static boolean same(String s1, String s2) {
         if (s1 == null || s2 == null) {
            return false; // Handling null cases
         }

         // If lengths are not equal, they cannot be permutations of each other
         if (s1.length() != s2.length()) {
            return false;
         }

         // Convert strings to char arrays
         char[] array1 = s1.toCharArray();
         char[] array2 = s2.toCharArray();

         // Sort both arrays
         Arrays.sort(array1);
         Arrays.sort(array2);

         // Compare sorted arrays
         return Arrays.equals(array1, array2);
      }

      public static void main(String[] args) {
         System.out.println(same("abc", "cab")); // true
         System.out.println(same("abc", "abb")); // false
      }
   }

}