package mojib.week9;


import java.util.Arrays;

public class concat2Arrays {
    //Write a return method that can concatenate two arrays

    public static void main(String[] args) {

        String[]arr1={"AA","BB","CC","DD","EE"};
        String[]arr2={"ff","gg","HH"};


        System.out.println(Arrays.toString(concat2Arrays(arr1,arr2)) );

    }




    public static String[] concat2Arrays(String[]arr1, String[]arr2){
        String [] arr3= new String[arr1.length+arr2.length];
        // to make sure that the arr3 has the capacity of the first and the second arrays that is why we



        int k=0;  // k is here for the arr3's index numbers

        for (int i = 0; i < arr1.length; i++,k++) {  // i in this for loop is for the arr1 index numbers

            arr3[k]=arr1[i];
        }
        for (int i = 0; i < arr2.length; i++,k++) { //i in this for loop is for the arr2 index numbers

            arr3[k]= arr2[i];

        }
        return arr3;
    }
}