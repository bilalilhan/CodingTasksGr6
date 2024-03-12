package muhammad.week6;

public class SumOfDigits {
    /*Write a method that can return the sum of the digits in a string
      Ex:  "12 java 5 apple 3"  ==>  20 */


    // Method to return the sum of the digits in a string
    public static int sumOfDigits(String str) {
        int sum = 0;
        // Iterate through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // Check if the character is a digit
            if (Character.isDigit(ch)) {
                // Convert the character to its numeric value and add it to the sum
                sum += Character.getNumericValue(ch);
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        //basically 2+1+5+3= 11
        String str = "12 java 5 apple 3";
        int sum = sumOfDigits(str);
        System.out.println("Sum of digits in the string: " + sum);
    }
}