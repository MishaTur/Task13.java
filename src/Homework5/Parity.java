package Homework5;

import java.util.Scanner;

public class Parity {
    public static void main(String[] args) {
        int num;
        System.out.println("Введіть число");
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        if (num % 2 == 0) {
            System.out.println("Ваше число парне");
        } else
            System.out.println("Ваше число не парне");


    }
}
