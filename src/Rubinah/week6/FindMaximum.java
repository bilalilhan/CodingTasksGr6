package Rubinah.week6;

public class FindMaximum {
    public static void main(String[] args) {

        int[] numbers ={99, 12, 23, 32, 44, 57, 6};

        int max =numbers[0]; //assume that first element is the max num

        for(int i= 1; i<numbers.length;i++){

            if(numbers[i] > max){//compares the element of the array with current max num

                max = numbers[i];//replace the current max num
            }
        }
        System.out.println("max ="+ max);
    }

    // int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 99 */
}
