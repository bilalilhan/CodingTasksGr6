package bilal.week10;


import java.util.Arrays;

public class arrayListSortDesc {
    //Write a method that can sort the ArrayList in descending order without using the sort method

    public static int[] sortDescendingOrder(int[] arr) {


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    //next four lines defines the swap two elements of array arr
                    // if arr[j] < arr[j + 1])
                    int temp = 0;
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        return arr;


    }

    public static void main(String[] args) {

        int[] myArray = {3, -1, 8, 3, 0, 9, 9};
        System.out.println("Sort array with descending order= " + Arrays.toString(sortDescendingOrder(myArray)));

    }

}