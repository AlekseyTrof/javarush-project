package com.javarush.task.pro.task12.task1205;

/* 
Метод деления
*/

public class Solution {

    public static void main(String[] args) {
        divide(1, 0);
        divide(-1, 0);
        divide(0, 0);
        divide(100, 20);
        divide(200, 20);
    }

    public static void divide(double a, double b) {
        //напишите тут ваш код
        double one = Double.POSITIVE_INFINITY;
        double two = Double.NEGATIVE_INFINITY;
        double three = Double.NaN;
        double result = a / b;
        if (a > 0 && b == 0 ||
                a == one && b >= 0 && b!= one ||
                a == two && b == 0 && b != two) {
            System.out.println(one);
        } else if (a < 0 && b == 0 ||
                a == one && b>= 0 && b != one ||
                a == one && b == 0 && b != two) {
            System.out.println(two);
        } else if (a == 0 && b == 0 ||
                Double.isNaN(a) ||
                Double.isNaN(b) ||
                a == one && b == one ||
                a == one && b == two ||
                a == two && b == one ||
                a == two && b == two) {
            System.out.println(three);
        } else {
            System.out.println(result);
        }
    }
}
