package com.javarush.task.pro.task05.task0505;

import java.util.Scanner;

/* 
Reverse
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            int[] numbers = new int[n];
            if (n > 0) {
                for (int i = 0; i < n; i++) {
                    numbers[i] = sc.nextInt();
                }
                if ((n % 2) == 0) {
                    for (int i = n - 1; i >= 0; i--) {
                        System.out.println(numbers[i]);
                    }
                } else {
                    for (int i = 0; i < n; i++) {
                        System.out.println(numbers[i]);
                    }
                }
            }
        } else {
            System.out.println("Введите другое число");
        }

    }
}