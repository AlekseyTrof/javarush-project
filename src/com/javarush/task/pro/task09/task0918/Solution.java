package com.javarush.task.pro.task09.task0918;

/* 
Поработаем со StringBuilder
*/

public class Solution {
    public static void main(String[] args) {
        String string = "Учиться, учиться и еще раз учиться! ";

        System.out.println(addTo(string, new String[]{"Под ", "лежачий ", "камень ", "вода ", "не ", "течет"}));
        System.out.println(replace(string, ", ", 16, 27));
    }

    public static StringBuilder addTo(String string, String[] strings) {
        //напишите тут ваш код
        StringBuilder newString = new StringBuilder(string);
        for (int i = 0; i < strings.length; i++) {
            newString.append(strings[i]);
        }
        return newString;
    }

    public static StringBuilder replace(String string, String str, int start, int end) {
        //напишите тут ваш код
        StringBuilder newString = new StringBuilder(string);
        newString.replace(start, end, str);
        return newString;
    }
}
