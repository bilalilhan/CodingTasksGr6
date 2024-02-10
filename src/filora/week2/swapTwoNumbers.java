public class swapTwoNumbers {
   //Swap two variable values without using a third variable
   public static void main(String[] args) {

      //Original logic
      int a = 1;
      int b = 2;

      System.out.println("\nBefore swapping: a= " + a + " and b= " + b);

      //logic for swap
      a = a+b; //a now becomes 3 after adding a+b = new 'a'
      b = a-b; //b now becomes 1 after subtracting a-b = new 'b'
      a = a-b; //a now becomes 2 after subtracting a-b = new 'a'

      System.out.println("After swapping: a= " + a + " and b= " + b);


   }
}
