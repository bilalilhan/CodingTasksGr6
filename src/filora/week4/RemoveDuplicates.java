package filora.week4;

public class RemoveDuplicates {
    /*Write a return method that can remove the duplicated values from String
        Ex:  removeDup("AAABBBCCC")  ==> ABC*/

   /**
    * Demonstrates the functionality of the removeDup method.
    */
   public static void main(String[] args) {
      // Remove duplicates from "AAABBBCCC" and print the result.
      System.out.println(removeDup("AAABBBCCC")); // Expected output: "ABC"
   }

   /**
    * Removes duplicate characters from a string, preserving the original order.
    */
   static String removeDup(String s) {
      StringBuilder result = new StringBuilder(); // Holds unique characters.

      // Iterate over the input string.
      for (char character : s.toCharArray()) {
         // If character not already in result, append it.
         if (result.indexOf(String.valueOf(character)) == -1) {
            result.append(character);
         }
      }

      return result.toString(); // Return the string with duplicates removed.
   }
}