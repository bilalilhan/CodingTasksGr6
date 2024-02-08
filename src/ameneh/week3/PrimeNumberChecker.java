package ameneh.week3;

import java.util.Scanner;
public class PrimeNumberChecker {

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number:");

        int testNumber = scanner.nextInt();
        if (isPrime(testNumber)) {
            System.out.println(testNumber + " is a prime number.");
        } else {
            System.out.println(testNumber + " is not a prime number.");
        }
    }
}




/*
The program prompts the user to enter a number, and then it checks whether that number is prime or not. The scanner.nextInt() method reads an integer input from the user. This makes the program more dynamic and user-friendly.
* */