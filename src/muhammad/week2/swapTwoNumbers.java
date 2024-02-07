package muhammad.week2;
public class swapTwoNumbers {
    //Swap two variable' values without using a third variable
    public static void main(String[] args) {
// preparing to solve this task
        // added one more

        // Initialize variables a and b
        int a = 5;
        int b = 10;

        // Display the values of a and b before swapping
        System.out.println("Before swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Swap the values without using a third variable
        // Step 1: Add the values of a and b and assign the result to a
        a = a + b;  // New value of a is the sum of original a and b
        // Step 2: Subtract the original value of b from the updated value of a and assign the result to b
        b = a - b;  // New value of b is the difference between updated a and original b
        // Step 3: Subtract the updated value of b from the updated value of a and assign the result to a
        a = a - b;  // New value of a is the difference between updated a and updated b

        // Display the values of a and b after swapping
        System.out.println("\nAfter swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
// We initialize two integer variables a and b.
//We display the values of a and b before swapping.
//We swap the values of a and b without using a third variable by performing addition and subtraction operations.
//We display the values of a and b after swapping.
