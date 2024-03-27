package Vidya.week7;
/*
Write a method that can find the minimum  number from an int Array
Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 6*
*/

public class arrayFindMinimum {
    public static void main(String[] args) {
        int[] arr = {99, 12, 23, 32, 44, 57, 6};
        int[] arr1 = {99, 12, 3, 32, 44, 57, 6};
        int[] arr2 = {0, 12, 23, 32, 44, 57, 6};
        int[] arr3 = {78, 12, 23, 32, -44, 57, 6};

        minNum(arr);
        minNum(arr1);
        minNum(arr2);
        minNum(arr3);


    }

    public static void minNum(int[] arr)
    {
//
        int min= arr[0];

        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]<min)
            {
                min= arr[i];
            }
        }
        System.out.println(min);


    }




}