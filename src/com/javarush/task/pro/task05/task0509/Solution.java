package com.javarush.task.pro.task05.task0509;

/* 
Таблица умножения
*/

import java.lang.invoke.MutableCallSite;
import java.util.Arrays;

public class Solution {

    public static int[][] MULTIPLICATION_TABLE;

    public static void main(String[] args) {
        //напишите тут ваш код
        MULTIPLICATION_TABLE = new int[10][10];

        for (int i = 0; i < 10; i++) {
            MULTIPLICATION_TABLE[i][0] = i + 1;
            MULTIPLICATION_TABLE[0][i] = i + 1;
        }
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                MULTIPLICATION_TABLE[i][j] = MULTIPLICATION_TABLE[i][0] * MULTIPLICATION_TABLE[j][0];
            }
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(MULTIPLICATION_TABLE[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
