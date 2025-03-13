package com.javarush.task.pro.task09.task0908;

import java.util.regex.Pattern;

/* 
Двоично-шестнадцатеричный конвертер
*/

public class Solution {

    public static void main(String[] args) {
        String binaryNumber = "100111010000";
        System.out.println("Двоичное число " + binaryNumber + " равно шестнадцатеричному числу " + toHex(binaryNumber));
        String hexNumber = "9d0";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно двоичному числу " + toBinary(hexNumber));
    }

    public static String toHex(String binaryNumber) {
        //напишите тут ваш код
//        if ((binaryNumber.length() % 4) != 0) {
//            if ((binaryNumber.length() % 4) == 3) {
//                binaryNumber = "0" + binaryNumber;
//            } else if ((binaryNumber.length() % 4) == 2) {
//                binaryNumber = "00" + binaryNumber;
//            } else if ((binaryNumber.length() % 4) == 1) {
//                binaryNumber = "000" + binaryNumber;
//            }
//        }
//        if (binaryNumber == null) {
//            return null;
//        }
//        String toBinary = "";
//
        return binaryNumber;
    }

    public static String toBinary(String hexNumber) {
        //напишите тут ваш код
        return null;
    }
}
