package mojib.week7;


import java.util.Arrays;

public class arraySortAscending {
    /*Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
        Ex: int[] arr = {10, 9, 8, 7};
        arr = Sort(arr); ==>{ 7, 8, 9, 10};*/




    public static int[] sortArrayAscending(int[] numbers) {
        int[] sortedArray = new int[numbers.length]; // Create a new array to store the sorted numbers (the size is the length of the given array)

        // Copy the original array into the new array
        for (int i = 0; i < numbers.length; i++) {
            sortedArray[i] = numbers[i];
        }

        // Use a simple sorting algorithm such as bubble sort
        for (int i = 0; i < sortedArray.length - 1; i++) {
            for (int j = 0; j < sortedArray.length - i - 1; j++) {
                if (sortedArray[j] > sortedArray[j + 1]) {
                    // Swap the elements if they are in the wrong order
                    int temp = sortedArray[j];
                    sortedArray[j] = sortedArray[j + 1];
                    sortedArray[j + 1] = temp;
                }
            }
        }

        return sortedArray;
    }

                public static void main (String[]args){

                    int[] numbers = {10,9,5,8,7};
                    System.out.println("Unsorted Array: "+ Arrays.toString(numbers));

                    int[] sortedNumbers = sortArrayAscending(numbers);

                    System.out.println("Sorted Array: "+ Arrays.toString(sortedNumbers));



            }


    }

