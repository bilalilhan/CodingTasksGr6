package mojib.week7;


import java.util.Arrays;

public class arraySortDescending {
  /*Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
    Ex: int[] arr = {10,20,7, 8, 90};
    arr = Sort(arr); ==> {90, 20, 10, 8, 7};*/


    public static int[] sortArrayDescending(int[] numbers) {
        int n = numbers.length;

        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;

            // Find the index of the largest element in the unsorted part of the array
            for (int j = i + 1; j < n; j++) {
                if (numbers[j] > numbers[maxIndex]) {
                    maxIndex = j;
                }
            }

            // Swap the largest element with the first element in the unsorted part of the array
            int temp = numbers[maxIndex];
            numbers[maxIndex] = numbers[i];
            numbers[i] = temp;
        }

        return numbers;
    }


    public static void main(String[] args) {


        int[] numbers = {10, 20, 7, 8, 90};

        System.out.println("\n Unsorted array : " + Arrays.toString(numbers) + "\n");
        int[] sortedNumbers = sortArrayDescending(numbers);

        System.out.println("Sorted Array: "+Arrays.toString(numbers));
    }


}






