package Homework7;
import java.util.Scanner;
public class Arithmetics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть перше значення");
        int firstnumb = sc.nextInt();
        System.out.println("Введіть друге значення");
        int secondnumb = sc.nextInt();
        int sum = sum(firstnumb, secondnumb);
        System.out.println("Додавання = " + sum);
        int sub = sub(firstnumb, secondnumb);
        System.out.println("Віднімання = " + sub);
        int mul = mul(firstnumb, secondnumb);
        System.out.println("Множення = " + mul);
        if (secondnumb == 0) {
            System.out.println("На нуль ділити не можна");
        } else {
            double div = div(firstnumb, secondnumb);
            System.out.println("Ділення = " + div);
        }
    }

    public static int sum(int a, int b) {
        return a + b;
    }


    public static int sub(int a, int b) {
        return a - b;
    }

    public static int mul(int a, int b) {
        return a * b;
    }

    public static int div(int a, int b) {
        return a / b;
    }
}

