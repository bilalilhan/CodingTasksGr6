package filora.week3;

public class primeNumber{

      public static void main(String[] args) {
         int number = 19; // Change this number to check if it's prime

         // Print whether the number is prime or not using ternary operator
         System.out.println(number + (isPrime(number) ? " is" : " is not") + " a prime number.");
      }

      // Method to check if a number is prime or not
      public static boolean isPrime(int num) {
         // If the number is less than 2, it's not prime
         if (num < 2)
            return false;

         // Check for divisors from 2 up to the largest divisor, which is the number divided by 2
         // Iterate through each number from 2 to num / 2
         for (int i = 2; i <= num / 2; i++) {
            // If 'number' is divisible by 'i', it's not prime
            if (num % i == 0)
               return false;
         }
         // If 'num' is not divisible by any number from 2 up to half of its value, it's prime
         return true;
      }
   }


