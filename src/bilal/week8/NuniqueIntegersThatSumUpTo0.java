package bilal.week8;


public class NuniqueIntegersThatSumUpTo0 {
    /*Write a function:
    that, given an integer N (1 < N < 100), returns an array containing N unique integers that sum up to 0.
    The function can return any such array. For example, given N = 4, the function could return [1,0, -3,2] or [-2,1, -4,5].
    The answer [1, -1,1,3] would be incorrect (because value 1 occurs twice).
    For N = 3 one of the possible answers is [-1,0,1]  (but there are many more correct answers).*/


    public static void main(String[] args) {
        int N = 20;
        int[] result = generateArraySumToZero(N);
        for (int each : result) {
            System.out.print(each + " ");
        }


    }

    public static int[] generateArraySumToZero(int N) {
        if (N <= 1 || N >= 100) {
            throw new IllegalArgumentException("Invalid input: N should be in the range 1 < N < 100");
        }

        int[] result = new int[N];
        int sum = 0;

        // Fill the array with consecutive integers from 1 to N-1
        for (int i = 0; i < N - 1; i++) {
            result[i] = i *(i-3)*(4-i)*(i+7);// this formula given by randomly >>>> Should it  be anything ????(?)
            // it should have repetitive numbers

            sum += result[i];
        }

        // Calculate the last element to ensure the sum is zero
        result[N - 1] = -sum;

        return result;
    }


}