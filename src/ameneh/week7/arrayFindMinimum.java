package ameneh.week7;


public class arrayFindMinimum {
    // Write a method that can find the minimum number from an int Array
    //Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 6

    public static int findMinimum(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException( "Array is empty or null" );
        }

        int min = arr[0]; // Assume the first element is the minimum

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i]; // Update min if a current element is smaller
            }
        }

        return min;
    }

    public static void main(String[] args) {
        int[] arr = {99, 12, 23, 32, 44, 57, 6};
        int min = findMinimum( arr );
        System.out.println( "Minimum number: " + min );
    }
}
