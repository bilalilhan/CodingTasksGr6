package bilal.week6;

public class SumOfDigits {
    /*Write a method that can return the sum of the digits in a string
      Ex:  "12 java 5 apple 3"  ==>  20 */

    public static void main(String[] args) {

        String inputForDigits = "102 java 50 apple 3";  // expected >>> 1+0+2+5+0+3=11
        int sumDigits = sumOfDigits(inputForDigits);
        System.out.println("Sum of digits: " + sumDigits);


        System.out.println("----------------------------------------");


        String inputForNumbers = "102 java 50 apple 3";  // expected >>>102+50+3=155
        int sumNumbers = sumOfNumbers(inputForNumbers);
        System.out.println("Sum of numbers: " + sumNumbers);






    }

    public static int sumOfDigits(String input) {
        int sum = 0;

        // Iterate through each character in the string
        for (char ch : input.toCharArray()) {
            // Check if the character is a digit
            if (ch >= '0' && ch <= '9') {
                // Convert the character to its corresponding integer value and add it to the sum
                sum += ch - '0';  //funny
            }
        }

        return sum;
    }





    public static int sumOfNumbers(String input) {
        int sum = 0;
        int currentNumber = 0;

        // Iterate through each character in the string
        for (char ch : input.toCharArray()) {
            // Check if the character is a digit
            if (Character.isDigit(ch)) {
                // Construct the number by multiplying currentNumber by 10 and adding the new digit
                currentNumber = currentNumber * 10 + (ch - '0'); // funny
            } else {
                // If the character is not a digit, add the currentNumber to the sum and reset it
                sum += currentNumber;
                currentNumber = 0;
            }
        }

        // Add the last number to the sum
        sum += currentNumber;

        return sum;
    }

}
/*
ASCII Table

'0' is 48
'1' is 49
'2' is 50
.
.
.
.
'9' is 57
 */