package ameneh.week5;

public class findUnique {
    /*Write a return method that can find the unique characters from the String
      Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";*/

        public static String findUnique(String input) {
            StringBuilder result = new StringBuilder();
            /*This line declares a StringBuilder named result. StringBuilder is used for efficient string concatenation. It initializes an empty StringBuilder that will be used to store the unique characters.*/

            for (int i = 0; i < input.length(); i++) {
                char currentChar = input.charAt(i);
            /*This line starts a for loop that iterates over each character in the input string. The loop variable i is an index.*/
            /*Inside the loop, this line retrieves the character at the current index i from the input string and assigns it to the variable currentChar.*/

                if (input.indexOf(currentChar) == input.lastIndexOf(currentChar)) {
                    result.append(currentChar);
                }
            }
            /*This line checks if the current character appears only once in the string. It compares the index of the first occurrence (indexOf) with the index of the last occurrence (lastIndexOf). If they are equal, it means the character is unique.*/
            return result.toString();
        }
        //If the current character is unique, it is appended to the StringBuilder named result.

        public static void main(String[] args) {
            // Example:
            String inputString = "AAABBBCCCDEF";
            String uniqueChars = findUnique(inputString);
            //This line initializes a String variable named inputString with the value "AAABBBCCCDEF".

            System.out.println("inputString: " + inputString);
            System.out.println("Unique characters: " + uniqueChars);
            //Prints the unique characters found in the input string to the console.
        }
    }

