package com.javarush.task.pro.task13.task1309;

import java.util.HashMap;

/* 
Успеваемость студентов
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
        //напишите тут ваш код
        grades.put("Алексей Петров", 3.2);
        grades.put("Алексей Сидоров", 5.2);
        grades.put("Алексей Петро", 4.2);
        grades.put("Алексей Пет", 3.3);
        grades.put("Алексей П", 3.1);
    }
}
