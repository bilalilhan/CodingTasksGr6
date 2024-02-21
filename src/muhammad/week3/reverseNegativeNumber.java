package muhammad.week3;

public class reverseNegativeNumber {
    //Write a return method that can reverse digits of a negative number and return it as int
    //input: -35  output: -53

    public static void main(String[] args) {
        int input = -35; // Input number to be reversed.
        int reversed = reverseNegativeNumber(input); // Reversing the input number.
        System.out.println("Reversed: " + reversed); // Printing the reversed number, expected output is -53.
    }

    /**
     * This method reverses the digits of a given number. If the number is negative,
     * it handles the sign appropriately to ensure the reversed number remains negative.
     *
     * @param num The number to reverse.
     * @return The reversed number, preserving the sign if negative.
     */
    public static int reverseNegativeNumber(int num) {
        // Check if the number is negative.
        if (num < 0) {
            // Convert the number to positive for reversing and then
            // convert back to negative by prepending a minus sign.
            return -reverseNumber(-num);
        } else {
            // If the number is not negative, directly reverse it.
            return reverseNumber(num);
        }
    }

    /**
     * Reverses the digits of a positive number.
     *
     * @param num The positive number to reverse.
     * @return The reversed number.
     */
    public static int reverseNumber(int num) {
        int reversed = 0; // This will hold the reversed number.

        // Continue until there are no more digits left.
        while (num != 0) {
            int digit = num % 10; // Extract the last digit of the number.
            reversed = reversed * 10 + digit; // Append the digit to the reversed number.
            num /= 10; // Remove the last digit from the original number.
        }

        return reversed; // Return the reversed number.
    }
    }


