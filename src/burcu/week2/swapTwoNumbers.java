package burcu.week2;
public class swapTwoNumbers {
    //Swap two variable' values without using a third variable
    public static void main(String[] args) {

                int a = 10;
                int b = 15;

                // Swapping
                a = a + b;
                b = a - b;
                a = a - b;

                System.out.println("After swapping:");
                System.out.println("a = " + a);
                System.out.println("b = " + b);
            }
        }


