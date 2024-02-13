package bilal.week3;

import java.util.InputMismatchException;

public class reverseNegativeNumber {
    //Write a return method that can reverse digits of a negative number and return it as int
    //input: -35  output: -53

    public static void main(String[] args) {
        System.out.println(reverseTheNegativeNumber(-67543));// -34576

        System.out.println(reverseTheNegativeNumber(-100001)); // -100001

        System.out.println(reverseTheNegativeNumber(-35)); // -53

        System.out.println(reverseTheNegativeNumber(-5)); // -5

        System.out.println(reverseTheNegativeNumber(-500000)); // -5  ??? IS IT A BUG?

        // System.out.println(reverseTheNegativeNumber(0));  // InputMismatchException: Sorry, this method created for ONLY negative numbers

        // System.out.println(reverseTheNegativeNumber(234)); // InputMismatchException: Sorry, this method created for ONLY negative numbers

    }

    public static int reverseTheNegativeNumber (int number) {


        int reverse = 0;

        if (number>=0) {
            throw new InputMismatchException("Sorry, this method created for ONLY negative numbers");}
        // Thanks, Muhammed :)
        // It terminates the code during the run-time, "immediately" with Exception

        else  {
            number = -number;  // let's make number positive

            /*     Inside the while loop >>> I found it somewhere else (not my own code)!!!      */

            while (number != 0) //The loop continues as long as the variable "number" is not equal to 0.
            // loop iterates through each digit of the number until there are no digits left.
            {
                int remainder = number % 10; // gives the value of the last digit.(aka, remainder)
                reverse = (reverse * 10) + remainder;
                number /= 10;
            }


        }
        return (reverse)*(-1); // let's make number negative again  >>>> to get its first version

    }



}

