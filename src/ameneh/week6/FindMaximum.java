package ameneh.week6;

public class FindMaximum {
    /* Write a method that can find the maximum number from an int Array
     Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 99 */

    public static int findMax(int[] arr) {
        if (arr == null || arr.length == 0) return Integer.MIN_VALUE;

        int max = arr[0];
        for (int num : arr) {
            max = (num > max) ? num : max;
        }
        return max;
    }
    /*
        This method takes an array of integers (arr) as input and returns the maximum number in the array.
        It first checks if the array is null or empty.
        If so, it returns Integer.MIN_VALUE as a default value. Otherwise,
        it initializes a variable max with the first element of
        the array and iterates through the array to find the maximum value.
        */

    public static void main(String[] args) {
        int[] arr = {99, 12, 23, 32, 44, 57, 6};
        int maxNumber = findMax( arr );
        System.out.println( "Maximum number: " + maxNumber );
    }
    /*
    Inside the main method, an example integer array arr is declared and initialized. The findMax method is then called with this array, and the result is stored in the variable maxNumber. Finally, it prints the maximum number to the console using System.out.println.
    */
    //This output indicates that the maximum number in the given array {99, 12, 23, 32, 44, 57, 6} is 99.
}
