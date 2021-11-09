package Homework9;


public class CustomerArray {
    public static void main(String[] args) {
        int[] numbers = {-10, 8, 9, 10, 11, 25};
        int max = numbers[0];
        double average = numbers[0];
        int min = numbers[0];
        int nech = numbers[0];
        double sum = 0;
        for (int j = 0; j < numbers.length; j++) {
            sum += numbers[j];
        }
        average = sum / numbers.length;


        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max)
                max = numbers[i];

        }
        for (int k = 1; k < numbers.length; k++) {
            if (numbers[k] < min)
                min = numbers[k];

        }


        System.out.println("Середнє арифметичне число данного массиву " + average);
        System.out.println("Максимальне число данного массиву " + max);
        System.out.println("Мінімальне число данного масиву " + min);
        System.out.println("Сумма числе данного масиву " + sum);

        for (int n = 0; n < numbers.length; n++) {
            if (numbers[n] % 2 != 0) {
                System.out.println(" Непарні числа данного масиву " + numbers[n]);
            }
        }


    }
}






