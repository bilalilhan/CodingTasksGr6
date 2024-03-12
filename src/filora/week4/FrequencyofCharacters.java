package filora.week4;

public class FrequencyofCharacters {
    /*Write a return method that can find the frequency of characters
    Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2*/
    // Main method: runs the program
    public static void main(String[] args) {
       // Print the frequency of characters in "AABBCCC"
       System.out.println(frequencyOfChars("AABBCCC"));
    }

   // Counts how often each character appears in a string
   public static String frequencyOfChars(String str) {
      StringBuilder nonDup = new StringBuilder(); // To keep track of characters already seen

      // Go through each character in the string
      for (int i = 0; i < str.length(); i++) {
         String currentChar = String.valueOf(str.charAt(i));
         // If the character is not already in nonDup, add it
         if (nonDup.indexOf(currentChar) == -1) {
            nonDup.append(currentChar);
         }
      }

      StringBuilder expectedResult = new StringBuilder(); // For the final result

      // For each unique character, find how many times it appears
      for (int j = 0; j < nonDup.length(); j++) {
         char currentChar = nonDup.charAt(j);
         int count = 0; // To count the occurrences

         // Count how many times currentChar appears in str
         for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == currentChar) {
               count++;
            }
         }
         // Add the character and its count to the result string
         expectedResult.append(currentChar).append(count);
      }

      return expectedResult.toString(); // Return the result
   }
}