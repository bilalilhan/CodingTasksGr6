package ameneh.week6;

public class SumOfDigits {
    /*Write a method that can return the sum of the digits in a string
      Ex:  "12 java 5 apple 3"  ==>  20 */

    public static int sumOfDigitsInString(String input) {
        int sum = 0;
        //It initializes a variable sum to 0, which will store the sum of digits.

        for (char c : input.toCharArray()) {
            if (Character.isDigit( c )) {
                sum += Character.getNumericValue( c );
            }
        }
        /*It iterates through each character in the string using a for-each loop.
        If the current character is a digit (Character.isDigit(c)), it adds its numeric value to the sum using Character.getNumericValue(c).*/

        return sum;
    }
    //Finally, it returns the calculated sum.

    public static void main(String[] args) {
        String input = "12 java 5 apple 3";
        int result = sumOfDigitsInString( input );
        System.out.println( "Sum of digits in the string: " + result );
    }
    //It creates a string input with the value "12 java 5 apple 3".
    //It then calls the sumOfDigitsInString method with this string and stores the result in the variable result.
    //Finally, it prints the result, indicating the sum of digits in the string.

    /*Sum of digits in the string: 20
      This is because the digits in the string
      "12 java 5 apple 3" are 1, 2, 5, and 3, and their sum is 1 + 2 + 5 + 3 = 11.*/
}