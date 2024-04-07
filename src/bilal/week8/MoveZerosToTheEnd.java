package bilal.week8;


import java.util.Arrays;

public class MoveZerosToTheEnd {
    /*Write a method that can move all the zeros to  last indexes of the array (Do Not Use Sort Method)
    Ex:
    input:  {1,0,2,0,3,0,4,0};
    output: [1, 2, 3, 4, 0, 0, 0, 0]*/




    public static void main(String[] args) {
        int[] givenArray = {1, 0, 2, 0, 3, 0,4,0,120};
        int[] expectedArray = moveZerosToEnd(givenArray);
        System.out.println(Arrays.toString(expectedArray));
    }

    public static int[] moveZerosToEnd(int[] array) {
        int[] result = new int[array.length]; // Create a new array to hold the modified result
        int j = 0; // Index for the result array

        // Iterate through the input array
        for (int i = 0; i < array.length; i++) {
            // If the current element is not zero, copy it to the result array
            if (array[i] != 0) {
                result[j++] = array[i]; // Copy the non-zero element to the result array at position j, then increment j
            }
        }

        // Fill the remaining positions of the result array with zeros
        while (j < result.length) {
            result[j++] = 0; // Fill the remaining positions with zeros, then increment j
        }


        return result; // Return the modified array
    }



}