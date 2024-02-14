package bilal.week3;

import java.util.InputMismatchException;

public class primeNumber {
     // Write a method that can check if a number is prime or not



    public static void main(String[] args) {

        System.out.println(isPrimeNumber(18)); //  false

        System.out.println(isPrimeNumber(97)); // true

        System.out.println(isPrimeNumber(2)); // true

        boolean r1= isPrimeNumber(1001);
        System.out.println("r1 = " + r1); // r1 = false

        System.out.println(isPrimeNumber(-45)); // .InputMismatchException: Number cannot be smaller than 2  : -45


    }


    public static boolean isPrimeNumber(int number) {

        //The smallest Prime number is 2;

        if (number <2) { throw new InputMismatchException("Number cannot be smaller than 2  : " + number);}

        // Thank you so much >>>> Muhammed  >>> last time you mentioned >>> use " throw " keyword >>> instead of
        //>>> System.exit(1);

        for(int j = 2; j < number; j++){
            if(number % j == 0){ // the "number" is divisible by another number, instead of ONLY 1 and itself >>>
                // >>> means >>> this "number" is NOT a Prime Number
                return false;
            }
        }
        return true;
    }

}



