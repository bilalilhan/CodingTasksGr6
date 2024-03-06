package muhammad.week6;

public class FindMaximum {
   /* Write a method that can find the maximum number from an int Array
    Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 99 */

    public static void main(String[] args) {
        // Sample integer array
        int[] arr = {99, 12, 23, 32, 44, 57, 6};
        // Call the findMax method to find the maximum number in the array
        int max = findMax(arr);
        // Print the maximum number
        System.out.println("Maximum number in the array: " + max);
    }


    // Method to find the maximum number in an integer array
    public static int findMax(int[] arr) {
        // Check if the array is null or empty
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }
        // Initialize the maximum number with the first element of the array
        int max = arr[0];
        // Loop through the array starting from the second element
        for (int i = 1; i < arr.length; i++) {
            // If the current element is greater than the current maximum,
            // update the maximum to the current element
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        // Return the maximum number found in the array
        return max;
    }
}