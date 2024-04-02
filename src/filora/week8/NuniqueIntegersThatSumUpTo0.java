package filora.week8;


import java.util.Arrays;

public class NuniqueIntegersThatSumUpTo0 {
    /*Write a function:
    that, given an integer N (1 < N < 100), returns an array containing N unique integers that sum up to 0.
    The function can return any such array. For example, given N = 4, the function could return [1,0, -3,2] or [-2,1, -4,5].
    The answer [1, -1,1,3] would be incorrect (because value 1 occurs twice).
    For N = 3 one of the possible answers is [-1,0,1]  (but there are many more correct answers).*/
   public static void main(String[] args) {
      // Generate and print an array for N = 6
      int[] array = Solution(6);
      System.out.println(Arrays.toString(array));
   }
   public static int[] Solution(int N) {
      int[] result = new int[N];
      int half = N / 2;

      for (int i = 0; i < half; i++) {
         result[i] = i + 1; // Positive integers
         result[i + half] = -(i + 1); // Corresponding negative integers
      }
      // If N is odd, add a zero in the middle to balance the sum
      if (N % 2 != 0) {
         result[N - 1] = 0;
      }
      return result;
   }
}