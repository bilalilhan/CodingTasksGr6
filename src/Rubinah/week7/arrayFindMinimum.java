package Rubinah.week7;


public class arrayFindMinimum {
    public static void main(String[] args) {

        int[] numbers ={99, 12, 23, 32, 44, 57, 6};

        int min =numbers[0]; //assume that first element is the min num

        for(int i= 1; i<numbers.length;i++){//i 1,2,3,4,5,6

            if(numbers[i] < min){//compares the element of the array with current min num

                min = numbers[i];//replace the current min num
            }
        }
        System.out.println("min ="+ min);

    }
    }
    // Write a method that can find the minimum  number from an int Array
    //Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 6



