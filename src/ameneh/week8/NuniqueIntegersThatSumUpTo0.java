package ameneh.week8;


import java.util.Arrays;

public class NuniqueIntegersThatSumUpTo0 {
    /*Write a function:
    that, given an integer N (1 < N < 100), returns an array containing N unique integers that sum up to 0.
    The function can return any such array. For example, given N = 4, the function could return [1,0, -3,2] or [-2,1, -4,5].
    The answer [1, -1,1,3] would be incorrect (because value 1 occurs twice).
    For N, =, 3, one of the possible answers is [-1,0,1] (but there are many more correct answers).*/

    public static void main(String[] args) {
        int N = 4;
        int[] result = uniqueIntegersSumUpToZero(N);
        System.out.println("Array of " + N + " unique integers that sum up to 0: " + Arrays.toString(result));
    }

        public static int[] uniqueIntegersSumUpToZero(int N) {
            if (N <= 1 || N >= 100) {
                throw new IllegalArgumentException("N must be between 1 and 99 (exclusive).");
            }

            int[] result = new int[N];
            int sum = 0;

            // For N odd, fill the array with N/2 positive and N/2 negative numbers
            // For N even, fill the array with (N-1)/2 positive and (N-1)/2 negative numbers and add 0
            for (int i = 0; i < N / 2; i++) {
                result[i] = (i + 1);
                result[N - 1 - i] = -(i + 1);
                sum += (i + 1) - (i + 1);
            }

            // For even N, add 0 at the middle
            if (N % 2 == 0) {
                result[N / 2] = 0;
            }

            return result;
        }
    }


