package Homework5;

public class LogicOperations {
    public static void main(String [] args){
        int x =5;
        int y =10;
        int z =15;
        x += y >> x++ * z;
        z = ++x & y * 5;
        y /= x + 5 | z;
        z = x++ & y * 5;
        x = y << x++ ^ z;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    } }
