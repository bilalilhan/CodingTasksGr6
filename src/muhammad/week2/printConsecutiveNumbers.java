package muhammad.week2;
public class printConsecutiveNumbers {
         /*  Write a function: that, given a positive integer N, prints the consecutive numbers from 1 to N,
      each on a separate line. However, any number divisible by 2, 3 or 5 should be replaced by the word Codility,
      Test or Coders respectively. If a number is divisible by more than one of the numbers: 2,3 or 5,
      it should be replaced by a concatenation of the respective words Codility, Test and Coders in this given order.
      For example, numbers divisible by both 2 and 3 should be replacée by CodilityTest and numbers divisible
      by all three numbers: 2,3 and 5, should be replaced by CodilityTestCoders.

        For example, here is the output for N = 24:
        1
        Codility
        Test
        Codility
        Coders
        CodilityTest
        7
        Codility
        Test
        Codi1ityCoders
        11
        CodilityTest
        13
        Codility
        TestCoders
        Codility
        17
*/

    public static void printNumbers(int N) {
        // Loop from 1 to N
        for (int i = 1; i <= N; i++) {
            // Initialize an empty string to store the output
            String output = "";

            // Check if the current number is divisible by 2
            if (i % 2 == 0) {
                output += "Codility"; // Append "Codility" to the output
            }

            // Check if the current number is divisible by 3
            if (i % 3 == 0) {
                output += "Test"; // Append "Test" to the output
            }

            // Check if the current number is divisible by 5
            if (i % 5 == 0) {
                output += "Coders"; // Append "Coders" to the output
            }

            // If the output is still empty, the number is not divisible by 2, 3, or 5
            if (output.isEmpty()) {
                System.out.println(i); // Print the original number
            } else {
                System.out.println(output); // Print the constructed output string
            }
        }
    }

    public static void main(String[] args) {
        printNumbers(24);
    }
}

// We loop from 1 to N.
//For each number, we check if it's divisible by 2, 3, or 5, and concatenate the corresponding string ("Codility", "Test", or "Coders") to the output string.
//If the output string is still empty after all checks, the number is not divisible by any of the specified numbers, so we print the original number.
//Otherwise, we print the constructed output string.
