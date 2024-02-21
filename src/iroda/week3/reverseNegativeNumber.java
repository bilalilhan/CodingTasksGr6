package iroda.week3;

import ameneh.week3.ReverseNegativeNumber;

import java.util.Scanner;


public class reverseNegativeNumber {


    //Write a return method that can reverse digits of a negative number and return it as int
    //input: -35  output: -53


    public static int reverseNegativeNumber(int number) {
        boolean isNegative = number < 0 ? true : false;
        if (isNegative) {
            number = number * -1;
        }
        int reverse = 0;
        if (isNegative) {
            number = reverse * -1;

        }
        return reverse;
    }

    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();

    }
}

