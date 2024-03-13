package mojib.week7;


public class arrayFindMinimum {
    // Write a method that can find the minimum  number from an int Array
    //Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 6

    public static int findMinNumber(int[] numbers) {
        int min = numbers[0]; // Assume the first number is the minimum

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i]; // Update the minimum if a smaller number is found
            }
        }

        return min;
    }



    public static void main(String[] args) {


        int[] numbers = {-1, 2, -9, -1, 8};
        int minimum = findMinNumber(numbers);
        System.out.println("The minimum number is: " + minimum);

        int[] arr = {99, 12, 23, 32, 44, 57, 6};
        System.out.println("findMinNumber(arr) = " + findMinNumber(arr));


    }

}