package com.javarush.task.pro.task10.task1016;

/* 
Прогноз погоды
*/

import java.sql.SQLOutput;

public class Solution {

    public static void showWeather(City city) {
        //напишите тут ваш код
        System.out.println("В городе " + city.getName() + " сегодня температура воздуха " + city.getTemperature());
    }

    public static void main(String[] args) {
        //напишите тут ваш код
        City dubay = new City("Дубай", 40);
        showWeather(dubay);
    }
}
