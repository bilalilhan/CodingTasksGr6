package bilal.week4;

import java.util.HashMap;
import java.util.Map;

public class FrequencyofCharacters {
    /*Write a return method that can find the frequency of characters
    Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2*/





    // Method to calculate the frequency of characters in the given string



    public static void main(String[] args) {
        String str = "AAAbCbbbb";
        System.out.println("Character count in \"" + str + "\": " + countCharacters(str));

    }





    public static String countCharacters(String str) {
        String result = "";   // Initialize an empty string to store the result

        // Outer loop to iterate through each character in the input string
        for (int i = 0; i < str.length(); i++) {
            char eachCharacter = str.charAt(i); // Get the current character
            int count = 0;     // I initialize the count for each character

            // Inner loop to count occurrences of the current character// Count occurrences of each character
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == eachCharacter) {// I check if the current character matches
                                                     // the one being counted

                    count++;     // Increment count if characters match
                }
            }

            // If character already in result, continue
            if (result.contains("" + eachCharacter)) {
                continue;   // If it's already in result, skip to the next character
            }

            // Append character and its count to result
            result += eachCharacter;  // Append the character
            result += count;          // Append the count
        }

        return result;               // Return the final result string



    }
}