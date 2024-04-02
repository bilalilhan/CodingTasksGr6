package filora.week7;


import java.util.Arrays;

public class arraySortDescending {
  /*Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
    Ex: int[] arr = {10,20,7, 8, 90};
    arr = Sort(arr); ==> {90, 20, 10, 8, 7};*/
  public static void main(String[] args) {
     // Sorting and displaying two different sets of numbers
     System.out.println(Arrays.toString(sortArrayDesc(new int[]{34, -2, 0, 19, -11, 5})));
     System.out.println(Arrays.toString(sortArrayDesc(new int[]{102, 3, -65, 54, 0, -205})));
  }

   // Uses selection sort to organize the array in descending order.
   public static int[] sortArrayDesc(int[] arr) {
      for (int i = 0; i < arr.length - 1; i++) {
         int maxIndex = i; // Assume first unsorted element is the max
         for (int j = i + 1; j < arr.length; j++) {
            // Update maxIndex if a larger element is found
            if (arr[j] > arr[maxIndex]) {
               maxIndex = j;
            }
         }
         // Swap the max element with the first unsorted position
         int temp = arr[i];
         arr[i] = arr[maxIndex];
         arr[maxIndex] = temp;
      }
      return arr;
   }
}