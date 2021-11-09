package Homework7;
import java.util.Scanner;
public class Conversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String valuta1 = "USD";
        String valuta2 = "EURO";
        System.out.println("Курс  USD = 26,2; EURO = 30,5");
        System.out.println("Введіть валюту яка вась цікавить:");
        String valuta = sc.nextLine();
        System.out.println("Введіть сумму яка вам необхідна:");
        int summa = sc.nextInt();
        if (valuta.equals(valuta1)) {
            double sum = summa * 26.2;
            System.out.println("З вас " + sum + "UAH");
        } else if (valuta.equals(valuta2)) {
            double sum = summa * 31.5;
            System.out.println("З вас " + sum + "UAH");
        } else
            System.out.println("Ви вказали не вірну валюту");
    }

}
