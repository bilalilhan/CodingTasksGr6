package mojib.week9;


import java.util.ArrayList;
import java.util.Arrays;

public class RemoveSomeValues {
    //Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.

    public static void main(String[] args) {



        ArrayList<Integer> numbers=new ArrayList<>();

        numbers.addAll(Arrays.asList(100, 102, 93, 44, 501, 226,111,99,200));

        System.out.println("Original List = " + numbers);

        numbers.removeIf(eachNumber -> eachNumber>100);

        //            eachNumber is predicate
        //           -> this arrow token is Lambda expression
        //           and the third expression is the condition  since removeIf runs a loop internally

        System.out.println("New List  = " + numbers);


    }

}