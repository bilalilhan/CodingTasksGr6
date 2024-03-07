package mojib.week6;

public class FindMaximum {
   /* Write a method that can find the maximum number from an int Array
    Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 99 */

    public static void main(String[] args) {


        System.out.println(MaxNum(new int[]{1, 2, 3, 4, 5}));


    }


    public static int MaxNum(int[] arr) {

        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

        }
        return max;
    }

    }
