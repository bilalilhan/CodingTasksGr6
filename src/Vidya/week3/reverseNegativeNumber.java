package Vidya.week3;

/*
//Write a return method that can reverse digits of a negative number and return it as int
//input: -35  output: -53
*/

public class reverseNegativeNumber {
    public static void main(String[] args) {
        System.out.println(rev(-65));
        System.out.println(rev(-748));
        System.out.println(rev(-9287));
        System.out.println(rev(67));

    }

    public static int rev(int num)
    {
        String str= String.valueOf(num);
        String str1= "";
        String str2= "";

        if(num==0 || num>=0)
        {
            System.err.println("Please enter a number less than 0");
            System.exit(1);
        }

        for(int i=str.length()-1; i>=0; i--)
        {
            str1+= str.charAt(i);
        }

        for(int i=0; i<=str1.length()-2; i++)
        {
            str2+= str1.charAt(i);
        }

        int str3= Integer.parseInt(str2);
        int str4= -str3;

        return str4;
    }

}

