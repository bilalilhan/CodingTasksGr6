package bilal.week2;
public class swapTwoNumbers {
    //Swap two variable' values without using a third variable
  // using temporary variable is easer than this way

    public static void main(String[] args) {



        // lets initialize two variables randomly, 'a' and 'b', with int values
        int a = 50;
        int b = 110;
        // end of the task >>>> expected result >>>>  a = 110 and b = 50




        // lets print the values before we are swapping them;
        System.out.println("Before we are swapping: a = " + a + ", b = " + b);



        a = a + b; // means >>>  a = a + b;  >>> do not think "=" as a math operator ;)
        //we declare "a" as sum of a and b >>>> a = a + b


        b = a - b;//means >>>  b = ( a + b)- b  >>>   b = a .....expected result


        a = a - b; //  means >>> a =( a + b ) - a >>> a = b .....expected result

        // lets print  after we are swapping
        System.out.println("After we are  swapping: a = " + a + ", b = " + b);
    }
}
