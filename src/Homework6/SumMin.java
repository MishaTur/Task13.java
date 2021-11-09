package Homework6;

public class SumMin {
     public static void main(String [] args){
         int a = 0;
         int b = 10;
         int sum=0;
         for (int i = a+1; i < b; i++)
         {
             sum += i;
         }
         System.out.println("Сумма чисел  " + sum);
     }
}
