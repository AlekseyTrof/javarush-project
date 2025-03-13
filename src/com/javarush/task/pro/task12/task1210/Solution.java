package com.javarush.task.pro.task12.task1210;

import java.util.ArrayList;

/* 
Переворачивание данных
*/

public class Solution {
    public static ArrayList<Integer> numbers = new ArrayList<>();

    public static void main(String[] args) {
        init();
        print();

        reverse();
        print();
    }

    public static void init() {
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }
    }

    public static void reverse() {
        ArrayList<Integer> numbersCopy = new ArrayList<>();
        for (int i = numbers.size() -1 ; i >= 0 ; i--) {
            numbersCopy.add(numbers.get(i));
        }
        numbers.clear();
        for (int i = 0; i < numbersCopy.size(); i++) {
            numbers.add(numbersCopy.get(i));
        }
    }

    private static void print() {
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
