package Homework5;

import java.util.Scanner;

public class Pencia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int age_male_max = 65;
        final int age_female_max = 60;
        final String male = "male";
        final String female = "female";
        System.out.println("Введіть ваш вік");
        int age = sc.nextInt();
        System.out.println("Введіть ваше ім*я");
        sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Введіть вашу стать");
        sc = new Scanner(System.in);
        String sex = sc.nextLine();
        if (sex.equals(female) && age_female_max > age) {
            System.out.println(name + " " + age + " " + "років" + " " + sex + " ." + "Ще необхідно попрацювати");
        } else if (sex.equals(male) && age_male_max > age) {
            System.out.println(name + " " + age + " " + "років" + " " + sex + " ." + "Ще необхідно попрацювати");
        } else
            System.out.println(name + " " + age + " " + "років" + " " + sex + ". " + "Пора на пенсію");


    }
}