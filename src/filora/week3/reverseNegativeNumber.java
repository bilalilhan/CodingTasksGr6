package filora.week3;

public class reverseNegativeNumber {
    //Write a return method that can reverse digits of a negative number and return it as int
    //input: -35  output: -53

   public static void main(String[] args) {
      // Test input
      int number = -35;

      // Call the method to reverse variable -35
      int reversedNumber = reverseNegativeNumber(number);

      // Display/print the reversed number
      System.out.println("Reversed number: " + reversedNumber); // Output: -53
   }

   // Method to reverse a number, including negative numbers
   public static int reverseNegativeNumber(int num) {
      int reversed = 0; // Initialize the variable to store the reversed number

      // Loop until the original number becomes 0
      while (num != 0) {
         int digit = num % 10; // Extract the number on the right
         reversed = reversed * 10 + digit; // Add the digit to the reversed number
         num /= 10; // Move to the next digit by dividing the number by 10
      }

      // Return the reversed number, including the negative sign if present
      return reversed;
   }
}


