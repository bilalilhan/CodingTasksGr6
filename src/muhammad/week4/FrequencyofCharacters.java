package muhammad.week4;

public class FrequencyofCharacters {
    /*Write a return method that can find the frequency of characters
    Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2*/

        public static void main(String[] args) {
            // Input string for which to calculate character frequencies
            String str = "GALATASARAY";
            // Call the method to calculate frequencies and print the result
            System.out.println("Frequency of characters: " + calculateFrequencyOfChars(str));
        }

        // Method to calculate the frequency of characters in the given string
        public static String calculateFrequencyOfChars(String str) {
            // Create a StringBuilder to build the result string efficiently
            StringBuilder result = new StringBuilder();

            // Iterate through each character of the input string
            for (int i = 0; i < str.length(); i++) {
                // Current character to count its occurrences
                char currentChar = str.charAt(i);
                // Initialize count as 1 for the current character
                int count = 1;

                // Loop to count occurrences of 'currentChar' in the rest of the string
                for (int j = i + 1; j < str.length(); j++) {
                    // If the same character is found, increment its count
                    if (str.charAt(j) == currentChar) {
                        count++;
                    }
                }

                // Check if 'currentChar' is already added to the result to avoid duplication
                // This is important because we want each character's frequency to be listed only once in the result
                if (result.indexOf(String.valueOf(currentChar)) == -1) {
                    // If 'currentChar' is not in the result, append it and its count
                    result.append(currentChar); // Append the character itself
                    result.append(count);      // Append the count of occurrences
                }
            }

            // Convert the StringBuilder to String and return it
            // This string contains each character from the input and its frequency of occurrence
            return result.toString();
        }
    }