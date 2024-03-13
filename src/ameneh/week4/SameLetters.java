package ameneh.week4;

import java.util.Arrays;

public class SameLetters {
    /* Write a return method that checks if a string is build out of the same letters as another string.
    Ex:  same("abc",  "cab"); -> true
    same("abc",  "abb"); -> false: */

    public static void main(String[] args) {

        System.out.println( same( "abc", "cab" ) );  // true
        System.out.println( same( "abc", "abb" ) );  // false
    }
      /* This line prints the result of calling the same method with the arguments "abc" and "cab" to the console.
         It will output "true" because the two strings are built out of the same letters.
         This line prints the result of calling the same method with the arguments "abc" and "abb" to the console.
         It will output "false" because the two strings are not built out of the same letters. */

    public static boolean same(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }
        /* This line declares a method named same that takes two String parameters
        (str1 and str2) and returns a boolean value.*/

        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort( charArray1 );
        Arrays.sort( charArray2 );

        /* This line checks if the lengths of the input strings str1 and str2 are not equal.
        If they are not equal,the method immediately returns false
        since strings of different lengths cannot be built out of the same letters.
        Compare the sorted character arrays*/

        return Arrays.equals( charArray1, charArray2 );
    }
}
