package Vidya.week1;

public class OddOrEven {
    /*Write  a method which can identify given number is even or odd
    Output ex:
    identify(5); ->"Odd"
    identify(6); ->"Even"*/
    public static void main(String[] args) {
        oddEven(78);
        oddEven(87);
        oddEven(-90);
    }

    public static void oddEven(int num)
    {
        if(num<0)
            System.out.println("Please enter a number greater than 0");
        else if(num%2== 0)
            System.out.println(num +" is Even");
        else
            System.out.println(num +" is Odd");
    }
}
