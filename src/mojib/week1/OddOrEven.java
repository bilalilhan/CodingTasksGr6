package mojib.week1;

public class OddOrEven {
    /*Write  a method which can identify given number is even or odd
    Output ex:
    identify(5); ->"Odd"
    identify(6); ->"Even"*/


        public static void OddOrEvenMethod(int number){
            if (number %2 ==0){
                System.out.println(number+ " is an Even number ");
            }else {
                System.out.println(number+ " is an Odd number ");
            }
        }
    public static void main(String[] args) {


OddOrEvenMethod(5);

    }
}
