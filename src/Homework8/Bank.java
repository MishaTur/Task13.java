package Homework8;

import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть сумму кредиту");
        sc = new Scanner(System.in);
        int kredit = sc.nextInt();
        System.out.println("Введіть сумму платежу");
        sc = new Scanner(System.in);
        int platezh = sc.nextInt();
        System.out.println("Введіть сумму платежу");
        sc = new Scanner(System.in);
        int platezh1 = sc.nextInt();
        System.out.println("Введіть сумму платежу");
        sc = new Scanner(System.in);
        int platezh2 = sc.nextInt();
        System.out.println("Введіть сумму платежу");
        sc = new Scanner(System.in);
        int platezh3 = sc.nextInt();
        System.out.println("Введіть сумму платежу");
        sc = new Scanner(System.in);
        int platezh4 = sc.nextInt();
        System.out.println("Введіть сумму платежу");
        sc = new Scanner(System.in);
        int platezh5 = sc.nextInt();
        System.out.println("Введіть останню сумму платежу");
        sc = new Scanner(System.in);
        int platezh6 = sc.nextInt();
        int summap = summap(platezh, platezh1, platezh2, platezh3, platezh4, platezh5, platezh6);
        int zadolk = zadelj(summap, kredit);
        int pereplata = pereolata(summap, kredit);
        if (kredit <= 0) {
            System.out.println("Некоректні дані");
        } else if (platezh < 0 || platezh1 < 0 || platezh2 < 0 || platezh3 < 0 || platezh4 < 0 || platezh5 < 0 || platezh6 < 0) {
            System.out.println("Данна операця некоректна");
        } else if (summap > kredit) {
            System.out.println("У вас відсутный борг!  Переплата  " + pereplata);
        } else {
            System.out.println("Залишилася заборгованість в розмірі " + zadolk);
        }


    }

    public static int zadelj(int kredit, int summap) {
        int zadolj = summap - kredit;
        return zadolj;
    }

    public static int pereolata(int summap, int kredit) {
        int pereplata = summap - kredit;
        return pereplata;

    }

    public static int summap(int platezh, int platezh1, int platez2, int platezh3, int platezh4, int platezh5, int platezh6) {
        int summap = platezh1 + platez2 + platezh3 + platezh + platezh4 + platezh5 + platezh6;
        return summap;
    }

}
