package Vidya.week9;
//Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.

import java.util.ArrayList;

public class RemoveSomeValues {
    public static void main(String[] args) {
        try1();

    }

    public static void try1()
    {
        ArrayList<Integer> nums= new ArrayList<>();
        nums.add(2);
        nums.add(1135);
        nums.add(45);
        nums.add(82);
        nums.add(235);
        nums.add(99);
        nums.add(20);
        nums.add(100);
        nums.add(38);
        nums.add(74);
        nums.add(150);

        System.out.println(nums);

        nums.removeIf(p-> p>100);
        System.out.println(nums);
    }



}