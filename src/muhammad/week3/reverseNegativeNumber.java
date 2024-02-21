package muhammad.week3;

public class reverseNegativeNumber {
    //Write a return method that can reverse digits of a negative number and return it as int
    //input: -35  output: -53

    public static void main(String[] args) {
        int input = -35;
        int reversed = reverseNegativeNumber(input);
        System.out.println("Reversed: " + reversed); // Output: -53
    }

    public static int reverseNegativeNumber(int num) {
        // Handle negative input
        if (num < 0) {
            // Convert the negative number to positive
            num *= -1;
            // Convert the reversed positive number to negative
            return -reverseNumber(num);
        } else {
            // If input is positive, simply reverse it
            return reverseNumber(num);
        }
    }

    public static int reverseNumber(int num) {
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }
}

