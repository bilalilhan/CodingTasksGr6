package filora.week7;


import java.util.Arrays;

public class arraySortAscending {
    /*Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
        Ex: int[] arr = {10, 9, 8, 7};
        arr = Sort(arr); ==>{ 7, 8, 9, 10};*/
    public static void main(String[] args) {
       // Array of numbers including positive, negative, and zero
       int[] arr = {20, -5, 0, 3, -1};
       sortArrayAsc(arr); // Sorting the array in ascending order
       System.out.println(Arrays.toString(arr)); // Printing the sorted array
    }

   /**
    * Sorts an array in ascending order using the bubble sort algorithm.
    */
   public static void sortArrayAsc(int[] arr) {
      for (int i = 0; i < arr.length - 1; i++) {
         for (int j = 0; j < arr.length - i - 1; j++) {
            // Compare and swap elements if out of order
            if (arr[j] > arr[j + 1]) {
               int temp = arr[j];
               arr[j] = arr[j + 1];
               arr[j + 1] = temp;
            }
         }
      }
   }
}