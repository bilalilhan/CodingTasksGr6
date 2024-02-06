package burcu.week1;

public class DivisionWithoutOperator {
    //Write a method that can divide two numbers without using division operator
    public static void main(String[] args) {

        divides(8,2);
        divides(9,3);
        divides(0,4);
        divides(5,0);
        divides(10,5);
        divides(-16,8);

    }

    public static void divides(int num1, int num2) {
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
        if(num1<0 || num2<0){
            System.err.println("Error! The number can not be negative!");
            System.exit(1);
        }
        System.out.println(count+" and remainder is "+num1);
    }
}
