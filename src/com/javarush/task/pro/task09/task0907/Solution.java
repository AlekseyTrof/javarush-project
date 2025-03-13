package com.javarush.task.pro.task09.task0907;

import javax.swing.*;
import java.util.regex.Pattern;

/* 
Шестнадцатеричный конвертер
*/

public class Solution {
    private static final String HEX = "0123456789abcdef";

    public static void main(String[] args) {
        int decimalNumber = 1256;
        System.out.println("Десятичное число " + decimalNumber + " равно шестнадцатеричному числу " + toHex(decimalNumber));
        String hexNumber = "4e8";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно десятичному числу " + toDecimal(hexNumber));
    }

    public static String toHex(int decimalNumber) {
        //напишите тут ваш код
        String x = "";
        char[] chare = new char[1];

        if (decimalNumber <= 0) {
            return x;
        }
        while (decimalNumber != 0) {
            int symbol = decimalNumber % 16;
            switch (symbol) {
                case 0 -> {
                    chare[0] = HEX.charAt(0) ;
                    break;
                }
                case 1 -> {
                    chare[0] = HEX.charAt(1) ;
                    break;
                }
                case 2 -> {
                    chare[0] = HEX.charAt(2);
                    break;
                }
                case 3 -> {
                    chare[0] = HEX.charAt(3);
                    break;
                }
                case 4 -> {
                    chare[0] = HEX.charAt(4);
                    break;
                }
                case 5 -> {
                    chare[0] = HEX.charAt(5);
                    break;
                }
                case 6 -> {
                    chare[0] = HEX.charAt(6);
                    break;
                }
                case 7 -> {
                    chare[0] = HEX.charAt(7);
                    break;
                }
                case 8 -> {
                    chare[0] = HEX.charAt(8);
                    break;
                }
                case 9 -> {
                    chare[0] = HEX.charAt(9);
                    break;
                }
                case 10 -> {
                    chare[0] = HEX.charAt(10);
                    break;
                }
                case 11 -> {
                    chare[0] = HEX.charAt(11);
                    break;
                }
                case 12 -> {
                    chare[0] = HEX.charAt(12);
                    break;
                }
                case 13 -> {
                    chare[0] = HEX.charAt(13);
                    break;
                }
                case 14 -> {
                    chare[0] = HEX.charAt(14);
                    break;
                }
                case 15 -> {
                    chare[0] = HEX.charAt(15);
                    break;
                }
            }
            x = chare[0] + x;
            decimalNumber = decimalNumber / 16;
        }
        return x;
    }

    public static int toDecimal(String hexNumber) {
        //напишите тут ваш код
        if (hexNumber == null) {
            return 0;
        }
        int x = 0;

        for (int i = 0; i < hexNumber.length(); i++) {
            int s = HEX.indexOf(hexNumber.charAt(i));
            x = 16 * x + HEX.indexOf(hexNumber.charAt(i));
        }
        return x;
    }
}
