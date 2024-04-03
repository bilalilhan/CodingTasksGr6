package mojib.week9;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RemoveAhmed {
    /*Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....
    Write a java operation to remove all the names named Ahmed
    */

    public static void main(String[] args) {












        ArrayList<String> names=new ArrayList<>();

        names.addAll(Arrays.asList("Ahmed", "John", "Eric", "Ahmed", "Liza", "Emma", "Bob"));

        //            eachName is predicate
        //           -> this arrow token is Lambda expression
        //           and the third expression is the condition  since removeIf runs a loop internally

        names.removeIf( eachName -> eachName.equalsIgnoreCase("ahmed"));
        System.out.println(names);

        }

    }
