package Homework4;

import java.util.Scanner;

public class Dop1 {
    public static void main(String[] args) {
        Scanner mis = new Scanner(System.in);
        int misc = mis.nextInt();
        if (misc == 1) {
            System.out.println("Cічень");
        }
        else if (misc == 2) {
            System.out.println("Лютий");
        }
        else if (misc == 3) {
            System.out.println("Березень");
        }
        else if (misc == 4) {
            System.out.println("Квітень");
        }
        else if (misc == 5) {
            System.out.println("Травень");
        }
        else if (misc == 6) {
            System.out.println("ЧЕрвень");
        }
        else if (misc == 7) {
            System.out.println("Липень");
        }
        else if (misc == 8) {
            System.out.println("Серепень");
        }
        else if (misc == 9) {
            System.out.println("Вересень");
        }
        else if (misc == 10) {
            System.out.println("Жовтень");
        }
        else if (misc == 11) {
            System.out.println("Листопад");
        }
        else if (misc == 12) {
            System.out.println("Грудень");
        }
        else {
            System.out.println("ТАКОГО МІСЯЦЯ НЕМАЄ");
        }
    }
}