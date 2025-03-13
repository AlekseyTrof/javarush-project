package com.javarush.task.pro.task17.task1708;

/* 
Минимальное и максимальное
*/

public class MinMaxUtil {
    //напишите тут ваш код
    public static int min(int a, int c) {
        if (a < c) {
            return a;
        } else {
            return c;
        }
    }
    public static int min(int a, int b, int d) {
        if (a < b && a < d) {
            return a;
        } else if (b < a && b < d) {
            return b;
        } else {
            return d;
        }
    }
    public static int min(int a, int b, int d, int c) {
        if (a < b && a < d && a < c) {
            return a;
        } else if (b < a && b < d && b < c) {
            return b;
        } else if (d < a && d < b && d < c) {
            return d;
        } else {
            return c;
        }
    }
    public static int min(int a, int b, int d, int c, int i) {
        if (a < b && a < d && a < c && a < i) {
            return a;
        } else if (b < a && b < d && b < c && b < i) {
            return b;
        } else if (d < a && d < b && d < c && d < i) {
            return d;
        } else if (c < a && c < b && c < d && c < i) {
            return c;
        } else {
            return i;
        }
    }

    public static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
    public static int max(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else if (b > a && b > c) {
            return b;
        } else {
            return c;
        }
    }
    public static int max(int a, int b, int c, int d) {
        if (a > b && a > c && a > d) {
            return a;
        } else if (b > a && b > c && b > d) {
            return b;
        } else if (c > a && c > b && c > d) {
            return c;
        } else {
            return d;
        }
    }
    public static int max(int a, int b, int c, int d, int i) {
        if (a > b && a > c && a > d && a > i) {
            return a;
        } else if (b > a && b > c && b > d && b > i) {
            return b;
        } else if (c > a && c > b && c > d && c > i) {
            return c;
        } else if (d > a && d > b && d > c && d > i) {
            return d;
        } else {
            return i;
        }
    }
}
