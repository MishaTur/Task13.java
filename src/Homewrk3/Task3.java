package Homewrk3;

import java.util.Scanner;

public class Task3 {
    public static void main(String [] args){
        System.out.println("Введите радиус круга "  );
        Scanner input = new Scanner(System.in);
        int r = input.nextInt();
        double p = 3.14159;
        double s = p*r*r;
        System.out.println("S =  ");
        System.out.println(s);


    }
}
