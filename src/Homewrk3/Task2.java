package Homewrk3;

import java.util.Scanner;

public class Task2 {
    public static void main (String [] args) {
        System.out.println("Введите число x y z "  );
        Scanner input = new Scanner(System.in);
        double x = input.nextInt();
        double c = input.nextInt();
        double y = input.nextInt();
        double m = (x+c+y)/3;
        System.out.println(m);


    }
}
