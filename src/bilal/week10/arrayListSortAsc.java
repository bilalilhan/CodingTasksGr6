package bilal.week10;


import java.util.Arrays;

public class arrayListSortAsc {
    //Write a method that can sort the ArrayList in Ascending order without using the sort method

    public static int[] sortAscendingOrder(int[] arr) {


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    //next four lines defines the swap two elements of array arr
                    // if arr[j] > arr[j + 1])
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

        int[] myArray = {3, -1, 8, 3, 0};
        System.out.println("Sort array with ascending order= " + Arrays.toString(sortAscendingOrder(myArray)));
    }


}