package Homework4;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int numb = num.nextInt();
        if (numb >= 0 & numb <= 14) {
            System.out.println("0-14");
        } else if (numb >= 15 & numb <= 35) {
            System.out.println("15-35");
        } else if (numb >= 36 & numb <= 50){
            System.out.println("36-50");
        } else if (numb >= 50 & numb <= 100){
            System.out.println("50-100");
        }else{
            System.out.println("ДАННЕ ЧИСЛО БІЛЬШЕ АБО МЕНШЕ ЗА ДІАПАЗОН ЧИСЕЛ :0-100");
        }

    }
}