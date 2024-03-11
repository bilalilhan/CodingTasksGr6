package bilal.week6;

public class FindMaximum {
   /* Write a method that can find the maximum number from an int Array
    Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 99 */



    public static void main(String[] args) {

        int[] array = {99, -23, 23, 32, 440, 57, 6};
        int maxNumber = findMaxNumber(array);
        System.out.println("Maximum number: " + maxNumber);

    }


    public static int findMaxNumber(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be empty or null.");
        }

        int max = arr[0]; // Set the initial maximum to the first element
        for (int i = 1; i < arr.length; i++) {
            // does not matter to start i=0 or i=1 they all give the same result
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

}
