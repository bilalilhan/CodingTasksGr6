package filora.week1;

public class OddOrEven {
    /*Write  a method which can identify given number is even or odd
    Output ex:
    identify(5); ->"Odd"
    identify(6); ->"Even"*/
   public static void main(String[] args){
      oddOrEven(2);
      oddOrEven(3);
      oddOrEven(4);
      oddOrEven(7);
      }
      public static void oddOrEven(int n){
      if(n%2==0){
         System.out.println("even");}
      else{
         System.out.println("odd");
         }
   }
}
