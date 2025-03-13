package com.javarush.task.pro.task13.task1316;

public class Solution {

    public static void main(String[] args) {
        //напишите тут ваш код
        JavarushQuest[] rush = JavarushQuest.values();
        for (var x : rush) {
            System.out.println(x.ordinal());
        }
    }
}
