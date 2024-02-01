package bilal.week1;

public class DivisionWithoutOperator {
    //Write a method that can divide two numbers without using division

    public static void main(String[] args) {


        divides(6,3);
        divides(4,2);
        divides(3,0);
        divides(0,2);
        divides(498,3);
       divides(-23,5); // -23 divided by 5 is: 0 and remainder is -23
        divides(2,5);
        divides(-5,-23); // -5 divided by -23 is: 93368855 and remainder is -
        divides(30,-3); // 30 divided by -3 is: 715827873 and remainder is -2147483647

    }

    public static void divides(int num1, int num2) {
        if (num1<0 || num2<0) { // added 1 more if statement
            System.err.println("Invalid enter : Please enter positive numbers only");
            System.exit(1);
        }
        if(num2==0) {
            System.out.println("Invalid Number");
            return;
        }
        System.out.print(num1 +" divided by "+num2 +" is: ");
        int count =0;
        while(num1 >= num2) {
            num1 -= num2;
            count++;
        }
        System.out.println(count+" and remainder is "+num1);
    }





}
