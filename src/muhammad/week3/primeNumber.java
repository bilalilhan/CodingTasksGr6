package muhammad.week3;

public class primeNumber {
     // Write a method that can check if a number is prime or no


    public static void main(String[] args) {

        int num = 7;
        int count = 0;

        for (int i = 1; i <=num ; i++) {
            if (num % i == 0){
                count++;
            }
        }
        if (count==2){
            System.out.println("Prime");
        }else{
            System.err.println("not prime");;
        }


    }
}
