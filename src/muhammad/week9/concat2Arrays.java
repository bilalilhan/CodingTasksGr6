package muhammad.week9;


public class concat2Arrays {
    //Write a return method that can concatenate two arrays
    public static void main(String[] args) {
        // Example usage
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        int[] result = concatenateArrays(arr1, arr2);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    // Method to concatenate two integer arrays
    public static int[] concatenateArrays(int[] arr1, int[] arr2) {
        // Calculate total length of the concatenated array
        int totalLength = arr1.length + arr2.length;

        // Create a new array with the total length
        int[] result = new int[totalLength];

        // Copy elements of the first array (arr1) to the result array
        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i];
        }

        // Copy elements of the second array (arr2) to the result array
        for (int i = 0; i < arr2.length; i++) {
            result[arr1.length + i] = arr2[i];
        }

        // Return the concatenated array
        return result;
    }
}