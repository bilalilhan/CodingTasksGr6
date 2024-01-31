package Vidya.week1;

public class Finra {
    //Write a method which prints out the numbers from 1 to 30 but for numbers which are a multiple of 3,
    //print "FIN" instead of the number and
    //for numbers which are a multiple of 5, print "RA" instead of the number.
    //for numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number.
    public static void main(String[] args) {
//        finraEX1();
        System.out.println(finraEX2(20) +"\n");
//        System.out.println(finraEX3(20));

    }

    public static void finraEX1() //without return statement & arguments
    {
        for(int i=1; i<=30; i++)
        {
            if(i%3== 0 && i%5== 0)
            {
                System.out.println("FINRA");
            }
            else if(i%3== 0)
            {
                System.out.println("FIN");
            }
            else if(i%5== 0)
            {
                System.out.println("RA");
            }
            else
            {
                System.out.println(i);
            }
        }
    }

    public static String finraEX2(int maxNum) //with return statement and arguments
    {
/*
Note- I might as well do the iteration only up-till 30,
but, I declared maxNum so as not to keep iteration only to 30 but can be up-till any number as a suggestion
*/
        String result= "";
        int i;
        for(i=1; i<=maxNum; i++)
        {
            if(i%3== 0 && i%5== 0)
                result+= "FINRA ";

            else if(i%3== 0)
                result+= "FIN ";

            else if(i%5== 0)
                result+= "RA ";

            else
                result+= i +" ";
        }
        return result;
    }

    public static String finraEX3(int maxNum)
    {
/*
Note- I might as well do the iteration only up-till 30,
but, I declared maxNum so as not to keep iteration only to 30 but can be up-till any number as a suggestion
*/
        String result= "";
        int i;
        for(i=1; i<=maxNum; i++)
        {
            if(i%3== 0 && i%5== 0)
                result+= i +"- FINRA ";

            else if(i%3== 0)
                result+= i +"- FIN ";

            else if(i%5== 0)
                result+= i +"- RA ";

            else
                result+= i +" ";
        }
        return result;
    }



}
