package filora.week5;

public class findUnique {
    /*Write a return  method that can find the unique characters from the String
      Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";*/

   public static String findUniqueCharacters(String str) {
      // Assuming ASCII, so 128 characters suffice; extend if needed
      int[] charCounts = new int[128]; // ASCII character set size

      // Count occurrences of each character
      for (char c : str.toCharArray()) {
         charCounts[c]++;
      }

      // Build string of unique characters
      StringBuilder uniqueChars = new StringBuilder();
      for (char c : str.toCharArray()) {
         if (charCounts[c] == 1) {
            uniqueChars.append(c);
         }
      }

      return uniqueChars.toString();
   }

   public static void main(String[] args) {
      String inputString = "AAABBBCCCDEF";
      System.out.println("Unique characters: " + findUniqueCharacters(inputString));
   }
}