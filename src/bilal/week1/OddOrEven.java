package bilal.week1;

public class OddOrEven {
    /*Write  a method which can identify given number is even or odd
    Output ex:
    identify(5); ->"Odd"
    identify(6); ->"Even"*/

    public static void main(String[] args) {


        identifyOddEven(5);
        identifyOddEven(6);
        identifyOddEven(0);
        identifyOddEven(-29);


    }

 /*   public  static  String  identifyOddEven1( int  n ) { //ternary operator
        return  n%2==0 ? "Even" : "odd" ;
    }*/

    public  static  void  identifyOddEven( int  n ) {
        if(n%2==0){
            System.out.println("even");}
        else{
            System.out.println("odd");}
    }

}
