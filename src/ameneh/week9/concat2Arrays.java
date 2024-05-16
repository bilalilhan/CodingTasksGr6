package ameneh.week9;


import java.util.Arrays;

public class concat2Arrays {
    //Write a return method that can concatenate two arrays

    public static int[] concatenateArrays(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];

        // Copy elements from arr1 to result
        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i];
        }

        // Copy elements from arr2 to result
        for (int i = 0; i < arr2.length; i++) {
            result[arr1.length + i] = arr2[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};

        int[] concatenatedArray = concatenateArrays( arr1, arr2 );
        System.out.println( "Concatenated array: " + Arrays.toString( concatenatedArray ) );
    }
}

