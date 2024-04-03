package Vidya.week9;
//Write a return method that can concatenate two arrays

import java.util.Arrays;

public class concat2Arrays {

    public static void main(String[] args) {
        String[] str1= {"Hello", "World", "Good", "Morning"};
        String[] str2= {"How", "Is", "You?"};
        System.out.println("Concatenated 2 string arrays : " +appendingStringArrays(str1, str2));

        int[] array1 = {1, 2, 3, 9, 23, 90};
        int[] array2 = {4, 5, 6};
        System.out.println("Concatenated 2 int arrays\t : " +appendingIntArrays1(array1, array2));
    }

    public static String appendingStringArrays(String[] str1, String[] str2) {
        StringBuilder sb= new StringBuilder();

        for (String str : str1) {
            sb.append(str).append(" ");
        }

        for (String str : str2) {
            sb.append(str).append(" ");
        }

        return sb.toString();
    }

    public static StringBuilder appendingIntArrays1(int[] array1, int[] array2) {

        StringBuilder sb = new StringBuilder();

        for (int num : array1) {
            sb.append(num).append(" ");
        }

        for (int num : array2) {
            sb.append(num).append(" ");
        }

        return sb;
    }

}