package com.javarush.task.pro.task09.task0914;

/* 
Обновление пути
*/

public class Solution {
    public static void main(String[] args) {
        String path = "/usr/java/jdk1.8/bin/";

        String jdk13 = "jdk-13";
        System.out.println(changePath(path, jdk13));
    }

    public static String changePath(String path, String jdk) {
        //напишите тут ваш код

        int first = path.indexOf('/',  9);
        int last = path.indexOf('/', first + 1);
        String stringF = path.substring(0, first + 1);
        String stringL = path.substring(last);
        String x = stringF + jdk + stringL;
        return x;
    }
}
