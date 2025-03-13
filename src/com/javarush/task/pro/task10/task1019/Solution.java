package com.javarush.task.pro.task10.task1019;

import java.util.Calendar;

/* 
Текущий год
*/

public class Solution {

    private int currentYear;

    public Solution() {
        int year = Calendar.getInstance().get(Calendar.YEAR);
        this.currentYear = year;
    }

    public int getCurrentYear() {
        return currentYear;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.getCurrentYear());
    }
}
