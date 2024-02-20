package burcu.week2;
public class divisibleBy3_5_15 {
    public static void main(String[] args) {
        StringBuilder divisibleBy15 = new StringBuilder("Divisible By 15 ");
        StringBuilder divisibleBy5 = new StringBuilder("Divisible By 5 ");
        StringBuilder divisibleBy3 = new StringBuilder("Divisible By 3 ");

        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0) {
                divisibleBy15.append(i).append(" ");
            } else if (i % 5 == 0) {
                divisibleBy5.append(i).append(" ");
            } else if (i % 3 == 0) {
                divisibleBy3.append(i).append(" ");
            }
        }

        System.out.println(divisibleBy15);
        System.out.println(divisibleBy5);
        System.out.println(divisibleBy3);
    }
}
