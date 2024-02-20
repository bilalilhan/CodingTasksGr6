package Vidya.week2;

/*
Swap two variable' values without using a third variable
*/
public class swapTwoNumbers {
    public static void main(String[] args) {
        swapping(45, 34);

    }

    public static void swapping(int num1, int num2)
    {
        System.out.println("Before swapping num1= " +num1 +" num2= " +num2);
        int num3=0;
        num3= num2;
        num2= num1;
        num1= num3;
        System.out.println("After swapping num1= " +num1 +" num2= " +num2);
    }
}
