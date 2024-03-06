package ameneh.week4;
import java.util.stream.Collectors;
public class RemoveDuplicates {
    /*Write a return method that can remove the duplicated values from String
        Ex:  removeDup("AAABBBCCC")  ==> ABC*/

    public static void main(String[] args) {
        // The result is then printed to the console, and the expected output is "ABC".
        String result = removeDup( "AAABBBCCC" );
        System.out.println( result ); // Output: ABC
    }

    public static String removeDup(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }
        /* This method takes a String (input) as a parameter.
        It checks if the input is null or empty.
        If so, it returns the input as it is.*/

        StringBuilder result = new StringBuilder();
        char[] chars = input.toCharArray();

        for (char c : chars) {
            // Append unique characters to the result StringBuilder
            if (result.indexOf( String.valueOf( c ) ) == -1) {
                result.append( c );
            }
        }
        /*Inside the loop,it checks
        whether the character is already present in the result using indexOf.If the character is not present
        (indexOf returns -1),it appends the character to the result.Finally,
        it returns the result as a string.*/

        return result.toString();
    }
}