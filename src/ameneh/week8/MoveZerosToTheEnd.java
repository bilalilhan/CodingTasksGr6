package ameneh.week8;


import java.util.Arrays;

public class MoveZerosToTheEnd {
    /*Write a method that can move all the zeros to last indexes of the array (Do Not Use Sort Method)
    Ex:
    input: {1,0,2,0,3,0,4,0};
    output: [1, 2, 3, 4, 0, 0, 0, 0]*/



    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 0, 3, 0, 4, 0};
        System.out.println( "Input: " + Arrays.toString( arr ) );
        moveZerosToEnd( arr );
        System.out.println( "Output: " + Arrays.toString( arr ) );
    }

    public static void moveZerosToEnd(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return; // No need to move zeros if array is null or has only one element
        }

        int index = 0; // Index to track the position to place non-zero elements

        // Traverse the array, move non-zero elements to the front
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index++] = arr[i]; // Move non-zero element to the front and increment index
            }
        }

        // Fill remaining indexes with zeros
        while (index < arr.length) {
            arr[index++] = 0;
        }
    }
}


