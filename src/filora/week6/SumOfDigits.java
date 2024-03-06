package filora.week6;

public class SumOfDigits {
    /*Write a method that can return the sum of the digits in a string
      Ex:  "12 java 5 apple 3"  ==>  20 */

   public static void main(String[] args) {
      System.out.println("Sum of individual digits: " + sumOfDigits("12java 5apple 3 .")); // 11
      System.out.println("Sum of whole numbers: " + getSumOfNumbers("12java 5apple 3 .")); // 20
   }

   // Sum individual digits
   public static int sumOfDigits(String str) {
      int total = 0;
      for (char each : str.toCharArray()) {
         if (Character.isDigit(each)) {
            total += each - '0'; // Directly convert char digit to its integer value
         }
      }
      return total;
   }

   // Sum whole numbers
   public static int getSumOfNumbers(String str) {
      int sum = 0;
      // Simplifying the replacement and splitting operation
      String[] numbers = str.replaceAll("\\D+", " ").trim().split("\\s+");
      for (String each : numbers) {
         if (!each.isEmpty()) { // Check is redundant because split("\\s+") ensures no empty strings if there's a non-digit
            sum += Integer.parseInt(each);
         }
      }
      return sum;
   }
}