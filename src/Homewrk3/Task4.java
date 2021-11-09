package Homewrk3;

import java.util.Scanner;
      public class Task4 {
      public static void main(String [] args){
        System.out.println("Введите радиус круга "  );
        System.out.println("Введите высоту цилиндра  "  );
        Scanner input = new Scanner(System.in);
        int r = input.nextInt();
        int h = input.nextInt();
        double p = 3.14159;
        double v = p*r*r*h;
        double s = (2*p*r*r)+(2*p*r*r);
        System.out.println("v =  ");
        System.out.println("s =  ");
        System.out.println(v);
        System.out.println(s);}
}
