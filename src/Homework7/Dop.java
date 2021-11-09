package Homework7;

import java.util.Scanner;

public class Dop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть свою зп ");
        sc = new Scanner(System.in);
        int zp = sc.nextInt();
        System.out.println("Введіть свій залишок на кінець місяця");
        sc = new Scanner(System.in);
        int zalishok = sc.nextInt();
        System.out.println("На який термін кредит (Кількість місяців)");
        sc = new Scanner(System.in);
        int termin = sc.nextInt();
        System.out.println("Яка у вас прибавка до зарплати?");
        sc = new Scanner(System.in);
        int pribavka = sc.nextInt();
        System.out.println("Яка частота прибавки зарплати по місяцям");
        sc = new Scanner(System.in);
        int chastota = sc.nextInt();
        System.out.println("Сумма кредиту");
        sc = new Scanner(System.in);
        int sum = sc.nextInt();
        int kredit = kredit(termin, zalishok);
        int dod = dod(zalishok, sum);
        int dod2 = dod2(zalishok, termin);
        int dod3 = dod3(chastota, pribavka);
        if (termin <= 0 || zp <= 0 || zalishok < 0 || sum < 0 || pribavka < 0 || chastota < 0) {
            System.out.println("Умова нереальна");
        } else if (kredit + pribavka > sum) {
            System.out.println("Вітаємо ви можете отримати кредит " + sum);
        } else {
            System.out.println("Ви не можете отримати кредит, однак ви можете отримати кредит на більшу кількість місяців, а кокретніше на " + dod + "\nАбо ви можете зменшити сумму кредита до " + dod2 + "  і ви зможете погасити його в термін");
        }


    }

    public static int kredit(int zalishok, int termin) {
        int k = zalishok * termin;
        return k;
    }

    public static int dod(int zalishok, int sum) {
        int dod = sum / zalishok;
        return dod;
    }

    public static int dod2(int zalishok, int termin) {
        int dod2 = zalishok * termin;
        return dod2;
    }

    public static int dod3(int chastota, int pribavka) {
        int dod3 = pribavka / chastota;
        return dod3;
    }


}

