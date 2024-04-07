package Vidya.week7;
/*
Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
Ex: int[] arr = {10, 9, 8, 7};
arr = Sort(arr); ==>{ 7, 8, 9, 10};
*/

import java.util.Arrays;

public class arraySortAscending {
    public static void main(String[] args) {
        ascEx1();
        ascEx2();
    }

    public static void ascEx1()
    {
        int[] arr = {10, 9, 8, 7};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void ascEx2()
    {
        int[] arr = {45, 5, 8, 1, 33, 98, 82};
        int temp= 0;
        for(int i=0; i<arr.length-1; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                if (arr[i] > arr[j])
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