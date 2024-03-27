package Vidya.week8;

/*Write a method that can move all the zeros to  last indexes of the array (Do Not Use Sort Method)
Ex:
input:  {1,0,2,0,3,0,4,0};
output: [1, 2, 3, 4, 0, 0, 0, 0]*/

import java.util.ArrayList;
import java.util.Arrays;

public class MoveZerosToTheEnd {
    public static int lastindex;

    public static void main(String[] args) {

//        int[] a;
        moveZerosToLast(new int[]{1,0,2,0,3,0,4,0});


    }

    public static void moveZerosToLast(int[] a)
    {
//        int[] a= {1,0,2,0,3,0,4,0};
        ArrayList<Integer> b= new ArrayList<>();
        ArrayList<Integer> c= new ArrayList<>();

        for (int i=0; i<a.length; i++)
        {
            if(a[i]== 0)
            {
                b.add(a[i]);
            }
            else
            {
                c.add(a[i]);
            }
        }
        c.addAll(b);
        System.out.println(c);

    }

}