package muhammad.week5;

public class findUnique {
    /*Write a return  method that can find the unique characters from the String
      Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";*/

    public static String unique(String str) {
        StringBuilder result = new StringBuilder();

        // Iterate through the characters of the string
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            // Check if the current character appears only once in the string
            if (str.indexOf(currentChar) == str.lastIndexOf(currentChar)) {
                // Append the character to the result
                result.append(currentChar);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String input = "AAABBBCCCDEF";
        System.out.println(unique(input)); // Output: DEF
    }
}
