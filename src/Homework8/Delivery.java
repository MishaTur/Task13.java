package Homework8;

public class Delivery {
    public static void main(String[] args) {
        int tochka = 5;
        int result = 1;
        do {
            result *= tochka;
            tochka -= 1;
        } while (tochka > 0);
        System.out.println(result);
    }
}
