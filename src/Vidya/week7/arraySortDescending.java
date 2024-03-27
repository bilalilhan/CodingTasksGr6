package Vidya.week7;
/*
Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
Ex: int[] arr = {10,20,7, 8, 90};
arr = Sort(arr); ==> {90, 20, 10, 8, 7};
*/

import java.util.Arrays;
import java.util.Comparator;

public class arraySortDescending {
    public static void main(String[] args) {
        descEx1();
        descEx2();

    }

    public static void descEx1()
    {
        Integer[] arr = {10, 9, 8, 7};
        Arrays.sort(arr, Comparator.reverseOrder());
        System.out.println(Arrays.toString(arr));
    }

    public static void descEx2()
    {
        int[] arr = {45, 5, 8, 1, 33, 98, 82};
        int temp= 0;
        for(int i=0; i<arr.length-1; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                if (arr[i] < arr[j])
                {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
//                System.out.println(Arrays.toString(arr));
            }
        }
        System.out.println(Arrays.toString(arr));
    }






}